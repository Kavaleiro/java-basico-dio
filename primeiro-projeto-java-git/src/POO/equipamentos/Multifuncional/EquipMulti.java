package POO.equipamentos.Multifuncional;

import POO.equipamentos.copiadora.Copiadora;
import POO.equipamentos.digitadora.Digitadora;
import POO.equipamentos.impressora.Impressora;

public class EquipMulti implements Copiadora, Digitadora, Impressora{
    public void copiar(){
        System.out.println("Copiando Pelo Multi...");
    }

    public void digitar(){
        System.out.println("Digitando pelo Multi");

    }
    public void imprimir(){
        System.err.println("Imprimindo pelo Multi...");

    }
    
}
