package ACT9_2A;
/**
 *
 * @author srhig
 */
public abstract class Telefon implements DispositiuElectronic, ValidadorDispositius{
    protected String marca;
    protected Persona persona;
    private boolean onOff;
    
    public Telefon(String marca, Persona persona, boolean onOff){
        this.marca = marca;
        this.persona = persona;
        this.onOff = onOff;
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
    @Override
    public String toString() {
        return this.marca;
    }    
}