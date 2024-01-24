package DesafioPessoal;

import java.util.Locale;
import java.util.Scanner;

public class DP {
    public static void main(String[] args) {

            try(      
            Scanner sc = new Scanner(System.in).useLocale(Locale.US)){
            System.out.println("Digite um Numero: ");
            int numeroUm = sc.nextInt();
            System.out.println("Digite outro Numero: ");
            int numeroDois = sc.nextInt();

            System.out.println("O que voce deseja fazer: ");
            System.out.println("Escolha uma alternativa: ");
            System.out.println("[1]----SOMAR");
            System.out.println("[2]----SUBTRAIR");
            System.out.println("[3]----MULTIPLICAR");
            System.out.println("[4]----DIVIDIR");
            int escolha = sc.nextInt();

            if (escolha == 1){
                int PROD = numeroUm + numeroDois;
                System.out.println("Voce escolheu SOMAR, o seu resultado é...");
                System.out.println(numeroUm+ " + "+numeroDois +" = "+ PROD);
            }
            if ( escolha == 2){
                int PROD = numeroUm - numeroDois;
                System.out.println("Voce escolheu SUBTRAIR. o seu resultado é...");
                System.out.println(numeroUm+ " - "+numeroDois +" = "+ PROD);
            }
            if (escolha == 3) {
                int PROD = numeroUm *numeroDois;
                System.out.println("Voce escolheu MULTIPLICAR,  o seu resultado é ...");
                System.out.println(numeroUm+ " X "+numeroDois +" = "+ PROD);
            }
            if (escolha == 4) {
                int PROD = numeroUm / numeroDois;
                System.out.println("Voce escolheu DIVIDIR, o seu resultado é...");
                System.out.println(numeroUm+ " : "+numeroDois +" = "+ PROD);
            }
            
            System.out.println("Voce deseja continuar: ");
            System.out.println("[1]----SIM");
            System.out.println("[2]----NÃO");
            boolean cont = sc.nextInt(3)==3;
        }
    }
} 

