package DesafioPessoal.Desafio01.utilidades;

import java.util.Optional;
import java.util.Scanner;

import DesafioPessoal.Desafio01.BaseDados.Banco;
import DesafioPessoal.Desafio01.entidades.Cupom;
import DesafioPessoal.Desafio01.entidades.Livro;
import DesafioPessoal.Desafio01.entidades.Pedido;
import DesafioPessoal.Desafio01.entidades.Produto;
import DesafioPessoal.Desafio01.entidades.constantes.Genero;
import DesafioPessoal.Desafio01.negocio.ProdutoNegocio;


/**
 * Classe ultilitária para auxiliar na leitura de entrada dos dados
 */
public final class LeitoraDados {
    /**
     * Classe do Java para manipular entradas via teclado.
     */

     private static Scanner sc;
     //OBS: O QUE É "static"

     static {
        sc = new Scanner(System.in);
     }

     /**
      * Ler um dado específico
      @return Dado lido
      */

    public static String lerDado() {

        String texto = sc.nextLine();
        return texto;
    }

    /**
     * Ler os dados do livro a ser cadastrado.
     * @return Um livro a partir dos dados de entrada.
     */
    public static Livro lerLivro() {

        System.out.println("Cadastrando livro... ");
        Livro livro = new Livro();

        System.out.println("Digite um nome: ");
        String nome = lerDado();
        livro.setNome(nome);

        System.out.println("Digite o gênero: DRAMA, SUSPENSE, ROMANCE");
        String genero = lerDado();
        livro.setGenero(Genero.valueOf(genero.toUpperCase()));

        System.out.println("DIgite um preço(padrão 0.0)");
        String preco = lerDado();
        livro.setPreco(Double.parseDouble(preco));

        return livro;
    }
    /**
     * Ler os dados do caderno a ser cadastrado.
     * @return Um caderno a partir ddos dados de entrada
     */
    //TODO método para ler o caderno

    /**
     * Ler os dados do pedido e retorna um objeto a partir destes.
     * @return Um pedido a partir dos dados de entrada
     */
    public static Pedido lerPedido(Banco banco) {
        ProdutoNegocio produtoNegocio = new ProdutoNegocio(banco);

        System.out.println("Cadastrando pedido...");
        Pedido pedido = new Pedido();

        String opcao = "s";

        do {
            System.out.println("Digite o código do produto(Livro/Caderno)");
            String codigo = lerDado();

            Optional<Produto> resultado = produtoNegocio.consultar(codigo);
            if (resultado.isPresent()) {

                Produto produto = resultado.get();

                System.out.println("Digite a quantidade");
                String quantidade = lerDado();
                produto.setQuantidade(Integer.parseInt(quantidade));

                pedido.getProdutos().add(produto);
            }else {
                System.out.println("Produto inexitente. Escolha um produto válido");
            }
            System.out.println("Deseja selecionar masi produtos: [S/N]");
            opcao = lerDado();
        } while("s".equals(opcao));

        return pedido;
    }

    /**
     * Ler os dados do cupom e retorna um obketo a partir destes.
     * @return O cupom a partir dos dados de entrada
     */
    public static Optional<Cupom> lerCupom(Banco banco) {

        System.out.println("Caso queira utilizar algum cupom escolja entre: CUPOM2, CUPOM5, CUPOM7. se nao desejar, deixe o espaço em branco.");

        String desconto = lerDado();

        for(Cupom cupom: banco.getCupons()) {
            if(cupom.getCodigo().equalsIgnoreCase(desconto)) {
                return Optional.of(cupom);

            }
        }

        return Optional.empty();
    }
}
