package ACT12_2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author alumnat
 */
public class MainB {
    /**
     * @param args the command line arguments
     */
    public static class ErrorFormatHTML extends Exception { 
        // Constructor
        public ErrorFormatHTML (String errorMessage) {
            super(errorMessage);
        }
    }
    public static void main(String[] args) {
        String win = "C:\\Users\\srhig\\OneDrive\\Escritorio\\Grado Superior de Desarrollo de Aplicaciones Web\\Programming\\UD12\\temp\\ACT12_2B.cfg", lin = "/home/alumnat/Escriptori/Programming/UD12/temp/ACT12_2B.cfg";
        try(BufferedReader br = new BufferedReader(new FileReader(win))){
            String linia, tag = "";
            int indexInici = 0, indexFinal;
            while((linia = br.readLine()) != null){
                indexInici = linia.trim().indexOf("<", indexInici);
                indexFinal = linia.indexOf(">", indexInici+1);
                if(indexInici == -1){
                    System.out.println(linia);
                }
                while(indexInici != -1 && indexFinal != -1){
                    tag = linia.substring(indexInici, indexFinal+1);
                    System.out.print(tag);
                    indexInici = indexFinal+1;
                    indexInici = linia.indexOf("<", indexInici);
                    indexFinal = linia.indexOf(">", indexInici+1);
                }
                System.out.println();    
                //System.out.println(tag);
            }
            System.out.println("HTML Ok");
        }
        catch(FileNotFoundException e){
            System.err.println(e.getMessage());
        }
        catch(IOException e){
            System.err.println("Error llegint l'arxiu: " + e.getMessage());
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }   
}