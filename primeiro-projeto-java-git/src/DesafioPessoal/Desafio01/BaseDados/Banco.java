package DesafioPessoal.Desafio01.BaseDados;

import java.util.ArrayList;
import java.util.List;

import DesafioPessoal.Desafio01.entidades.Cupom;
import DesafioPessoal.Desafio01.entidades.Pedido;
import DesafioPessoal.Desafio01.entidades.Produto;
import DesafioPessoal.Desafio01.entidades.Cliente;

/**
 * Classe reponsável por simular um banco de dados. Esta faz a inserção e eclusão da
 * aplicação. Atualizações não são permitidas para facilitar o funcionamento da aplicação
 * OBS: Quando eu estiver com mais experiêcia, eu colocarei um banco de dados mais 
 * COMPLEXO 19/02/24
 */
public class Banco {
    /**
     * Lista que armazena os produtos(Livros e Cadernos) cadastrados.
     */


    private List<Produto> produtos;

     /**
      * Lista que armazena os pedidos cadastrados.
      */
    
    private List<Pedido> pedidos;

    /**
     * Lista que armazena os cupons disponíveis
     *  */

    private List<Cupom> cupons;

    /**
     * Cliente cadastrado */    

    private Cliente cliente;

    public Banco() {

        this.produtos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.cliente = new Cliente();

        this.cupons = new ArrayList<>();
        cupons.add(new Cupom("CUPOM 2", 2));
        cupons.add(new Cupom("CUPOM 5", 5));
        cupons.add(new Cupom("CUPOM 7", 7));

    }
    public Cliente getCliente(){

        return cliente;
    }

    public Cupom[] getCupons(){
        return cupons.toArray(new Cupom[cupons.size()]);

    }

    public Pedido[] getPedidos() {
        return pedidos.toArray(new Pedido[pedidos.size()]);
    }

    public Produto[] getProdutos() {
        return produtos.toArray(new Produto[produtos.size()]);
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(int posicao) {
        produtos.remove(posicao);
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void removerPedido(int posicao) {
        pedidos.remove(posicao);
    }
}
