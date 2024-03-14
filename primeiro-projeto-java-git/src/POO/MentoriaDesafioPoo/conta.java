package POO.MentoriaDesafioPoo;

public abstract class conta implements interfaceConta {
    protected static final int AGENCIA_PADRAO = 0;
    private static int SEQUENCIAL = 0;

    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected Double saldo = 0.00;

    public conta(Cliente cliente){
        this.agencia = conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++; 
        this.cliente = cliente;
    }


    @Override
    public void sacar(double valor){
        this.saldo -= valor;
    }
    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }
    @Override
    public void trasfeir(double valor, conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    public int getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }
    public Double getSaldo(){
        return saldo;
    }
    protected void inforComuns(){

        System.out.println(String.format("AGENCIA: %d",this.agencia));
        System.out.println(String.format("NUMERO: %d", this.numero));
        System.out.println(String.format("SALDO: %.2f", this.saldo));
    }
}
