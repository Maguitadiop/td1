package td1;
import java.util.Set;
/*public interface Arbre {
    int taille(); // nombre de valeurs
    boolean contient(final Integer val); 
    // vrai si val est contenue dans l'arbre, faux sinon
    Set<Integer> valeurs(); // ensemble des valeurs différentes dans l'arbre
   // Integer somme(); // somme des valeurs
   // Integer min(); // valeur minimale
   // Integer max(); // valeur maximale
  //  boolean estTrie(); // vrai si l'arbre est trié, faux sinon
  }*/

public interface Arbre<T extends Sommable<T>>{
    int taille();
    boolean contient(T val);
    Set<T> valeurs();
    T somme();
}
  