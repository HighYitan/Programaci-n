package ACT11_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author alumnat
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Persona> persones = new ArrayList<>();
        Map<Integer, Modul> moduls = new HashMap<>();
        
        /*Persona persona1 = new Persona("Khris", 28);
        persones.add(persona1);
        persona1 = new Persona("Tomeu", 35);
        persones.add(persona1);
        persona1 = new Persona("Luislo", 18);
        persones.add(persona1);
        persona1 = new Persona("Yitán", 15);
        persones.add(persona1);*/
        persones.add(new Persona("Khris", 28));
        persones.add(new Persona("Tomeu",35));
        persones.add(new Persona("Luislo", 18));
        persones.add(new Persona("Yitan", 15));
        
        /*Modul modul = new Modul("Programació", 8, persones);
        moduls.put(1, modul);
        modul = new Modul("Llenguatge de Marques", 6, persones);
        moduls.put(2, modul);
        modul = new Modul("Bases de Dades", 7, persones);
        moduls.put(3, modul);
        modul = new Modul("Sistemes Informátics", 5, persones);
        moduls.put(4, modul);
        modul = new Modul("Entorns de Desenvolupament", 4, persones);
        moduls.put(5, modul);*/
        moduls.put(1, new Modul("Programació", 7, persones));
        moduls.put(2, new Modul("Llenguatge de Marques", 6, persones));
        moduls.put(3, new Modul("Bases de Dades", 7, persones));
        moduls.put(4, new Modul("Sistemes Informátics", 5, persones));
        moduls.put(5, new Modul("Entorns de Desenvolupament", 4, persones));
        
        for(Map.Entry<Integer, Modul> m : moduls.entrySet()){
            int clau = m.getKey();
            Modul valor = m.getValue();
            System.out.println(clau + " - " + valor);
        }
        /*for (Integer k : moduls.keySet()) { Tomeu recorre el hashmap
            Modul modul = moduls.get(k);
            System.out.println("Clau: " + k + ", Valor: " + modul.toString());
        }*/
        System.out.println(moduls.get(1).getNom() + " - " + moduls.get(1).getMatricula().get(2).getNom()); //1er modul, nombre 3era persona
        
        System.out.println(moduls.get(2).getNom() + " - " + moduls.get(2).getMatricula().size() + " matriculats"); //2nd modul, numero de matriculats
        
        System.out.print(moduls.get(3).getNom() + ":"); //3er modul, nom dels matriculats
        for(Persona p : moduls.get(3).getMatricula()){
            System.out.print(" " + p.getNom());
        }
        System.out.println();
    }
}