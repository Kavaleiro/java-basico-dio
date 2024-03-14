package POO.MentoriaDesafioPoo;

public interface interfaceConta {

    public void sacar(double valor);      
    
    public void trasfeir(double valor, conta contaDestino);
    
    public void depositar(double valor);
   
    public void imprimirExtrato();
}