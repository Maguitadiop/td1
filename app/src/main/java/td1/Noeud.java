package td1;
import java.util.Set;
import java.util.List;
public class Noeud implements Arbre{

    private final List<Arbre> fils;
    

    public Noeud (final List<Arbre> fils){
        this.fils = fils;
    }
    public int taille(){
        int sr = 0;
        for(final Arbre a : fils) {
            sr += a.taille();
        }
        return sr;
        
    }
    public boolean contient(final Integer val){
        boolean rtr = false;
        for(final Arbre a:fils){
            if(a.contient(val)) return true;
        }
        return rtr;

    } 
    public Set<Integer> valeurs(){
        return this.fils;
    }
    public Integer somme(){

    }
    public Integer min(){

    }
    public Integer max(){

    }
    public boolean estTrie(){

    }
}