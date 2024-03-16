package POO.MentoriaDesafioPoo;

public class Start {
    public static void main(String[] args) {
        Cliente felipe = new Cliente();

        conta conta_Poupanca = new contaPoupanca(felipe);
        conta conta_Corrente = new contaCorrente(felipe);
        conta_Corrente.depositar(100);
        conta_Corrente.trasfeir(75, conta_Poupanca);


        conta_Corrente.imprimirExtrato();
        conta_Poupanca.imprimirExtrato();

    }
    
}
