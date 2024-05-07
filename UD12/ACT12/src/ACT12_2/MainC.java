package ACT12_2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
/**
 *
 * @author alumnat
 */
public class MainC {
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
        Deque<String> tags = new LinkedList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(win))){
            String linia, tag;
            int indexInici = 0, indexFinal;
            while((linia = br.readLine()) != null){
                System.out.print(linia);
                while((indexInici = linia.indexOf("<", indexInici)) != -1) {
                    if((indexFinal = linia.indexOf(">", indexInici+1)) != -1){
                        tag = linia.substring(indexInici, indexFinal+1);
                        //System.out.print(tag);
                        analitzaTags(tags, tag);
                        indexInici = indexFinal+1;
                    }
                    else{
                        break;
                    }
                }
                System.out.println();
            }
            comprovaTags(tags);
            System.out.println("HTML Ok");
        }
        catch(ErrorFormatHTML e){
            System.out.println(e.getMessage());
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
    private static void analitzaTags(Deque<String> tags, String tag) {
        int indexMajor = tag.indexOf('>');
        int indexEspai = (tag.indexOf(' ')==-1 ? indexMajor : tag.indexOf(' '));
      
        String tagEntrada = tag.substring(0,Math.min(indexMajor,indexEspai));
        
        // tags no analitzables: '<!DOCTYPE>', '<input ...>'
        if (! (tagEntrada.startsWith("<input") | tagEntrada.startsWith("<!DOCTYPE")) )
            
            if (tagEntrada.startsWith("</")) {
                String tagSortida = tags.pop();
                //System.out.println("OUT " + tagEntrada + " abans " + tagSortida);
                
                if (tagSortida.substring(1,tagSortida.length()).equals(tagEntrada.substring(2,tagEntrada.length())))
                    System.out.println("Ordre OK " + tagSortida);
                else
                    System.out.println("Ordre KO");

            } 
            else {
                tags.push(tagEntrada);
                //System.out.println("IN " + tagEntrada);
            }
    }
    private static void comprovaTags(Deque<String> tags) throws ErrorFormatHTML {
        if (tags.size() != 0) {
            for (String s:tags) 
                System.out.println(s);

            throw new ErrorFormatHTML("HTML amb format incorrecte");
        }
    }
}