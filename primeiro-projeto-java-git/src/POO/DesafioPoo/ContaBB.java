package POO.DesafioPoo;

public abstract class ContaBB extends BBCliente{

    protected int Agencia;
    protected Double Saldo;

    public ContaBB(){
    }
    public ContaBB(String Nome, String Sobrenome, String cpf){
        this.Nome = Nome;
        this.Sobrenome = Nome;
        this.cpf = cpf;
    }
    public int getAgencia(){
        return Agencia;
    }
    public Double getSaldo(){
        return Saldo;
    }

    protected void informacoesComum(){
        System.out.println(String.format("NOME: %s", this.Nome));
        System.out.println(String.format("SOBRENOME: %s", this.Sobrenome));
        System.out.println(String.format("CPF: %s", this.cpf));
    }
}
