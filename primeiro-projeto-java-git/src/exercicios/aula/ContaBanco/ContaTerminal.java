package exercicios.aula.ContaBanco;

 import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {

            System.out.println("Seu nome: ");
            String Nome = sc.next();

            System.out.println("Sobrenome: ");
            String Sobrenome = sc.next();

            System.out.println("Digite o sua conta: ");
            int Numero = sc.nextInt();

            System.out.println("Digite sua agencia: ");
            String Agencia = sc.next();

            System.out.println("Seu saldo: ");
            double Saldo = sc.nextDouble();

            System.out.println("Ola "+Nome +" "+Sobrenome +", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia +", conta "+Numero +" e seu saldo de R$"+Saldo +", ja está disponivel para saque!");
            
        }
    }
}
