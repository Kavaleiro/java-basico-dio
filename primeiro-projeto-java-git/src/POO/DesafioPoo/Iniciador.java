package POO.DesafioPoo;

public class Iniciador {
    public static void main(String[] args) {
        
        Bcorrente bc = new Bcorrente();
        bc.setNome("Felipe");
        bc.setCpf("03923033290");
        bc.imprimir();

        Bpoupanca bp = new Bpoupanca();
        bp.setNome("Tiago");
        bp.setCpf("123456789");
        bp.imprimir();
    }
    
}
