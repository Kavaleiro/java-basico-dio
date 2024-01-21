package ControledeFluxo.TesteRepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class TesteTres {
    public static void main(String[] args) {
    Double dinheiro = 10.0;

    while (dinheiro > 0 ) {
        Double dinheiroTroco = dinheiroAleatorio();

        if (dinheiroTroco > dinheiro)
            dinheiroTroco = dinheiro;

        System.out.println("Seu troco e: " + dinheiroTroco);
        dinheiro = dinheiro - dinheiroTroco;
    }
    System.out.println("Seu Saldo e: " + dinheiro);
    }
    private static double dinheiroAleatorio(){
        return ThreadLocalRandom.current().nextDouble();
    }
}
