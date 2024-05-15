package ACT12_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alumnat
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String win = "C:\\Users\\srhig\\OneDrive\\Escritorio\\Grado Superior de Desarrollo de Aplicaciones Web\\Programming\\UD12\\temp\\ACT12_5.cvs", lin = "/home/alumnat/Escriptori/Programming/UD12/temp/ACT12_5.cvs";
        String sqlWin = "C:\\Users\\srhig\\OneDrive\\Escritorio\\Grado Superior de Desarrollo de Aplicaciones Web\\Programming\\UD12\\temp\\mysql.con", sqlLin = "/home/alumnat/Escriptori/Programming/UD12/temp/mysql.con";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(sqlLin))){
            String linia;
            String[] parts = {"", "", "", ""};
            int indexInici, indexFinal = 0, contador = 0;
            while((linia = bufferedReader.readLine()) != null){
                indexInici = 0;
                if(!(linia.startsWith("#") || linia.isEmpty())){
                    indexInici = linia.indexOf("=", indexInici);
                    indexFinal = linia.length();
                    parts[contador++] = linia.substring(indexInici+2, indexFinal);
                    //contador++;
                }
                /*
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
            }
            String server = parts[0];
            String dbase = parts[1];
            String user = parts[2];
            String passwd = parts[3];
            System.out.println(server+dbase+user+passwd);
        }
        catch(FileNotFoundException e){
            System.err.println(e.getMessage());
        }
        catch(IOException e){
            System.err.println(e.getMessage());
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(lin))){
            
        }
        catch(FileNotFoundException e){
            System.err.println(e.getMessage());
        }
        catch(IOException e){
            System.err.println(e.getMessage());
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}