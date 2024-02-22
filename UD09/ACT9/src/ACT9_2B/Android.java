package ACT9_2B;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author srhig
 */
public class Android extends Telefon{
    //private String patroCodiPin, patroTeclat, patroEmpremta;
    //private ArrayList<String> patrons = new ArrayList<>(Arrays.asList(null, null, null, null));
    public Android(ArrayList<String> patrons, String marca, Persona persona){
        super(patrons, marca, persona);
        super.setOnOff(false);
        /*setPatroCodiPin(patroCodiPin);
        setPatroTeclat(patroTeclat);
        setPatroEmpremta(patroEmpremta);*/
    }
    /** Constructor sense patrons, a continuació utilizar 'setPatrons'
     * 
     * @param marca
     * @param persona 
     */
    public Android(String marca, Persona persona) {
        super(marca, persona);
        super.setOnOff(false);
    }
}