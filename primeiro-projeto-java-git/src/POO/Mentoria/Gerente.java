package POO.Mentoria;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao{
    /** Olhar a aula na hora 1:25 */
    @Override
    public void calculaBonificacao(Double porcentagemBonificacao){
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100) + 100d );   

    }

    private Double valorBonificacao;

    @Override
    public String toString(){
        return "Gerente {" +
        "nome=" +super.getNome()+ '\'' +
        ", documento= "+ super.getDocumento()+ '\'' +
        ", endereco= "+ super.getEndereco().getRua() + '\'' +
        ", horasTrabalhadas= " +super.getHorasTrabalhadas()+ '\'' +
        ", valorHora= "+ super.getValorHora()+'\'' +
        ", valorRemuneracao= "+super.getValorRemuneracao()+'\''+
        ", valorBonificacao= "+this.valorBonificacao +
        '}';
    }
    
}
