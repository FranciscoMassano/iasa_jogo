package jogo.ambiente;

import ambiente.Evento;

public enum EventoJogo implements Evento {
    SILENCIO,
    RUIDO,
    ANIMAL,
    FUGA,
    FOTOGRAFIA,
    TERMINAR;

    public Evento evento;

    @Override
    public void mostrar() {
        System.out.println("Evento:" + evento);
    }
}
