package POO;
/*o servico Abstrato é aquele que 'Guarda' as ordens que,
OBRIGATORIAMENTE tem que ter em suas linhas de códigos tudo aquilo
que esta dentro da Classe ABSTRACT.
 * Uma espécie de Herança.
 */

public abstract class ServicoPai {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

     //Somente os filhos conhecem esse método.
    protected void ValidarConexao(){
        System.out.println("Validando a conexão...");
    }
    
}
