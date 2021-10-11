package td1;

public class Paire <T,S>{
    public T fst;
    public S snd;
    
    public Paire(T fst, S snd){
        this.fst = fst;
        this.snd = snd;
    }

    public T getFst(T fst){
        return fst;
    }
    public S getSnd(S snd){
        return snd;
    }

    public void setFst(T fst){
        this.fst = fst;
    }
    public void setSnd(S snd){
        this.snd = snd;
    }

    public Paire changeFst(K fst){
        this.fst = fst;
        return Paire(fst,snd);
    }

    public Paire changeSnd(U snd){
        this.snd = snd;
        return Paire(fst,snd);
    }

    public String toString(){
        return "("+this.fst+","+this.snd+") :: Paire["+
        this.fst.getClass().getSimpleName()+","+
        this.snd.getClass().getSimpleName()+"]";
    }

}