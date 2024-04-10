package ACT11_2B;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
            tasquesEnData = cercaDia(data);
            tasquesEnData.add(new Tasca(hora, titol));
        }
        else{
            tasquesEnData.add(new Tasca(hora, titol));
            //tasques.put(data, tasquesEnData);
        }
    }
    public List<Tasca> cercaDia(LocalDate data){
        /*if(tasques.containsKey(data)){ //No hace falta todo esto ya que .get ya nos retorna null si no hay valor asociado a la key o no existe la key.
            return this.tasques.get(data);
        }
        return null;*/
        return this.tasques.get(data);
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
    public String obteTasca(LocalDate data, LocalTime hora){
        List<Tasca> tasquesEnData = cercaDia(data);
        //String titol = "";
        if(tasquesEnData != null){
            for(Tasca t : tasquesEnData){
                if(t.getHora().equals(hora)){
                    return t.getDescripcio();
                }
            }
        }
        return null;
    }
    @Override
    public String toString() {
        String texte = "TASQUES: ";
        for (Map.Entry<LocalDate, List<Tasca>> entry : this.tasques.entrySet()) {
            List<Tasca> tasquesEnDia = this.tasques.get(entry.getKey());
            texte += "\nData: " + entry.getKey();
            for (Tasca tasca : tasquesEnDia) {
                texte += "\n\t [ " + tasca.toString() + "  ]";
            }
        }
        return texte;
    }
}