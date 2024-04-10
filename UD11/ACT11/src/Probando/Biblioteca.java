package Probando;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumnat
 */
public class Biblioteca{
    private List<Socio> socios;
    public Biblioteca(){
        this.socios = new ArrayList<>();
    }

    public void afegir(Socio s){
        if(s.add(s)){
            socios.add(s);
        }
    }
}
