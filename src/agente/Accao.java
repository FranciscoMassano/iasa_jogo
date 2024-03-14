package agente;

import ambiente.Comando;

public class Accao {
  /*
   * O comando a processado pelo controlo e executado pelo agente
   */
  public Comando comando;

  /*
   * Contructor da classe Percepcao
   */
  public Accao(Comando comando) {
    this.comando = comando;
  }

  public Comando getComando() {
    return comando;
  }
}