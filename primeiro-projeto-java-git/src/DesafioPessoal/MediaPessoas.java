package DesafioPessoal;
/*O Desafio é fazer um algoritmo que calcule e esreva:
 * [A]--- A Maior e a Menor altura.
 * [B]--- A média de altura dos homens
 * [C]--- Número de Mulheres
 */

import java.util.Scanner;

public class MediaPessoas {
    public static void main(String [] args){

        Double maiorAltura = 0.0; Double menorAltura = 0.0; Double mediaAlturaHomem = 0.0;
        int numeroMulher = 0; int genero = 0;
        boolean verifica = false;
        
        Scanner input = new Scanner(System.in);

        for(int x = 0; x < 3; x++ ) {
            System.out.println("Qual o seu genero: ");
            System.out.println("[1]-----MULHER");
            System.out.println("[2]-----HOMEM");

            do {
                genero = input.nextInt();
                if (genero == 1 || genero == 2){
                    verifica = true;
                    break;
                } else {
                    System.out.println("ESSA É UMA OPÇÃO INVÁLIDA.");
                    System.out.println("Por favor escolha umas das opções.");
                    System.out.println("Qual o seu genero: ");
                    System.out.println("[1]-----MULHER");
                    System.out.println("[2]-----HOMEM");
                }
            } while (verifica !=false);

            System.out.println("Qual a sua altura: ");
            do { 
                Double altura = input.nextDouble();
            } while ( verifica !=false);
        }
    }
    
}
