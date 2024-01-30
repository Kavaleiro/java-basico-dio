package DesafioPessoal;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

import java.util.ArrayList;

public class MediaPessoas {
    public static void main(String[] args) {

        String sexo;
        int numeroMulher = 0;
        Double maiorAltura = 0.0;Double menoraltura = 20000.0;

        ArrayList <String> nome = new ArrayList<>();
        ArrayList <Double> altHomem = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        try {
        for(int x = 0; x < 3; x++){

            System.out.println("Qual o seu nome: ");
            nome.add(sc.next());
            System.out.println("Qual o seu sexo: [M/F]");
            sexo = sc.next();
            if (sexo == "M" || sexo == "m"){
                numeroMulher++;
            }
            System.out.println("Qual sua altura: ");
            Double altura = sc.nextDouble();
            if(altura>maiorAltura){
                maiorAltura = altura;
            }
            if(altura< menoraltura){
                menoraltura = altura;
            }
        } 

        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }

        System.out.println("============================================");
        System.out.println("A MAIOR ALTURA FOI ------ "+maiorAltura);
        System.out.println("A MENOR ALTURA FOI ------ "+menoraltura);
        System.out.println("A MÉDIA DE ALTURA DOS HOMENS FOI -------- "+altHomem);
        System.out.println("TOTAL DE MULHERES ---------------- "+numeroMulher );
        System.out.println("============================================");

        for(int i = 0; i < nome.size();i++){
            System.out.print(nome.get(i)+ " , ");
        }

    }    
}
