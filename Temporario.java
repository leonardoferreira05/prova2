
public class Temporario extends Professor{
    
    private int horas;
    
    public Temporario(String nome, Servidores c, int h) {
        super(nome, c);
        this.setHoras(h);
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }
}
