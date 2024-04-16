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
    public Biblioteca(){
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
    public Llibre cercaLlibreDisponible(String titol){
        for(Llibre l : llibresDisponibles){
            if(l.getTitol() == titol){
                return l;
            }
        }
        return null;
    }
    public void prestaLlibre(String titol){
        Llibre llibre = cercaLlibreDisponible(titol);
        if(llibre != null){
            llibresDisponibles.remove(llibre);
            llibresPrestats.offer(llibre);
        }
    }
    public void tornaLlibre(){
        Llibre llibre = llibresPrestats.poll();
        if(llibre != null){
            llibresDisponibles.add(llibre);
        }
    }
    public void mostraLlibresDisponibles(){
        for(Llibre l : llibresDisponibles){
            System.out.println(l.toString());
        }
    }
    public void mostraTitolsDisponibles(){
        for(String titol : titolsDisponibles.keySet()){
            System.out.println(titolsDisponibles.get(titol).toString());
        }
    }
    public void mostraLlibresPrestats(){
        for(Llibre l : llibresPrestats){
            System.out.println(l.toString());
        }
    }
}