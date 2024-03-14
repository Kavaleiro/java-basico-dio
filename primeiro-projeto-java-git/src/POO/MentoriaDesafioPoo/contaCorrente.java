package POO.MentoriaDesafioPoo;

public class contaCorrente extends conta{    
    public contaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("==========EXTRATO CONTA CORRENTE==========");
        super.inforComuns();
    }
}
