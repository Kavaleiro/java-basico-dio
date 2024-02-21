package DesafioPessoal.Desafio01.entidades.constantes;

/**
 * Gêneros dos livros vendidos.
 */

public enum Genero {

    DRAMA(15),
    SUSPENSE(10),
    ROMANCE(5);

    private double fator;

    /**
     * Construtor.
     * @param fator Valors por iumfluencia no cálculo do frete
     */
    Genero(double fator) {
        this.fator = fator / 100;

    }

    public double getFator() {
        return fator;
    }
}
