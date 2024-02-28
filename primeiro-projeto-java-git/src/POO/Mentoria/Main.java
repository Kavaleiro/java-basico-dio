package POO.Mentoria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Endereco endereco = new Endereco();
        System.out.println("Diga o seu endereco. ");
        String End = sc.nextLine();
        endereco.setRua(End);
        System.out.println(endereco.getRua());
        sc.close();
    }
    
}
