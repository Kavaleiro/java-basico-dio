package ControledeFluxo.Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimiarCandidatos();
    }

    static void entrandoContato(String candidato){
        int tentativas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuaTentando =! atendeu;
            if(continuaTentando){
                tentativas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO!!");
            }

        }while(continuaTentando && tentativas<3);

        if(atendeu){
            System.out.println("Conseguimos contato com "+ candidato+ " na ("+ tentativas+") Tentativa.");   
        } else{
            System.out.println("Não conseguimos entrar em contato com "+ candidato+" Numero máximo de ligações atingidas.");
        }

    }

    //Método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimiarCandidatos(){
         
        String [] candidatos = {"FELIPE", "TIAGO","JOÃO","SEILA","QUEILA"};
        for(String candidato: candidatos){
            entrandoContato(candidato);
        }
        /*System.out.println("Imprimindo a lista de candidatos informando o indice ");
        for(int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato de n*"+(i+1)+" é "+ candidatos[i]);
            entrandoContato(candidato);
        }*/

    }
    static void selecaoCandidatos(){
        
        String [] candidatos = {"FELIPE", "TIAGO","JOÃO","SEILA","QUEILA","BEILA","GEILA"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato "+ candidato+" solicitou este valor de salario "+salarioPretendido );
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato+" foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;

        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2000);
    }
}

    /*static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");
        }else if(salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}*/
