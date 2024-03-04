package agente;

import ambiente.Ambiente;

public abstract class Agente {
  /*
   * Ambiente - Objecto que representa o ambiente do jogo
   * 
   * Controlo - Objecto responsavel pelas acoes e percepcoes do personagem
   */
  private Ambiente ambiente;
  private Controlo controlo;

  /*
   * Construtor para a classe Agente
   */
  public Agente(Ambiente ambiente, Controlo controlo) {

  }

  public void executar() {

  }

  protected Percepcao percepcionar() {
    return null;
  }

  /*
   * Apresenta a aplicaçao da acao do personagem na interface do jogo
   */
  protected void actuar(Accao accao) {

  }
}
