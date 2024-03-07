package jogo.personagem;

import agente.Agente;
import jogo.ambiente.AmbienteJogo;

public class Personagem extends Agente {
  public ControloPersonagem controlo;

  /*
   * Constructor da classe personagem
   */
  public Personagem(AmbienteJogo ambiente) {
    super(ambiente, new ControloPersonagem());
  }

}
