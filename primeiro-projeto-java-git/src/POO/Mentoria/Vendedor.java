package POO.Mentoria;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {

    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao){
        this.valorBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }
    
    /**É feito isso porque A palava "protected" vem da heranca Pai. */
    @Override
    public String toString(){ 
        return "Vendedor{" +
        "nome =" +nome +'\'' +
        ", documento = "+documento+'\''+
        ", valorSalario = "+valorSalario+'\''+
        ", endereco ="+endereco.getBairro()+'\''+
        ", valorBonificacao= "+valorBonificacao +
        '}';
    }
    
}
