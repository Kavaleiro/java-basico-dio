package DesafioPessoal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CalculoAposta {

    public static void main(String[] args) {
        
        int i = 1; int x = 1;
        int sair;


        try {
            Scanner sc = new Scanner(System.in);
            do {

                ArrayList <Double> ganho = new ArrayList<>();
                ArrayList <Double> perda = new ArrayList<>();

                System.out.println("Qual foi o seu ganho:");
                while( sc.hasNextDouble()){
                    ganho.add(sc.nextDouble());
                    break;
                }
                System.out.println("Qual foi sua perda: ");
                perda.add(sc.nextDouble());

                System.out.println("[1]-----CONTINUAR");
                System.out.println("[0]-----SAIR");
                sair = sc.nextInt();
                if(sair == 0){
                    System.out.println("Muito obrigado por participar!!");
                    System.out.print("\n-----SEUS GANHOS-----");
                    for( i = 1; i < ganho.size(); i++) {
                        System.out.println("["+i+"]-----"+ganho);
                    }

                    System.out.print("\n-----SUAS PERDAS-----");
                    for(double p : perda){
                        System.out.println("["+x+"]-----"+perda);
                        x++;
                    }
                }
            }while(sair!=0);

        }catch(Exception e){
            System.out.println("Voce digitou um valor inválido!!");
            return;
        }
    }
}