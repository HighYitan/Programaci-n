package ACT11_2B;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList; //
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
/**
 *
 * @author alumnat
 */
public class Agenda {
    private Map<LocalDate, List<Tasca>> tasques;
    public Agenda(){
        this.tasques = new TreeMap<>();
    }
    //public void afegeixDia(LocalDate data, Queue<String> atasques){
    public void afegeixTasca(LocalDate data, LocalTime hora, String titol){
        List<Tasca> tasquesEnData = cercaDia(data);
        if(tasquesEnData == null){
            tasques.put(data, new ArrayList<>());
        }
        else{
            tasquesEnData.add(new Tasca(hora, titol));
            //tasques.put(data, tasquesEnData);
        }
    }
    public List<Tasca> cercaDia(LocalDate data){
        if(tasques.containsKey(data)){
            return this.tasques.get(data);
        }
        return null;
    }
    public void eliminaTasca(LocalDate data, LocalTime hora){
        List<Tasca> tasquesEnData = cercaDia(data);
        if(tasquesEnData != null){
            for(Tasca t : tasquesEnData){
                if (t.getHora().equals(hora)) {
                    tasquesEnData.remove(t);
                    break;
                } 
            }
            if(tasquesEnData.isEmpty()){
                tasques.remove(data);
            }
        }
        
    }
    public String obteTasca(LocalDate data){
        if(tasques.containsKey(data)){
            return tasques.get(data);
        }
        return null;
    }
}