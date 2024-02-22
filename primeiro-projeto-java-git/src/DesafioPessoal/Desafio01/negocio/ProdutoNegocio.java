package DesafioPessoal.Desafio01.negocio;

import java.util.Optional;

import DesafioPessoal.Desafio01.BaseDados.Banco;
import DesafioPessoal.Desafio01.entidades.Produto;

/**
     * Classe para manipular a entidade {@link Produto}.
     */

public class ProdutoNegocio {

    /**
     * {@inheritDoc}
     */
    private Banco bancoDados;

    /**Contrutor
     * @param banco Banco de dados para ter e armazenar os produtos
     */

     public ProdutoNegocio(Banco banco) {
        this.bancoDados = banco;
    }

    /** 
    * Salva um novo produto(Livro ou caderno) na loja.
    * @param novoProduto Livro ou caderno que pode ser vendido.
    */

    public void salvar(Produto novoProduto) {

        String codigo = "Pafjaskfe";
        codigo = String.format(codigo, bancoDados.getProdutos().length);
        novoProduto.setCodigo(codigo);


        boolean produtoRepetido = false;
        for(Produto produto: bancoDados.getProdutos()) {
            if (produto.getCodigo() == novoProduto.getCodigo()) {
                produtoRepetido = true;
                System.out.println("Produto já cadastrado.");
                break;
            }
        }

        if(!produtoRepetido) {
            this.bancoDados.adicionarProduto(novoProduto);
            System.out.println("Produto cadastrado com sucesso.");
        }
    }

    /**Exclui um produto pelo codigo de cadastro.
     * @param codigo Codigo de cadastro do produto.
     */

    public void excluir(String excluir) {
        //TODO implementar a exclusão
    }

    /**
     * Obtem um produto a partir de seu codigo de cadastro.
     * @param codigo Codigo de cadastro do produto
     * @return Optional indicando a existência ou não do Produto
     */

    public Optional<Produto> consultar(String codigo) {

        for(Produto produto: bancoDados.getProdutos()) {
            if(produto.getCodigo().equals(codigo)) {
                return Optional.of(produto);
            }
        }

        return Optional.empty();
    }

    /**
     * Lista todos os rodutos cadastratros
     */

     public void listaTodos() {
        if(bancoDados.getProdutos().length == 0) {
            System.out.println("Não existe produtos cadastrados...");
        } else {
            for (Produto produto:bancoDados.getProdutos()) {
                System.out.println(produto.toString());
            }
        }
    }
}
