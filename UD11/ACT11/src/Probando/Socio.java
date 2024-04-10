package Probando;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author alumnat
 */
public class Socio extends ArrayList{
    private int id;
    private String nom;
    public Socio(int id, String nom){
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public boolean add(Object e){
        Socio s = (Socio) e;
        if(!this.equals(s) && this.hashCode() != s.hashCode()){     
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Socio other = (Socio) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.nom, other.nom);
    }

    @Override
    public String toString() {
        return "Socio{" + "id=" + id + ", nom=" + nom + '}';
    }
    
}