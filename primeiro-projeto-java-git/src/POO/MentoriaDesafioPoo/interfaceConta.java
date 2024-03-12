package POO.MentoriaDesafioPoo;

public interface interfaceConta {

    void sacar(double valor);
    void depositar(double valor);
    void tranferir(double valor, Conta contaDestino);
}
