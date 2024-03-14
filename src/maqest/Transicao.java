package maqest;

import agente.Accao;

public class Transicao {
  private Estado estadoSucessor;
  private Accao acao;

  public Transicao(Estado estadoSucessor, Accao acao) {
    this.estadoSucessor = estadoSucessor;
    this.acao = acao;
  }

  /*
   * Retorna o estado sucessor definido pela Transicao
   */
  public Estado getEstadoSucessor() {
    return estadoSucessor;
  }

  /*
   * Retorna a accao definido pela Transicao
   */
  public Accao getAcao() {
    return acao;
  }

}
