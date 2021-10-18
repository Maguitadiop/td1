package td1;
import java.util.Set;
/*public class Feuille implements Arbre {
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

*/

public class Feuille<T extends Sommable<T>>implements Arbre<T>{
    private int valeur;
    private T val;

    public Feuille(final T val){
        this.val = val;
    }
    public int taille(){
        return valeur;
    }

    public boolean contient(T val){
        return val.equals(val);
    }

    public Set<T>valeurs(){
        return Set.of(val);
    }

    public T somme(){
        return val;
    }

}