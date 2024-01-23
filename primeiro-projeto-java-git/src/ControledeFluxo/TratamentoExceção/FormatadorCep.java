package ControledeFluxo.TratamentoExceção;

public class FormatadorCep {
    public static void main(String[] args) {
        try { 
            String cepFormatado = formatarCep("3765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            //TODO Auto-generated catch block
            System.out.println("O cep precisa conter 8 némeros!");
        }
    }  
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8 )//difeten te 8
            throw new CepInvalidoException();

            //simulando um cep formatado
            return "23.765-064";

    }
}