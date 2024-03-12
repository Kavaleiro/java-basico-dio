package POO.MentoriaDesafioPoo;

public abstract class conta {
    private String nome;
    private String CPF;
    private int agencia;
    private int numero;
    private Double saldo;
    
    public conta(){}

    public int getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }
    public Double getSaldo(){
        return saldo;
    }
}
