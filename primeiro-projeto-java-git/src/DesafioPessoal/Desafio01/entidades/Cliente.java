package DesafioPessoal.Desafio01.entidades;

/**
 * Classe que representa a enteida cliente. Este pode fazer um pedio.
 */
public class Cliente {
    
    /**
     * Nome completo do cliente.
     */
    private String nome;

    /**
     * Número de CPF do cliente.
     */
    private String cpf;

    public Cliente() {
        this.nome = "Felipe";
        this.cpf = "67072755500";
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{ nome='" + nome + "'}";
    }
}
