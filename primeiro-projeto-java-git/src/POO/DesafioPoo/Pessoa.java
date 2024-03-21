package POO.DesafioPoo;

public class Pessoa {
    
    private static int cont = 1;

    private String nome;
    private String cpf;
    private String rg;

    public Pessoa(String nome, String cpf, String rg){
        this.nome = nome;
        this.cpf = cpf;//** */
        this.rg = rg;
        cont +=1;
    }
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

    public String getRg(){
        return rg;
    }
    public void setRg(String rg){
        this.rg = rg;
    }

    public String toString() {
        return "\nNome: "+ this.getNome() +
                "\nCPF: "+ this.getCpf() +
                "\nRG: " + this.getRg();
    }
}
