package agente;

import ambiente.Ambiente;
import ambiente.Evento;

/* 
 * Classe abstracta responsável pelo agente do jogo
*/
public abstract class Agente {
  /*
   * Ambiente - Objecto que representa o ambiente do jogo
   * Controlo - Objecto responsavel pelas acoes e percepcoes do personagem
   */
  private Ambiente ambiente;
  private Controlo controlo;

  /*
   * Construtor para a classe Agente
   */
  public Agente(Ambiente ambiente, Controlo controlo) {
    this.ambiente = ambiente;
    this.controlo = controlo;
  }

  /*
   * Metodo para executar a ação do agente
   * Primeiro perceciona
   * Depois processa o evento e escolhe uma ação
   * No fim actua de acordo com a ação
   */
  public void executar() {
    Percepcao percecao = percepcionar();
    Accao accao = controlo.processar(percecao);
    actuar(accao);
  }

  /*
   * Gera uma percepcao de acordo com um evento obtido no ambiente.
   */
  protected Percepcao percepcionar() {
    Evento evento = ambiente.observar();
    Percepcao percepcao = new Percepcao(evento);
    return percepcao;
  }

  /*
   * Apresenta a aplicaçao da acao do personagem na interface do jogo
   */
  protected void actuar(Accao accao) {

  }
}
