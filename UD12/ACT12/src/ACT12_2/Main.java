package ACT12_2;

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
        Map<String, String> tags = new HashMap<>();
        String linia, clau, valor;
        String[] parts;
        File arxiu = new File("/home/alumnat/Escriptori/temp/ACT12_2.html");
        try(BufferedReader lector = new BufferedReader(new FileReader(arxiu))){
            while((linia = lector.readLine()) != null){
                if(!(linia.trim().isEmpty() || linia.startsWith("<!")) || linia.startsWith("<input")){
                    parts = linia.split("<");
                    clau = parts[0];
                    valor = parts[1];
                    tags.put(clau, valor);
                    System.out.println(clau + " " + valor);
                }
            }
            for(String c : tags.keySet()){
                if(tags.get(c) == null){
                    for(String c2 : tags.keySet()){
                        boolean trobat = false;
                        if(c.equals(c2)){
                           if(trobat){
                               tags.replace(c, c2);
                               tags.remove(c2);
                           }
                           trobat = true;
                        }
                    }
                }
            }
        } 
        catch (FileNotFoundException e) {
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