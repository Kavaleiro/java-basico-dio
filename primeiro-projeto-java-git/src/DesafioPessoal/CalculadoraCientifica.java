package DesafioPessoal;

import java.util.Scanner;


public class CalculadoraCientifica {
    public static void main(String[] args) {
        
        short escolha;
        double numeroUm, numeroDois;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                escolha = 0;
                try {
                    System.out.println("-----------------------------");
                    System.out.print("Digite um Numero: ");
                    numeroUm = sc.nextDouble();
                    System.out.print("Digite outro Numero: ");
                    numeroDois = sc.nextDouble();


                    System.out.println("O que voce deseja fazer: ");
                    System.out.println("Escolha uma alternativa: ");
                    System.out.println("[1]----SOMAR");
                    System.out.println("[2]----SUBTRAIR");
                    System.out.println("[3]----MULTIPLICAR");
                    System.out.println("[4]----DIVIDIR");
                    escolha = sc.nextShort();

                    double PROD = 0;
                    if (escolha == 1){
                        PROD = numeroUm + numeroDois;
                        System.out.println("Voce escolheu SOMAR, o seu resultado é...");
                        System.out.println(numeroUm+ " + "+numeroDois +" = "+ PROD);
                    }
                    if ( escolha == 2){
                        PROD = numeroUm - numeroDois;
                        System.out.println("Voce escolheu SUBTRAIR. o seu resultado é...");
                        System.out.println(numeroUm+ " - "+numeroDois +" = "+ PROD);
                    }
                    if (escolha == 3) {
                        PROD = numeroUm *numeroDois;
                        System.out.println("Voce escolheu MULTIPLICAR,  o seu resultado é ...");
                        System.out.println(numeroUm+ " X "+numeroDois +" = "+ PROD);
                    }
                    if (escolha == 4) {
                        PROD = numeroUm / numeroDois;
                        System.out.println("Voce escolheu DIVIDIR, o seu resultado é...");
                        System.out.println(numeroUm+ " : "+numeroDois +" = "+ PROD);
                    }
                    System.out.println("-----------------------------");
                    System.out.println("Você deseja continuar: ");
                    System.out.println("[1]----SIM ");
                    System.out.println("[0]----NÃO ");
                    escolha = sc.nextShort();
                    if(escolha == 0){
                        System.out.println("-----------------------------");
                        System.out.println("MUITO OBRIGADO POR PARTICIPAR!!");
                        break;
                    
                    }
                if (escolha == 0) {
                    break;
                }
                }
                
                catch(Exception e){
                    System.out.println("Os campos precisam ser numéricos!!");
                }
   
            } while(escolha != 0);
        }

    }
} 
 
