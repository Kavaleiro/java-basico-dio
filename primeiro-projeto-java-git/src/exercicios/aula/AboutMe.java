package exercicios.aula;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try (//criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Digite a sua idade ");
            int idade = scanner.nextInt();

            System.out.println("Digite o seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next(); 
            //imprimindo os dados obtidos!!
            System.out.println("Oi, me chamo " + nome + " "+sobrenome);
            System.out.println("Tenho "+idade+" anos" );
            System.out.println("Minha Altura e "+altura+ " cm");
        }
        }      
}
