
public class Substituto extends Professor{
    
    private String Data;
    public Substituto(String nome, Servidores c, String d) {
        super(nome, c);
        this.setData(d);
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getData() {
        return Data;
    }    
}
