
public class Professor extends Servidores{
    private Servidores cordenador;
    
    public Professor(String nome, Servidores c) {
        super(nome);
        this.setCordenador(c);
    }

    public void setCordenador(Servidores cordenador) {
        this.cordenador = cordenador;
    }

    public Servidores getCordenador() {
        return cordenador;
    } 
}
