package ControledeFluxo;

public class ExemploForArray {
    public static void main(String[] args) {
        
        //em arrays o indice inicia em ZERO
        String alunos [] = {"FELIPE", "JOAO", "MARIA", "DARIO"};

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x= "+x +" é " + alunos[x]);
        }
    }
    
}
