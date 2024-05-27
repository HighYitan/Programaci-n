package ACT12_6;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author srhig
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String win = "C:\\Users\\srhig\\OneDrive\\Escritorio\\Grado Superior de Desarrollo de Aplicaciones Web\\Programming\\UD12\\temp\\ACT12_6.ser";
        String servidor = "jdbc:mysql://localhost:3306/";
        String bdades = "gbd";
        String usuari = "root";
        String passwd = "";
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT employee_id, first_name,last_name,email,phone_number,"
                   + "hire_date, job_title, salary, commission_pct,department_name "
                   + "FROM departments d, jobs j, employees e "
                   + "WHERE d.department_id = e.department_id "
                   + "AND j.job_id = e.job_id ORDER BY employee_id;"; //Añadí el ORDER BY para que salgan ordenados por id de empleado y quede más ordenada la lista.
        try(Connection connexio = DriverManager.getConnection(servidor+bdades, usuari, passwd);
            Statement statement = connexio.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);){
            while(resultSet.next()){
                Employee employee = new Employee(resultSet.getInt("employee_id"),
                                    resultSet.getString("first_name"),
                                    resultSet.getString("last_name"),
                                    resultSet.getString("email"),
                                    resultSet.getString("phone_number"),
                                    resultSet.getString("hire_date"),
                                    resultSet.getString("job_title"),
                                    resultSet.getDouble("salary"),
                                    resultSet.getDouble("commission_pct"),
                                    resultSet.getString("department_name"));
                employees.add(employee);
            }
            for (Employee e : employees) { // Iterar cada 'employee'
                e.setSalary(e.getSalary() * 1.10);
                System.out.println(e.toString());
            }
            try(FileOutputStream fos = new FileOutputStream(win); // Serialització
                ObjectOutputStream out = new ObjectOutputStream(fos)){
                out.writeObject(employees);
                /*for (Employee e : employees) { // Iterar cada 'employee'
                    System.out.println(e.toString());
                    //out.writeObject(e);
                }*/
            }
            catch(IOException e){
                System.err.println("Exception writing 'Empleats': " + e);
            }
            try(FileInputStream fis = new FileInputStream(win); // Deserialització
                ObjectInputStream in = new ObjectInputStream(fis)){
                System.out.println("Deserialización");
                //Employee newEmployee;
                List<Employee> newEmployees = new ArrayList<>();
                newEmployees = (List<Employee>) in.readObject();
                //System.out.println(newEmployees.toString());
                /*while((newEmployee = (Employee) in.readObject()) != null){
                    System.out.println(newEmployee.toString());
                }*/
                for(Employee e : newEmployees){ // Iterar cada 'employee'
                    System.out.println(e.toString());
                }
            }
            catch(ClassNotFoundException | IOException e){
                System.err.println("Exception reading 'Empleats': " + e.getMessage());
            }
            System.out.println("Connexió tancada.");
        }
        catch(SQLException e){
            System.err.println("Error al conectarse a la base de dades: " + e.getMessage());
        }
    }   
}