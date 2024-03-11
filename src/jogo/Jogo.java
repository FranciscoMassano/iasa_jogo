package jogo;

import jogo.ambiente.AmbienteJogo;
import jogo.ambiente.EventoJogo;
import jogo.personagem.Personagem;

public class Jogo {

  private static AmbienteJogo ambiente;
  private static Personagem personagem;

  /*
   * Define o ambiente e personagem e executa o jogo
   */
  public static void main(String[] args) {
    Jogo jogo = new Jogo();
    ambiente = new AmbienteJogo();
    personagem = new Personagem(ambiente);
    jogo.executar();
  }

  public void executar() {
    do {
      ambiente.evoluir();
      personagem.executar();
    } while (!ambiente.getEvento().equals(EventoJogo.TERMINAR));

  }
}
