package exercicios.Desafio;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try(
        Scanner sc = new Scanner(System.in).useLocale(Locale.US)){

        int A, B, PROD;

        System.out.println("Digite um numero: ");
        A = sc.nextInt();

        System.out.println("Digite outro numero: ");
        B = sc.nextInt();

        PROD = A + B;

        System.out.println("A soma entre esse numeros foi: " +PROD);
        }
    }
}
