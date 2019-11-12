
public class AssisAdm  extends Servidores{
    private String setor;
    
    public AssisAdm(String nome, String s) {
        super(nome);
        this.setSetor(s);
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }
}
