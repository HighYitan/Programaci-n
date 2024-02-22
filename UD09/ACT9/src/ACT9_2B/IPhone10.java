package ACT9_2B;
import java.util.ArrayList;
/**
 *
 * @author srhig
 */
public class IPhone10 extends IPhone8{
    //private String patroRostre;
    public IPhone10(ArrayList<String> patrons, String marca, Persona persona){
        super(patrons, marca, persona);
        setOnOff(false);
    }
    /** Constructor sense patrons, a continuació utilizar 'setPatrons'
     * 
     * @param marca
     * @param persona 
     */
    public IPhone10(String marca, Persona persona) {
        super(marca, persona);
        setOnOff(false);
    }
}