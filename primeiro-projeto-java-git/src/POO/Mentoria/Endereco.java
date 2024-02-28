package POO.Mentoria;

public class Endereco {

    private String rua;
    private String complemento;
    private String bairro;
    
    public Endereco(String rua, String complemento, String bairro) {

        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
    }
    public Endereco() {
    }

    //get/set de Rua
    public String getRua() { //Aqui ele está alterando
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
        /**Neste exemplo ele esta recebencod o atributo rua e fazendo alterações */
    }

    //Complemento
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    //Bairro
    public String getBairro(){
        return bairro;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
}
