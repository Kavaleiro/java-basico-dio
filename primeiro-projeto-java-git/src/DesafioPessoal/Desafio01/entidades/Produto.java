package DesafioPessoal.Desafio01.entidades;

public abstract class Produto {
    
    /**
     * Código de identificação do produto.
     */
    private String codigo;

    /**
     * Valor unitário do produto.
     */
    private double preco;

    /**
     * Quantidade comprada do produto
     */
    private int quantidade;

    public Produto() {}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Calcular o preço di frete para os produtos comprados. Este Cálculo
     * pode variar de acordo com o produto
     * @return valor do frete para o determinado produto
     */
    //TODO Método de cálculo de frete
    public abstract double calcularFrete();
}
