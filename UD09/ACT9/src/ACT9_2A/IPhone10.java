package ACT9_2A;
/**
 *
 * @author srhig
 */
public class IPhone10 extends IPhone8{
    private String patroRostre;
    public IPhone10(String marca, Persona persona, boolean onOff, String patroCodiPin, String patroEmpremta, String patroRostre){
        super(marca, persona, onOff, patroCodiPin, patroEmpremta);
        this.patroRostre = patroRostre;
    }
    /** Constructor sense patrons, a continuació utilizar 'setPatrons'
     * 
     * @param marca
     * @param persona 
     */
    public IPhone10(String marca, Persona persona) {
        super(marca, persona);
    }
    @Override
    public void setPatrons(String patroCodiPin, String patroTeclat, String patroEmpremta, String patroRostre) {
        super.setPatroCodiPin(patroCodiPin);
        super.setPatroEmpremta(patroEmpremta);
        setPatroRostre(patroRostre);
    }
    @Override
    public boolean validaPatrons(Persona persona) {
        if (super.getOnOff()) {
            if (super.validaPatrons(persona))
                return true;
            else
                if (persona.getPatroRostre() != null)
                    return persona.getPatroRostre().equals(patroRostre);
            return false;
        } else {
            System.out.println("Telèfon IPhone 10 no encès");
            return false; 
        }
            
    }    
    public void setPatroRostre(String patroRostre) {
        this.patroRostre = patroRostre;
    }
}