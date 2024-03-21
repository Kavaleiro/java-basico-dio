package POO.DesafioPoo;

public class Bbconta {

    private static int contContas = 1;

    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;

    public Bbconta(int numeroConta, Pessoa pessoa, Double saldo){
        this.numeroConta = contContas;
        this.pessoa = pessoa;
        contContas +=1;
    }
   
    public int getNumeroConta(){
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa(){
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }

    public Double getSaldo(){
        return saldo;
    }
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    public String toString(){
        return "\nNUMERO DA CONTA: "+ this.getNumeroConta() +
        "\nNOME: "+this.pessoa.getNome() +
        "\nCPF: "+this.pessoa.getCpf() +
        "\nRG: "+this.pessoa.getRg() +
        "\nSALDO: "+ Utilitarios.doubleToString(this.getSaldo());
    }

    public void depositar(Double valor){
        if (valor > 0) {
            setSaldo(getSaldo()+ valor);
            System.out.println("Seu Deposito foi realizado com sucesso!!");
        }else {
            System.out.println("Não foi possivel realizar o deposito!!");
        }
    }
    public void sacar(Double valor){
        //if (valor > 0 && this.getSaldo() >= valor)
        if (valor >= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque Realizado com sucesso!!");
        }else{
            System.out.println("Saldo insuficiente para o saque!!!");
        }
    }
    public void trasferir(){
        
    }


}
