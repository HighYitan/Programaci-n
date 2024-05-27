package ACT12_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alumnat
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String win = "C:\\Users\\srhig\\OneDrive\\Escritorio\\Grado Superior de Desarrollo de Aplicaciones Web\\Programming\\UD12\\temp\\ACT12_5.cvs", lin = "/home/alumnat/Escriptori/Programming/UD12/temp/ACT12_5.cvs";
        String sqlWin = "C:\\Users\\srhig\\OneDrive\\Escritorio\\Grado Superior de Desarrollo de Aplicaciones Web\\Programming\\UD12\\temp\\mysql.con", sqlLin = "/home/alumnat/Escriptori/Programming/UD12/temp/mysql.con";
        /*try(BufferedReader bufferedReader = new BufferedReader(new FileReader(sqlWin))){ //2ndo intento, falta abstracción
            String linia;
            String[] parts = {"", "", "", ""};
            int indexInici, indexFinal = 0, contador = 0;
            while((linia = bufferedReader.readLine()) != null){
                indexInici = 0;
                if(!(linia.startsWith("#") || linia.isEmpty())){
                    indexInici = linia.indexOf("=", indexInici);
                    indexFinal = linia.length();
                    parts[contador++] = linia.substring(indexInici+1, indexFinal).trim();
                    //contador++;
                }*/ 
                /* No es necesario los ifs 1er intento
                if(linia.startsWith("SERVER")){
                    indexInici = linia.indexOf("=", 0);
                    String server = linia.substring(indexInici, linia.length());
                }
                else if(linia.startsWith("DBASE")){
                    indexInici = linia.indexOf("=", 0);
                    String dbase = linia.substring(indexInici, linia.length());
                }
                else if(linia.startsWith("USER")){
                    indexInici = linia.indexOf("=", 0);
                    String user = linia.substring(indexInici, linia.length());                   
                }
                else if(linia.startsWith("PASSWD")){
                    indexInici = linia.indexOf("=", 0);
                    String passwd = linia.substring(indexInici, linia.length());
                }
                */
            /*} 2ndo intento falta abstracción.
            String server = parts[0];
            String dbase = parts[1];
            String user = parts[2];
            String passwd = parts[3];
            System.out.println(server+dbase+user+passwd);
        }*/
        try(Connection connexio = getConnectionFromFile(sqlWin)){
            System.out.println("Connexió establerta.");
            connexio.setAutoCommit(false);
            insertDepartmentsFromFile(connexio, win);
            System.out.println("Connexió tancada.");
        }
        catch(Exception e){
            System.err.println("S'ha produït l'error general: " + e.getMessage());
        }
    }
    public static Connection getConnectionFromFile(String sqlWin) throws SQLException, IOException{
        String servidor = "", bdades = "", usuari = "", passwd = "";
        try(BufferedReader reader = new BufferedReader(new FileReader(sqlWin))){
            String line;
            while((line = reader.readLine()) != null){
                try{
                    String[] parts = line.split("=");
                    String clau = parts[0].trim();
                    String valor = parts[1].trim();
                    switch(clau){
                        case "SERVER" -> servidor = valor;
                        case "DBASE" -> bdades = valor;
                        case "USER" -> usuari = valor;
                        case "PASSWD" -> passwd = valor;
                        default -> System.err.println("Clau no vàlida: " + clau);
                    }
                }
                catch(IndexOutOfBoundsException e){
                    // En cas de '#', l'split no fnciona
                    // No fer res                    
                }
            }
        }
        catch(IOException e){
            System.err.println("Error llegint l'arxiu: " + e.getMessage());
            throw e;
        }
        return DriverManager.getConnection(servidor+bdades, usuari, passwd);
    }
    public static void insertDepartmentsFromFile(Connection connexio, String win) throws SQLException, IOException{
        try(BufferedReader reader = new BufferedReader(new FileReader(win))){
            String line = reader.readLine();// Es descarta la primera línia
            while((line = reader.readLine()) != null){
                String[] parts = line.split(";");
                //int departmentId = Integer.parseInt(parts[0]);
                //String departmentName = parts[1];
                //int managerId = Integer.parseInt(parts[2]);
                //int locationId = Integer.parseInt(parts[3]);
                try{
                    if(!SQLCheckPK(connexio, "employees", Integer.parseInt(parts[2]))){ // Comprovar integritat referencial amb 'employees'
                        SQLInsert(connexio, "employees", parts[2], "S/D","S/D", "IT_PROG");
                    }
                    if(!SQLCheckPK(connexio, "locations", Integer.parseInt(parts[3]))){ // Comprovar integritat referencial amb 'locations'
                        SQLInsert(connexio, "locations", parts[3], "S/D");
                    }
                    SQLInsert(connexio, "departments", parts[0], parts[1], parts[2], parts[3]); // Insertar la fila a 'departments'
                    System.out.println("Insertant departament: " + parts[0]);
                    connexio.commit();
                }
                catch(SQLException e){
                    connexio.rollback();
                    System.err.println("Error executant la instrucció SQL: " + e.getMessage());
                }
            }
        }
        catch(IOException e){
            System.err.println("Error llegint l'arxiu: " + e.getMessage());
            throw e; // Es propaga l'excepció al mètode anterior
        }
    }
    private static void SQLInsert(Connection connexio, String table, String... valors) throws SQLException{
        String sql = "";
        PreparedStatement statement;
        // Cal millorar aquest mètode accedint al diccionari MySQL:
        //    - information_schema.tables:
        //    SELECT TABLE_NAME 
        //    FROM information_schema.TABLES 
        //    WHERE TABLE_SCHEMA = &&esquema
        //    AND   TABLE_NAME = &&tabla;
        //
        //    - information_schema.columns:
        //    SELECT COLUMN_NAME, DATA_TYPE, IS_NULLABLE, COLUMN_KEY, COLUMN_DEFAULT
        //    FROM information_schema.COLUMNS
        //    WHERE TABLE_SCHEMA = &&esquema
        //    AND   TABLE_NAME = &&tabla;
        try{
            if(table.equals("departments")){
                sql = "INSERT INTO departments (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID) VALUES (?, ?, ?, ?)";
                statement = connexio.prepareStatement(sql);
                statement.setInt(1, Integer.parseInt(valors[0]));
                statement.setString(2, valors[1]);
                statement.setInt(3, Integer.parseInt(valors[2]));
                statement.setInt(4, Integer.parseInt(valors[3]));
                statement.executeUpdate();
            }
            else if(table.equals("locations")){
                sql = "INSERT INTO locations (LOCATION_ID, CITY) VALUES (?, ?)";
                statement = connexio.prepareStatement(sql);
                statement.setInt(1, Integer.parseInt(valors[0]));
                statement.setString(2, valors[1]);
                statement.executeUpdate();
            }
            else if(table.equals("employees")){
                sql = "INSERT INTO employees (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, JOB_ID) VALUES (?, ?, ?, ?)";
                statement = connexio.prepareStatement(sql);
                statement.setInt(1, Integer.parseInt(valors[0]));
                statement.setString(2, valors[1]);
                statement.setString(3, valors[2]);
                statement.setInt(4, Integer.parseInt(valors[3]));
                statement.executeUpdate();
            }
        }
        catch(SQLException e){
            throw e;
        }
    }
    private static boolean SQLCheckPK(Connection connexio, String table, int primaryKey) throws SQLException{
        String sql = "";
        // Cal millorar aquest mètode accedint al diccionari MySQL
        try{
            if(table.equals("employees")){
                sql = "SELECT '1' FROM employees WHERE employee_id = ?";
            }
            else if(table.equals("locations")){
                sql = "SELECT '1' FROM locations WHERE location_id = ?";
            }
            PreparedStatement statement = connexio.prepareStatement(sql);
            statement.setInt(1, primaryKey);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next(); // si existeix al manco 1 fila ?
            
        }
        catch(SQLException e){
            throw new SQLException (e.getMessage() );
        }
    }
}