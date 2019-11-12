
public class TestaIF {
    public static void main(String[] args) {
        AssisAdm a1 = new AssisAdm("Lucas", "Informatica");
        Efetivo e1 = new Efetivo("Igor", a1, 3151);
        Substituto s1 = new Substituto("Henrique", a1, "20/12/2020");
        Temporario t1 = new Temporario("Matheus", a1, 321);
    }
    
}
