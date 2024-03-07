package jogo.ambiente;

import ambiente.Evento;

public enum EventoJogo implements Evento {
    SILENCIO,
    RUIDO,
    ANIMAL,
    FUGA,
    FOTOGRAFIA,
    TERMINAR;

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
    }
}
