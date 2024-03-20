package ACT11_2A;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Queue;
/**
 *
 * @author alumnat
 */
public class Dia {
    private LocalDate data;
    private Queue<String> tasques;
    public Dia(LocalDate data, Queue<String> tasques){
        this.data = data;
        this.tasques = tasques;
    }
    public LocalDate getData(){
        return data;
    }
    public Queue<String> getTasques(){
        return tasques;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.data);
        hash = 59 * hash + Objects.hashCode(this.tasques);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        /*if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dia other = (Dia) obj;
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return Objects.equals(this.tasques, other.tasques);*/
        /*Dia dia = (Dia) obj;
        return (this.data.equals(data) && this.tasques.equals(tasques));*/
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dia other = (Dia) obj;
        return Objects.equals(this.data, other.data);
    }
    @Override
    public String toString() {
        return tasques.toString();
    }
}