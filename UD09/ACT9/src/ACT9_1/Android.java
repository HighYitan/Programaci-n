package ACT9_1;
/**
 *
 * @author srhig
 */
public class Android extends Telefon implements ValidadorDispositius{
    private String patroCodiPin, patroTeclat, patroEmpremta;
    public Android(String marca, Persona persona, boolean onOff, String patroCodiPin, String patroTeclat, String patroEmpremta){
        super(marca, persona, onOff);
        this.patroCodiPin = patroCodiPin;
        this.patroTeclat = patroTeclat;
        this.patroEmpremta = patroEmpremta;
    }
    /** Constructor sense patrons, a continuació utilizar 'setPatrons'
     * 
     * @param marca
     * @param persona 
     */
    public Android(String marca, Persona persona) {
        super(marca, persona, false);
    }    
    @Override
    public boolean validaPatrons(Persona persona) {
        if(super.getOnOff()){
            /*if(persona.getPatroCodiPin().equals(patroCodiPin) && persona.getPatroTeclat().equals(patroTeclat) && persona.getPatroEmpremta().equals(patroEmpremta)){
                return true;
            }
            else{
                return false;
            }*/
            if (persona.getPatroCodiPin() != null) 
                return persona.getPatroCodiPin().equals(patroCodiPin);
            if (persona.getPatroTeclat() != null) 
                return persona.getPatroTeclat().equals(patroTeclat);
            if (persona.getPatroEmpremta() != null) 
                return persona.getPatroEmpremta().equals(patroEmpremta);
            return false;
        }
        else{
            System.out.println("Telèfon Android no encès");
            return false;            
        }
    }
    @Override
    public void setPatrons(String patroCodiPin, String patroTeclat, String patroEmprempta, String patroRostre) {
        setPatroCodiPin(patroCodiPin);
        setPatroTeclat(patroTeclat);
        setPatroEmpremta(patroEmpremta);
    }
    public void setPatroCodiPin(String patroCodiPin) {
        this.patroCodiPin = patroCodiPin;
    }
    public void setPatroTeclat(String patroTeclat) {
        this.patroTeclat = patroTeclat;
    }
    public void setPatroEmpremta(String patroEmpremta) {
        this.patroEmpremta = patroEmpremta;
    }
}