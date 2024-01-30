package DesafioPessoal;

import java.util.Scanner;
import java.util.ArrayList;

public class CalculoAposta {

    public static void main(String[] args) {

        
        int sair;
        double totganho = 0; double totperda = 0; double maiorganho = 0; double maiorperda = 0;

        ArrayList <Double> ganho = new ArrayList<>();
        ArrayList <Double> perda = new ArrayList<>();

        try {
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Qual foi o seu ganho:");
                while( sc.hasNextDouble()){
                    ganho.add(sc.nextDouble());
                    System.out.println("Qual foi sua perda: ");
                    perda.add(sc.nextDouble());
                    sc.close();
    
                    break;
                }
                System.out.println("[1]-----CONTINUAR");
                System.out.println("[0]-----SAIR");
                sair = sc.nextInt();
            }while(sair!=0);
                System.out.println("Muito obrigado por participar!!");
                System.out.print("\n-----SEUS GANHOS-----\n");
                
            for( int i = 0; i < ganho.size(); i++) {
                System.out.println("["+(i+1)+"]-----  "+ganho.get(i));
                totganho +=  ganho.get(i);
                if(ganho.get(i) > maiorganho){
                    maiorganho = ganho.get(i);
                }

            }

            System.out.print("\n-----SUAS PERDAS-----\n");
            for(int x = 0; x < perda.size(); x++){
                System.out.println("["+(x+1)+"]-----  "+perda.get(x));
                totperda += perda.get(x);
                if(perda.get(x) > maiorperda){
                    maiorperda = perda.get(x);
                }
            }
            Double saldo = totganho - totperda;  
            System.err.println("=====================================");
            System.err.println("SEU SALDO--------------------"+ saldo);     
            System.err.println("MAIOR VALOR GANHO------------"+ maiorganho);     
            System.err.println("MAIOR VALOR PERDIDO----------"+ maiorperda);     
            System.err.println("=====================================");     

        }catch(Exception e){
            System.out.println("Voce digitou um valor inválido!!");

        }
    }
}