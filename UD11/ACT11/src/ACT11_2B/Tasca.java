package ACT11_2B;
import java.time.LocalTime;
import java.util.Objects;
/**
 *
 * @author alumnat
 */
public class Tasca {
    private LocalTime hora;
    private String tasca;
    public Tasca(LocalTime hora, String tasca){
        this.hora = hora;
        this.tasca = tasca;
    }
    public LocalTime getHora(){
        return hora;
    }
    public String getTasca(){
        return tasca;
    }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.hora);
        hash = 31 * hash + Objects.hashCode(this.tasca);
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
        final Tasca other = (Tasca) obj;
        if (!Objects.equals(this.tasca, other.tasca)) {
            return false;
        }
        return Objects.equals(this.hora, other.hora);
    }

    @Override
    public String toString() {
        return "Tasca{" + "hora=" + hora + ", tasca=" + tasca + '}';
    }
    
}