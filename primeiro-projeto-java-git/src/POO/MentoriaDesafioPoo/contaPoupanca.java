package POO.MentoriaDesafioPoo;

public class contaPoupanca extends conta{

    public contaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("==========EXTRATO CONTA POUPANCA==========");
        super.inforComuns();
    }
    
}
