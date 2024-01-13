package exercicios.aula.exercicioss;

public class Usuario {
    public static void main(String [] args) throws Exception {
        SmartTv smartv = new SmartTv();

        smartv.diminuirVolume();
        smartv.diminuirVolume();
        System.out.println("Volume atual: " +smartv.volume);

        System.out.println("Voce esta no Canal: " +smartv.canal);
        System.out.print("Mudando de Canal...");
        smartv.mudarCanal(13);
        System.out.println("Seu Canal atual é: " +smartv.canal);

        System.out.println("TV Ligada  " +smartv.ligada);
        System.out.println("Canal Atual " +smartv.canal);
        System.out.println("Volume Atual " +smartv.volume);
    
        smartv.desligar();
        System.out.println("Novo status ---> Tv ligada " +smartv.ligada);
    }
    
}
