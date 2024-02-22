package ACT9_2B;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author srhig
 */
public abstract class ValidadorDispositius {
    private ArrayList<String> patrons = new ArrayList<>(Arrays.asList(null, null, null, null));
    public ValidadorDispositius(ArrayList<String> patrons){
        setPatrons(patrons);
    }
    abstract boolean validaPatrons(Object o);
    void setPatrons(ArrayList<String> patrons){
        setPatroCodiPin(patrons.get(0));
        setPatroTeclat(patrons.get(1));
        setPatroEmpremta(patrons.get(2));
        setPatroRostre(patrons.get(3));
    }
    //abstract void setPatrons(String patroCodiPin, String patroTeclat, String patroEmpremta, String patroRostre);
    public String getPatroCodiPin(){
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
    }
}