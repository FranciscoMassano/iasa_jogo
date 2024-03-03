package jogo.personagem;

import jogo.ambiente.Ambiente;
import jogo.ambiente.Evento;

public class Personagem {

  /*
   * Ambiente - Objecto que representa o ambiente do jogo
   * 
   * Controlo - Objecto responsavel pelas acoes e percepcoes do personagem
   */
  private Ambiente ambiente;
  private Controlo controlo;

  /*
   * Construtor para a classe Personagem
   */
  public Personagem(Ambiente ambiente) {

  }

  /*
   * Executa uma accao de acordo com o Controlo
   */
  public void executar() {
    // TESTES A SER ELEMINADOS
    // Testes de verificacao de arquitetura
    // Teste a classe personagem
    actuar(Accao.PROCURAR);
    // Teste a classe Controlo e Percepcao
    controlo = new Controlo();
    controlo.processar(null);
  }

  /*
   * Obtem uma instancia de percepcao de acordo com o evento ativo
   */
  private Percepcao percepcionar() {
    return null;
  }

  /*
   * Apresenta a aplicaçao da acao do personagem na interface do jogo
   */
  private void actuar(Accao accao) {
    // TESTES A SER ELEMINADOS
    System.out.println("Execucao da classe Personagem, Accao: " + accao);
  }
}
