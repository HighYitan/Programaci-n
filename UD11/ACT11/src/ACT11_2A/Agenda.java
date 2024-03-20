package ACT11_2A;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedList; //
import java.util.Queue;
import java.util.Set;
/**
 *
 * @author alumnat
 */
public class Agenda {
    private Set<Dia> dies = new HashSet<>();
    public Agenda(Set<Dia> dies){
        this.dies = dies;
    }
    //public void afegeixDia(LocalDate data, Queue<String> atasques){
    public void afegeixDia(LocalDate data, String ... atasques){
        Queue<String> tasques = new LinkedList<>();
        Dia dia = cercaDia(data);
        if(dia == null){
            for(String t : atasques){
                tasques.offer(t);
            }
            Dia diaNuevo = new Dia(data, tasques);
            dies.add(diaNuevo);
        }
        else{
            for(String t : atasques){
                dia.getTasques().offer(t);
            }
        }
    }
    public Dia cercaDia(LocalDate data){
        for(Dia dia : dies){
            if(dia.getData().isEqual(data)){
                return dia;
            }
        }
        return null;
    }
    public String obteTasca(LocalDate data){
        Dia dia = cercaDia(data);
        return dia.getTasques().poll();
    }
}