package jogo.ambiente;

import ambiente.Evento;

public enum EventoJogo implements Evento {
  SILENCIO,
  RUIDO,
  ANIMAL,
  FUGA,
  FOTOGRAFIA,
  TERMINAR;

  private EventoJogo evento;

  @Override
  public void mostrar() {
    System.out.println("Evento: " + evento);
  }
}
