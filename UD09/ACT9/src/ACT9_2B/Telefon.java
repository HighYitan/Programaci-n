package ACT9_2B;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author srhig
 */
public abstract class Telefon extends ValidadorDispositius implements DispositiuElectronic{
    private String marca;
    private Persona persona;
    private boolean onOff;
    
    public Telefon(ArrayList<String> patrons, String marca, Persona persona){
        super(patrons);
        this.marca = marca;
        this.persona = persona;
        this.onOff = false;
    }
    public Telefon(String marca, Persona persona) {
        super(new ArrayList<>(Arrays.asList(null, null, null, null)));
        this.marca = marca;
        this.persona = persona;
        this.onOff = false;
    }
    @Override
    public boolean validaPatrons(Object o) {
        Persona persona = (Persona) o;
        
        if (getOnOff()) {
            if (persona.getPatroCodiPin() != null) 
                return this.getPatroCodiPin().equals(persona.getPatroCodiPin());
            if (persona.getPatroTeclat() != null) 
                return this.getPatroTeclat().equals(persona.getPatroTeclat());
            if (persona.getPatroEmpremta() != null) 
                return this.getPatroEmpremta().equals(persona.getPatroEmpremta());
            if (persona.getPatroRostre() != null) 
                return this.getPatroRostre().equals(persona.getPatroRostre());
            return false;
        } else {
            System.out.println("Telèfon no encès");
            return false;
        }
    }    
    @Override
    public void on() {
        System.out.println("Telèfon " + this.toString() + " encès");
        if (!this.onOff)
            this.onOff = true;
    }
    @Override
    public void off() {
        System.out.println("Telèfon " + this.toString() + " apagat");
        if (this.onOff)
            this.onOff = false;
    }
    /*@Override
    public abstract boolean validaPatrons(Persona persona);
    @Override
    public abstract void setPatrons(String patroCodiPin, String patroTeclat, String patroEmprempta, String patroRostre);*/
    public boolean getOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }
    public String getMarca() {
        return marca;
    }
    @Override
    public String toString() {
        return this.marca;
    }    
}