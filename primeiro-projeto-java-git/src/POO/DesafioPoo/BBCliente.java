package POO.DesafioPoo;

public abstract class BBCliente {
    
    protected String Nome;
    protected String Sobrenome;
    protected String cpf;

    public String getNome(){
        return Nome;
    }
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public String getSobrenome(){
        return Sobrenome;
    }
    public void setSobrenome(String Sobrenome){
        this.Sobrenome = Sobrenome;
    }    
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
}
