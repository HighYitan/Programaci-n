package ACT12_1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author alumnat
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        String win = "C:\\Users\\srhig\\OneDrive\\Escritorio\\Grado Superior de Desarrollo de Aplicaciones Web\\Programming\\UD12\\temp\\ACT12_1.cfg", lin = "/home/alumnat/Escriptori/Programming/UD12/temp/ACT12_1.cfg";
        //boolean trobat = false;
        //int contador = 0;
        File arxiu = new File(win);
        try(BufferedReader lector = new BufferedReader(new FileReader(arxiu))){
            /*String linia;
            while((linia = lector.readLine()) != null){
                if(!linia.trim().substring(0, 1).equals("#") && !(linia.isEmpty())){
                    String clau = linia.substring(0, linia.indexOf("=")).trim();
                    String valor = linia.substring(linia.indexOf("="), linia.length()).trim();
                    mapa.put(clau, valor);
                }
            }
            
            for(String c : mapa.keySet()){
                
                System.out.println(c + mapa.get(c));
            }
            */
            mapa = llegeixArxiu(lector); // Llegir el contingut línia a línia
            mostraVariables(mapa); // Mostrar el map
            if(comprovaVariables(mapa)){ // Comprovar la seva correctessa
                System.out.println("OK");
            }
            else{
                System.out.println("KO");   
            }      
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
    private static Map<String, String> llegeixArxiu(BufferedReader bufferedReader) throws IOException{
        Map<String, String> variables = new HashMap<>();
        String linia, clau, valor;
        String parts[];
        while((linia = bufferedReader.readLine()) != null){
            if(!(linia.startsWith("#")) && !(linia.isEmpty())){
                parts = linia.split("=");
                if(parts.length == 2){
                    clau = parts[0].trim();
                    valor = parts[1].trim();
                    variables.put(clau, valor);
                }
            }
        }
        return variables;
    }
    private static void mostraVariables(Map<String, String> variables){
        for(String k : variables.keySet()){
            String v = variables.get(k);
            System.out.println(k + "=" + v);
        }
    }
    private static boolean comprovaVariables(Map<String, String> variables){
        String[] valorsPossibles = {"address", "netmask", "dns_server", "interface", "gateway"};
        for(String v : valorsPossibles){
            if(variables.get(v) == null){
                return false;
            }
        }
        return true;
    }
}