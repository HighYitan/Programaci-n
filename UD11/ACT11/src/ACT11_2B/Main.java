package ACT11_2B;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author alumnat
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*LocalDate data = LocalDate.of(2024, 1, 1); 
        Queue<String> atasques = new LinkedList<>();
        atasques.offer("Hacer los deberes");
        atasques.offer("Estudiar para el examen");
        atasques.offer("Completar una partida con el High Cultist en Conquest of Elysium 5");
        Agenda agenda = new Agenda();
        agenda.afegeixDia(data, atasques);
        
        data = LocalDate.of(2024, 1, 2);
        atasques = new LinkedList<>();
        atasques.offer("Seguir probando cosas");
        agenda.afegeixDia(data, atasques);
        
        data = LocalDate.of(2024, 1, 3);
        atasques = new LinkedList<>();
        atasques.offer("Terminar los últimos ejercicios");
        atasques.offer("Subir todo mi progreso a Github y sincronizarlo todo");
        agenda.afegeixDia(data, atasques);
        
        data = LocalDate.of(2024, 1, 2);
        atasques = new LinkedList<>();
        atasques.offer("Matar gente");
        atasques.offer("Limpiar el desastre");
        agenda.afegeixDia(data, atasques);*/
        Agenda agenda = new Agenda(new HashSet<>());
        LocalDate data = LocalDate.of(2024, 1, 1); 
        agenda.afegeixDia(data, "Hacer los deberes", "Estudiar para el examen", "Completar una partida con el High Cultist en Conquest of Elysium 5");
        
        data = LocalDate.of(2024, 1, 2);
        agenda.afegeixDia(data, "Seguir probando cosas");
        
        data = LocalDate.of(2024, 1, 3);
        agenda.afegeixDia(data, "Terminar los últimos ejercicios", "Subir todo mi progreso a Github y sincronizarlo todo");
        
        data = LocalDate.of(2024, 1, 2);
        agenda.afegeixDia(data, "Matar gente", "Limpiar el desastre");
        
        System.out.println(agenda.obteTasca(data));
    }   
}