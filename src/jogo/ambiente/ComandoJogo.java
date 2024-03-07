package jogo.ambiente;

import ambiente.Comando;

public enum ComandoJogo implements Comando {
    PROCURAR,
    APROXIMAR,
    OBSERVAR,
    FOTOGRAFAR;

    @Override
    public void mostrar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
    }
}
