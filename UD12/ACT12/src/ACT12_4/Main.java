package ACT12_4;

//import java.sql.Connection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


public class Main {
    public static void main(String[] args) {
        String servidor = "jdbc:mysql://localhost:3306/";
        String bdades = "gbd";
        String usuari = "root";
        String passwd = "";
        String sql = "SELECT department_id, department_name FROM departments WHERE department_id = ?;";
        try(Connection connexio = DriverManager.getConnection(servidor+bdades, usuari, passwd);
        Statement statement = connexio.prepareStatement(sql)){
            
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}