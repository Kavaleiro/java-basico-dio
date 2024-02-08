package DesafioPessoal;
/*O Desafio é fazer um algoritmo que calcule e esreva:
 * [A]--- A Maior e a Menor altura.
 * [B]--- A média de altura dos homens
 * [C]--- Número de Mulheres
 */

import java.util.Scanner;

public class MediaPessoas {
    public static void main(String [] args){

        Double maiorAltura = 0.0; Double menorAltura = 800.0;
        Double somaH = 0.0; Double mediaAlturaHomem = 0.0;
        int numeroMulher = 0; int genero = 0; int numeroH = 0;
        boolean verifica = false;
        
        Scanner input = new Scanner(System.in);

        for(int x = 0; x < 3; x++ ) {
            System.out.println("---------------------------");
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
            if(genero == 1){
                numeroMulher ++;
            }

            System.out.println("Qual a sua altura: ");
            Double altura = input.nextDouble();
            if(altura > maiorAltura){
                maiorAltura = altura;
            }
            if(altura < menorAltura){
                menorAltura = altura;
            }

            if (genero == 2){
                numeroH++;
                somaH = somaH + altura;
            }
            System.out.println("---------------------------");
        }
        mediaAlturaHomem = somaH / numeroH;
        System.out.println("numero de mulheres: "+numeroMulher);
        System.out.println("Maior altura: "+maiorAltura);
        System.out.println("Menor altura: "+ menorAltura);
        System.out.println("A media de alturas dos homnens é: "+ mediaAlturaHomem);
        input.close();
    }
    
}
