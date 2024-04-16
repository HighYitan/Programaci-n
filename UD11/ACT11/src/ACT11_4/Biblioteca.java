package ACT11_4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
    public void afegeixAnomalia(int idLlibre, Anomalia anomalia){
        boolean trobat = false;
        for(Llibre l : llibresDisponibles){
            if(l.getId() == idLlibre){
                //l.getAnomalies().add(anomalia);
                afegeixAnomalia(l.getAnomalies(), anomalia);
                trobat = true;
                break;
            }
        }
        if(!trobat){
            for(Llibre l : llibresPrestats){
                if(l.getId() == idLlibre){
                    //l.getAnomalies().add(anomalia);
                    afegeixAnomalia(l.getAnomalies(), anomalia);
                    break;
                }
            }
        }
    }
    private void afegeixAnomalia(List<Anomalia> anomalies, Anomalia anomalia){
        boolean trobat = cercaAnomalia(anomalies, anomalia);
        if(!trobat){
            anomalies.add(anomalia);
        }
    }
    private boolean cercaAnomalia(List<Anomalia> anomalies, Anomalia anomalia){
        for(Anomalia a : anomalies){
            if(a == anomalia){
                return true;
            }
        }
        return false;
    }
    public void eliminaAnomalia(int idLlibre, Anomalia anomalia){
        boolean trobat = false;
        int contador = 0; //Ambos atributos son utilizados en ambas versiones de la iteración.
        for(Llibre l : llibresDisponibles){ //Mi versión mejorada e iterada con foreach.
            if(l.getId() == idLlibre){
                trobat = true;
                for(Anomalia a : l.getAnomalies()){
                    if(a == anomalia){
                        //l.getAnomalies().remove(a);
                        l.getAnomalies().remove(contador);
                        break;
                    }
                    contador++;
                }
                break;
            }
        }
        if(!trobat){
            for(Llibre l : llibresPrestats){
                if(l.getId() == idLlibre){
                    for(Anomalia a : l.getAnomalies()){
                        if(a == anomalia){
                            //l.getAnomalies().remove(a);
                            l.getAnomalies().remove(contador);
                            break;
                        }
                        contador++;
                    }
                    break;
                }
            }
        }
        /*Iterator<Llibre> iterator; //Versión de Tomeu mejorada por mi iterando con iterator.
        Llibre element;
        iterator = llibresDisponibles.iterator();
        while(iterator.hasNext()){
            element = iterator.next();
            if(element.getId() == idLlibre){
                trobat = true;
                for(Anomalia a : element.getAnomalies()){
                    if(a == anomalia){
                        element.getAnomalies().remove(contador);
                        break;
                    }
                    contador++;
                }
                break;
            }
        }
        if(!trobat){
            iterator = llibresPrestats.iterator();
            while(iterator.hasNext()){
                element = iterator.next();
                if(element.getId() == idLlibre){
                    for(Anomalia a : element.getAnomalies()){
                        if(a == anomalia){
                            element.getAnomalies().remove(contador);
                            break;
                        }
                        contador++;
                    }
                    break;
                }
            }
        }*/
    }
}