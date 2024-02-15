package POO.Fabrica;

import POO.equipamentos.impressora.Desk;
import POO.equipamentos.impressora.Impressora;

public class Estabelecimento {
    public static void main(String[] args) {
        Impressora imp = new Desk();

        imp.imprimir();
    }
}
