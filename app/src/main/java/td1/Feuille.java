package td1;
import java.util.Set;
public class Feuille implements Arbre {
    private int valeur;

    public int taille(){
        return valeur;
    }
    public boolean contient(final Integer val){
        return val.equals(valeur);
    }
    
    public Set<Integer> valeurs(){
        return Set.of(valeur);
    }
    public Integer somme(){
        return valeur;
    }
    public Integer min(){
        return valeur;
    }
    public Integer max(){
        return valeur;
    }
    public boolean estTrie(){
        return true;
    }
}
