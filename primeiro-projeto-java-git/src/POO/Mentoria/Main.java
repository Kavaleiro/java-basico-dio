package POO.Mentoria;

import POO.Mentoria.Models.Endereco;
import POO.Mentoria.Models.Gerente;
import POO.Mentoria.Models.OperadorCaixa;
import POO.Mentoria.Models.Vendedor;

public class Main {

    public static void main(String[] args) { 

       /**  Endereco endereco = new Endereco();
        endereco.getRua();
        System.out.println(endereco);/=*/

        Endereco endereco = new Endereco();
        endereco.setRua("Rua qualuer");
        endereco.setBairro("Dos bobos");
        endereco.setComplemento("Casa");
        System.out.println("=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=");


        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Felipe Barboza");
        vendedor.setDocumento("000-000-000");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);

        System.out.println("=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=");

        OperadorCaixa operadorCaixa = new OperadorCaixa();
        operadorCaixa.setNome("Joselina maria");
        operadorCaixa.setDocumento("0000.00123.1232");
        operadorCaixa.setValorSalario(500d);
        operadorCaixa.setEndereco(endereco);
        System.out.println(operadorCaixa);
        System.out.println("=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=");

        Gerente gerente = new Gerente();
        gerente.setNome("Valorso caetano");
        gerente.setDocumento("123.412391023");
        gerente.setHorasTrabalhadas(20);
        gerente.setEndereco(endereco);
        gerente.setValorHora(100d);

        gerente.calculoRemuneracao();   
        gerente.calculaBonificacao(3d);
        System.out.println(gerente);
    }
}
