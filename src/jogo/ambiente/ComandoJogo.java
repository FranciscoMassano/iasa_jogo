package jogo.ambiente;

import ambiente.Comando;

public enum ComandoJogo implements Comando {
    PROCURAR,
    APROXIMAR,
    OBSERVAR,
    FOTOGRAFAR;

    @Override
    public void mostrar() {
        System.out.println("Comando: " + this);
    }
}
