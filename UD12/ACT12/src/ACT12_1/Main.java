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
        boolean trobat = false;
        int contador = 0;
        File arxiu = new File("/home/alumnat/Escriptori/temp/ACT12_2.cfg");
        try(BufferedReader lector = new BufferedReader(new FileReader(arxiu))){
            String linia;
            while((linia = lector.readLine()) != null){
                if(!linia.trim().substring(0, 1).equals("#") && !(linia.isBlank())){
                    String clau = linia.substring(0, linia.indexOf("=")).trim();
                    String valor = linia.substring(linia.indexOf("="), linia.length()).trim();
                    /*String[] parts = linia.split("=");
                    
                    String clau = parts[0];
                    String valor = parts[1];
                    */
                    mapa.put(clau, valor);
                }
            }
            
            for(String c : mapa.keySet()){
                String[] claus = {"interface", "address", "netmask", "gateway", "dns_server", "dns_server"};
                if(claus[0].equals(c) && claus[1].equals(c))
                System.out.println(c + mapa.get(c));
            }
        }
        catch(FileNotFoundException e){
            System.err.println(e);
        }
        catch(IOException e){
            System.err.println(e);
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
    
}