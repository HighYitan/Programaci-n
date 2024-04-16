package ACT11_4;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author srhig
 */
public class Llibre {
    private int id;
    private String titol, autor;
    private int anyPublicacio;
    private List<Anomalia> anomalies;
    public Llibre(int id, String titol, String autor, int anyPublicacio){
        this.id = id;
        this.titol = titol;
        this.autor = autor;
        this.anyPublicacio = anyPublicacio;
        this.anomalies = new ArrayList<>();
    }
    public String getTitol(){
        return titol;
    }
    public int getId(){
        return id;
    }
    public List<Anomalia> getAnomalies(){
        return anomalies;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Llibre other = (Llibre) obj;
        return Objects.equals(this.id, other.id);
    }
    
    @Override
    public String toString() {
        String text = "Llibre{" + "id=" + id + ", titol=" + titol + ", autor=" + autor + ", anyPublicacio=" + anyPublicacio + '}';
        text += " Anomalies: {";
        for(Anomalia a : anomalies){
            text += a.getDescripcio() + " ";
        }
        text += "}";
        return text;
    }
}