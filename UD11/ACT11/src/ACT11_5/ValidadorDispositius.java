package ACT11_5;
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Arrays;
import java.util.Map;
/**
 *
 * @author srhig
 */
public abstract class ValidadorDispositius {
    //private ArrayList<String> patrons = new ArrayList<>(Arrays.asList(null, null, null, null));
    private Map<TipusPatro, String> patrons = new HashMap<>();
    public ValidadorDispositius(Map<TipusPatro, String> patrons){
        this.patrons = patrons;
    }
    abstract boolean validaPatrons(Object o);
    public Map<TipusPatro, String> getPatrons(){
        return patrons;
    }
    /*public String getPatroCodiPin(){
        return patrons.get(0);
    }
    public String getPatroTeclat(){
        return patrons.get(1);
    }
    public String getPatroEmpremta(){
        return patrons.get(2);
    }
    public String getPatroRostre(){
        return patrons.get(3);
    }
    public void setPatroCodiPin(String patroCodiPin){
        patrons.set(0, patroCodiPin);
    }
    public void setPatroTeclat(String patroTeclat){
        patrons.set(1, patroTeclat);
    }
    public void setPatroEmpremta(String patroEmpremta){
        patrons.set(2, patroEmpremta);
    }
    public void setPatroRostre(String patroRostre){
        patrons.set(3, patroRostre);
    }*/
}