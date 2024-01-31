package ControledeFluxo.DesafioControledeFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {

        int n1;int n2; int result;
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = terminal.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = terminal.nextInt();
        try{

            Contador(n1, n2);

        }catch(ParametrosInvalidosException e) {
        e.ParametrosInvalidosException();
        }
        terminal.close();
    }
    static void Contador(int n1, int n2) throws ParametrosInvalidosException {
        if (n1 > n2)
            throw new ParametrosInvalidosException();
    

    int result = n2 - n1;
        for(int i = 0; i < result; i++){

            System.out.println("imprimindo o número "+(i+1));

        }
    }
}