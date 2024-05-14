package ACT12_4;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String servidor = "jdbc:mysql://localhost:3306/";
        String bdades = "gbd";
        String usuari = "root";
        String passwd = "";
        String sql = "SELECT department_id, department_name FROM departments WHERE department_id = ?";
        try(Connection connexio = DriverManager.getConnection(servidor+bdades, usuari, passwd);
        PreparedStatement statement = connexio.prepareStatement(sql)){
            statement.setInt(1, 80);
            try(ResultSet resultSet = statement.executeQuery()){ //Procesa el resultado de la query.
                System.out.println("ID\tNom del departament");
                while(resultSet.next()){
                    System.out.println(resultSet.getInt("department_id") + "\t" +
                                       resultSet.getString("department_name"));
                }
            }
            
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }
}