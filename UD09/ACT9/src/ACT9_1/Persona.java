package ACT9_1;
/**
 *
 * @author srhig
 */
public class Persona {
    private String nom, patroCodiPin, patroTeclat, patroEmpremta, patroRostre;
    public Persona(String nom, String patroCodiPin, String patroTeclat, String patroEmpremta, String patroRostre){
        this.nom = nom;
        this.patroCodiPin = patroCodiPin;
        this.patroTeclat = patroTeclat;
        this.patroEmpremta = patroEmpremta;
        this.patroRostre = patroRostre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPatroCodiPin() {
        return patroCodiPin;
    }

    public void setPatroCodiPin(String patroCodiPin) {
        this.patroCodiPin = patroCodiPin;
    }

    public String getPatroTeclat() {
        return patroTeclat;
    }

    public void setPatroTeclat(String patroTeclat) {
        this.patroTeclat = patroTeclat;
    }

    public String getPatroEmpremta() {
        return patroEmpremta;
    }

    public void setPatroEmpremta(String patroEmpremta) {
        this.patroEmpremta = patroEmpremta;
    }

    public String getPatroRostre() {
        return patroRostre;
    }

    public void setPatroRostre(String patroRostre) {
        this.patroRostre = patroRostre;
    }
    
}