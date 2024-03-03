package jogo.ambiente;

public class Ambiente {
  /*
   * Evento - O evento é um objeto que contém informações sobre o evento ativo
   * Eventos - É a lista de todos os eventos possiveis de acontecer no ambiente
   */
  private Evento evento;
  private String[] eventos;

  /*
   * Construtor para o Ambiente
   */
  public Ambiente() {
  }

  /*
   * Retorna o evento que está actualmente ativo
   */
  public Evento getEvento() {
    return evento;
  }

  /*
   * Atribui um novo evento da lista de eventos possive e executa-o
   */
  public void evoluir() {

  }

  /*
   * Gera um novo evento, escolhido aleatoriamente da lista de eventos disponiveis
   */
  private Evento gerarEvento() {
    return evento;
  }

  /*
   * Apresenta na interface do jogo o evento que foi executado
   */
  private void mostrar() {
  }

}
