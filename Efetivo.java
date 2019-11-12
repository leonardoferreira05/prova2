
public class Efetivo extends Professor{
    
    private int tempo; 
    public Efetivo(String nome, Servidores c, int t) {
        super(nome, c);
        this.setTempo(t);
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getTempo() {
        return tempo;
    }
    
    
}
