package ACT11_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author srhig
 */
public class Biblioteca {
    private Set<Llibre> llibresDisponibles;
    private Queue<Llibre> llibresPrestats;
    private Map<String, List<Llibre>> titolsDisponibles;
    public Biblioteca(Set<Llibre> llibresDisponibles, Queue<Llibre> llibresPrestats, Map<String, List<Llibre>> titolsDisponibles){
        this.llibresDisponibles = new HashSet<>();
        this.llibresPrestats = new LinkedList<>();
        this.titolsDisponibles = new HashMap<>();
    }
    public void afegeixLlibre(int idLlibre, String titol, String autor, int anyPublicacio){
        Llibre llibre = new Llibre(idLlibre, titol, autor, anyPublicacio);
        llibresDisponibles.add(llibre);
        if(!titolsDisponibles.containsKey(titol)){
            titolsDisponibles.put(titol, new ArrayList<>());
        }
        titolsDisponibles.get(titol).add(llibre);
    }
}