package ACT12_4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author alumnat
 */
public class Main2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String servidor = "jdbc:mysql://localhost:3306/";
        String bdades = "gbd";
        String usuari = "root";
        String passwd = "";
        int departmentId = 80;
        String sql = "SELECT department_id, department_name FROM departments WHERE department_id = " + departmentId;
        try(Connection connexio = DriverManager.getConnection(servidor+bdades, usuari, passwd);
            Statement statement = connexio.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)){
            
            System.out.println("ID\tNom del departament");
            while(resultSet.next()){
                System.out.println(resultSet.getInt("department_id") + "\t" +
                                   resultSet.getString("department_name"));
            }
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }
}