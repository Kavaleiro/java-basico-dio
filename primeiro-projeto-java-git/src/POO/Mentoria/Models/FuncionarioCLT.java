package POO.Mentoria.Models;

/* essa Classe é "abstract pq ela sera ultilizada como herança.
Ou seja, ela nao pode receber um "NEW" */

public abstract class FuncionarioCLT {
    /**1--  PRIMEIRO PASSO */
    protected String nome;
    protected String documento;
    protected Double valorSalario;
    protected Endereco endereco;//Aqui é um complento, onde eu usei uma classe criada por mim

    public FuncionarioCLT() {
        //Construtor vaizio
    }

    public FuncionarioCLT(String nome, String documento, Double valorSalario, Endereco endereco){
        /**2-- SEGUNDO PASSO */
        this.nome = nome;
        this.documento = documento;
        this.valorSalario = valorSalario;
        this.endereco = endereco;
    }
    /**3-- TERCEIRO PASSO */
    //Criar os métodos GETTER e SETTER

    //Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    //Documento
    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }

    //valor do Salário
    public double getValorSalario(){
        return valorSalario;
    }
    public void setValorSalario(Double valorSalario){
        this.valorSalario = valorSalario;
    }

    //Endereço
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
}
