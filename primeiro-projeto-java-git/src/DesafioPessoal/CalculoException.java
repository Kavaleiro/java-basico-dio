package DesafioPessoal;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculoException {
    public static void main(String[] arags) {
        
    Scanner sc = new Scanner(System.in);
    short sair;
    try {
        do{
            System.out.println("Digite seu nome");
            String nome = sc.next();
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = sc.next();
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();
            sair = 0;
        } 
        while(sair != 0);
    }

    catch(InputMismatchException e){
        System.err.println("Os campos precisam ser numéricos!!");// irei melhorar esse código
    }
    }
}
