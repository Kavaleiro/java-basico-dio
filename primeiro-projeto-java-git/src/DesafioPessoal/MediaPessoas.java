package DesafioPessoal;

import java.util.Scanner;

public class MediaPessoas {
    public static void main(String[] args) {
        
        Double maiorAltura, menorAltura, alturaHomem;
        int qual, numeroMulher;
        Scanner sc = new Scanner(System.in);
        int x = 0;
         numeroMulher = 0;
        do{
            System.out.println("Bem-vindo ao contador de media!!");
            System.out.println("Qual o seu gênero: ");
            System.out.println("[1]-----MULHER");
            System.out.println("[2]-----HOMEM");
            System.out.println("[0]-----SAIR");
            qual = sc.nextInt();

            if (qual == 0){
                System.out.println("MUITO OBRIGADO POR PARTICIPAR!!");
                break;
            }
            if (qual == 1){
                int M = numeroMulher + 1;
                numeroMulher = M;
            }
            x++;
        }while(x!=10);
        System.out.println(numeroMulher);

    }
    
}
