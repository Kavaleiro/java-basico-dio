package POO.DesafioPoo;

public abstract class BConta {

    public String nome;
    private String cpf;
    private int agencia;
    private double saldo = 0.0;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public int getAgencia(){
        return agencia;
    }
    public double getSaldo(){
        return saldo;
    }

    protected void printInfor(){
        System.out.println(String.format("NOME: %s", this.nome));
        System.out.println(String.format("CPF: %s", this.cpf));
        System.out.println(String.format("SALDO: %f", this.saldo));
    }


    
}
