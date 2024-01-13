package exercicios.aula.exercicioss;

public class Usuario {
    public static void main(String [] args) throws Exception {
        SmartTv smartv = new SmartTv();

        smartv.diminuirVolume();
        smartv.diminuirVolume();

        System.out.println("TV Ligada  " +smartv.ligada);
        System.out.println("Canal Atual " +smartv.canal);
        System.out.println("Volume Atual " +smartv.volume);
    
        smartv.ligar();
        System.out.println("Novo status ---> Tv ligada " +smartv.ligada);
    }
    
}
