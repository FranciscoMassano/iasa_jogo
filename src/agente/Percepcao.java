package agente;

import ambiente.Evento;

public class Percepcao {
  /*
   * O evento a ser processado pelo controlo que resulta numa accao do agente
   */
  private Evento evento;

  /*
   * Contructor da classe Percepcao, vai definir o evento a ser processado
   */
  public Percepcao(Evento evento) {
    this.evento = evento;
  }

  /*
   * Retorna o evento para uso de outras classes porque a propriedade evento é
   * read only
   */
  public Evento getEvento() {
    return evento;
  }
}
