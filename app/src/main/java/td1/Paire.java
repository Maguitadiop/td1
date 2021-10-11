package td1;

public class Paire {
    private int x;
    private int y;

    public Paire(){
        this.x=0;
        this.y=0;
    }
    public Paire(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int fst(){
        return this.x;
    }
    public int snd(){
        return this.y;
    }
   
}
