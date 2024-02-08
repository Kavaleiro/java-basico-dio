package POO;
/*Encapsulamento */
public class MSN {
    public void enviarMensagem(){
        validarConexao();
        System.out.println("Enviando Mensagem.");
        salvarHistorico();
    }

    public void receberMensagem(){
        System.out.println("recebendo Mensagem");
    }

    private void validarConexao(){
        System.out.println("Validando Conexão");
    }

    private void salvarHistorico(){
        System.out.println("Salvando hitorioco");
    }
}
