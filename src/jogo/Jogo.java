package jogo;

import jogo.ambiente.Ambiente;
import jogo.personagem.Personagem;

public class Jogo {
  private static Ambiente ambiente;
  private static Personagem personagem;

  /*
   * O metodo main executa o jogo
   */
  public static void main(String[] args) {
    ambiente = new Ambiente(); // teste para a classe ambiente
    personagem = new Personagem(ambiente); // teste para as classes do package personagem
    executar();
  }

  /*
   * Executa as acoes do jogo, executando eventos do ambiente e accoes do
   * personagem-
   */
  private static void executar() {

    // TESTES A SER ELEMINADOS
    // Neste teste, uma mensagem é apresentada na consola
    // Deve apresentar a execucao da classe Ambiente, com o evento 'SILENCIO'
    ambiente.getEvento();
    // Neste teste, varias mensagens são apresentadas na consola
    // Deve apresentar a execucao da classe Personagem, com a accao 'PROCURAR'
    // Deve apresentar a execucao da classe Controlo, com a accao 'PROCURAR'
    // Deve apresentar a execucao da classe Percepcao, com o evento 'SILENCIO'
    personagem.executar();
  }

}