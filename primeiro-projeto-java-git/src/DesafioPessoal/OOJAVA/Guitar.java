package DesafioPessoal.OOJAVA;

public class Guitar {

    //Defininir os "Membros"- propriedades e metodos(Comportamentos)
    
    //propriedade
    private String firstName;
    public String lastName;
    public String fullName;

    //SETTER
    public void setFirstname(String firstName){
        this.firstName= firstName.toUpperCase();
    }

    //GETTER
    public String getFirstName(){
        return firstName;
    }
}