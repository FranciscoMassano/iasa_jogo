package jogo.personagem;

// TESTES A SER ELEMINADOS
// Testes de verificacao de arquitetura
import jogo.ambiente.Evento;

/*
 * A classe Controlo representa o controle das ações e percepções do personagem.
 */
public class Controlo {

  /*
   * Percepcao - objeto que representa a percepcao do personagem
   * Accao - objeto que representa a acao do personagem
   */
  public Percepcao percepcao;
  public Accao accao;

  /*
   * Processa uma percepção e determina a ação a ser realizada pelo personagem
   */
  public Accao processar(Percepcao percepcao) {
    return accao;
  }

}
