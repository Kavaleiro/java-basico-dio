package DesafioPessoal.Desafio01.negocio;

import java.time.LocalDate;
import java.util.List;

import DesafioPessoal.Desafio01.BaseDados.Banco;
import DesafioPessoal.Desafio01.entidades.Cupom;
import DesafioPessoal.Desafio01.entidades.Pedido;
import DesafioPessoal.Desafio01.entidades.Produto;

public class PedidoNegocio {

    private Banco bancoDados;

    /**
     * Construtor.
     * @param banco Banco de dados para armazenar e ter acesso aos pedidos.
     */
    public PedidoNegocio(Banco banco) {
        this.bancoDados = banco;
    }

    private double calcularTotal(List<Produto> produtos, Cupom cupom) {
        double total = 0.0;
        for(Produto produto: produtos ) {
            total += produto.calcularFrete();
        }

        if(cupom != null) {
            return total * (1 - cupom.getDesconto());
        } else {
            return total;
        }
    }

    /**
     * Salva um novo pedido sem cupom de desconto.
     * @param novoPedido Pedido a ser armazenado
     */
    public void salvar(Pedido novoPedido) {
        salvar(novoPedido, null);
    }

    /**
     * Salva um novo pedido com cupom de desconto.
     * @param novoPedido Pedido a ser armazenado.
     * @param cupom Cupkm de desconto a ser utilizado
     */
    public void salvar(Pedido novoPedido, Cupom cupom) {

        //Definir padrão código
        String codigo = "PE%4d%2d%04d";
        LocalDate hoje = LocalDate.now();
        codigo = String.format(codigo, hoje.getYear(), hoje.getMonthValue(), bancoDados.getPedidos().length);

        //Setar código no pedido
        novoPedido.setCodigo(codigo);
        //Setar cliente no pedido
        novoPedido.setCliente(bancoDados.getCliente());
        //Calcular a set total
        novoPedido.setTotal(calcularTotal(novoPedido.getProdutos(), cupom));
        //Adicionar no banco
        bancoDados.adicionarPedido(novoPedido);
        //Mensagem
        System.out.println("Pedido salvo com sucesso.");
    }

    /**
     * Exclui um pedido a partir de seu código de rastreio
     * @param codigo Código do pedido
     */
    public void excluir(String codigo) {

        int pedidoExclusao = -1;
        for(int i = 0; i < bancoDados.getPedidos().length; i++) {
            Pedido pedido = bancoDados.getPedidos()[i];
            if(pedido.getCodigo().equals(codigo)) {
                pedidoExclusao = i;
                break;
            }
        }
         if (pedidoExclusao != -1) {
            bancoDados.removerPedido(pedidoExclusao);
            System.out.println("Pedido excluído com sucesso.");
        } else {
            System.out.println("Pedido inexistente.");
        }
    }

    /**
     * Lista todos os pedidos realizados.
     */
    //TODO Método de listar todos os pedidos
    
}
