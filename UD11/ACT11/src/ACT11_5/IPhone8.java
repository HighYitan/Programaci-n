package ACT11_5;
//import java.util.ArrayList;
import java.util.Map;
/**
 *
 * @author srhig
 */
public class IPhone8 extends Telefon{
    //private String patroCodiPin, patroEmpremta;
    public IPhone8(Map<TipusPatro, String> patrons, String marca, Persona persona){
        super(patrons, marca, persona);
        super.setOnOff(false);
    }
    /** Constructor sense patrons, a continuació utilizar 'setPatrons'
     * 
     * @param marca
     * @param persona 
     */
    /*public IPhone8(String marca, Persona persona) {
        super(marca, persona);
        super.setOnOff(false);
    }*/
}