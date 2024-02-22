package ACT9_2A;
/**
 *
 * @author srhig
 */
public class IPhone8 extends Telefon{
    private String patroCodiPin, patroEmpremta;
    public IPhone8(String marca, Persona persona, boolean onOff, String patroCodiPin, String patroEmpremta){
        super(marca, persona, onOff);
        this.patroCodiPin = patroCodiPin;
        this.patroEmpremta = patroEmpremta;
    }
    /** Constructor sense patrons, a continuació utilizar 'setPatrons'
     * 
     * @param marca
     * @param persona 
     */
    public IPhone8(String marca, Persona persona) {
        super(marca, persona, false);
    }    
    @Override
    public boolean validaPatrons(Persona persona) {
        if (super.getOnOff()) {
            if (persona.getPatroCodiPin()!= null)
                return persona.getPatroCodiPin().equals(patroCodiPin);
            if (persona.getPatroEmpremta()!= null)
                return persona.getPatroEmpremta().equals(patroEmpremta);
            return false;
        } 
        else {
            System.out.println("Telèfon IPhone8 no encès");
            return false;
        }
    }
    @Override
    public void setPatrons(String patroCodiPin, String patroTeclat, String patroEmprempta, String patroRostre) {
        setPatroCodiPin(patroCodiPin);
        setPatroEmpremta(patroEmpremta);
    }
    public void setPatroCodiPin(String patroCodiPin) {
        this.patroCodiPin = patroCodiPin;
    }
    public void setPatroEmpremta(String patroEmpremta) {
        this.patroEmpremta = patroEmpremta;
    }
}