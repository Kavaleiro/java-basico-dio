package ControledeFluxo.TratamentoExceção;

import java.util.Locale;
import java.util.Scanner;

public class aboutMe {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = sc.next();

        System.out.println("Sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();


        //imprimindo os resultados
        System.out.println("Olá, me chamo "+ nome +" "+sobrenome);
        System.out.println("Tenho "+idade +" anos");
        System.out.println("Minha altura e "+altura);
        sc.close();
        }
        catch (Exception e){
            System.err.println("Os campos idade e altura estao errados! ");
        }
    }
}
