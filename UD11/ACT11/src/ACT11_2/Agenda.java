package ACT11_2;
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
    public Agenda(){
        
    }
    //public void afegeixDia(LocalDate data, Queue<String> atasques){
    public void afegeixDia(LocalDate data, String ... atasques){
        Queue<String> tasques = new LinkedList<>();
        for(String t : atasques){
            tasques.offer(t);
        }
        if(cercaDia(data) == null){
            Dia dia = new Dia(data, tasques);
            dies.add(dia);
        }
        else{
            dies.add(cercaDia(data));
        }
    }
    public Dia cercaDia(LocalDate data){
        for(Dia dia : dies){
            if(dia.getData().equals(data)){
                return dia;
            }
        }
        return null;
    }
    public String obteTasca(LocalDate data){
        Dia dia = cercaDia(data);
        return dia.getTasques().peek();
    }
}