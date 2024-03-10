package POO.Mentoria;

public abstract class FuncionarioPJ {

    private String nome;
    private String documento;
    private Endereco endereco;
    private Integer horasTrabalhadas;
    private Double valorHora;
    private Double valorRemuneracao;

    public void calculoRemuneracao(){
        this.valorRemuneracao = this.horasTrabalhadas * this.valorHora;
    }


    //Nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //documento
    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }

    //Endereco
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    //Horas trabalhadas
    public Integer getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(Integer horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Valoras hora
    public Double getValorHora(){
        return valorHora;
    }
    public void setValorHora(Double valorHora){
        this.valorHora = valorHora;
    }

    //Valor da Remuneração
    public Double getValorRemuneracao(){
        return valorRemuneracao;
    }
    public void setValorRemuneracao(Double valorRemuneracao){
        this.valorRemuneracao = valorRemuneracao;
    }
    
}
