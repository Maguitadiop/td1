
package td1;

public class Entier<T> implements Sommable<T> {
   private int val;
   private int r;

   public Entier(int val){
       this.val = val;
   }

   public int getR(int r){
       return r;
   }

   public T sommer(final T other){
       other = other+r.getR;
       return other;
   }

   public boolean equals(Object obj){
       if(this == obj){ return true;}
       if(this == null){ return false;}
       if(!(obj instanceof Entier)){ return false;}
       Entier other = (Entier) obj;
       if(val== 0){
           if(other.val!=0){
               return false;
           }
          
       }

       return true;
   }

   public hashCode(){

   }

   public toString(){

   }
}

 
