package exercicios.Desafio;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        System.out.println("Digite um numero: ");
        A = sc.nextInt();

        System.out.println("Digite outro numero: ");
        B = sc.nextInt();

        PROD = A + B;

        System.out.println("A soma entre esse numeros foi: " +PROD);
    }
}
