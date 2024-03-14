package jogo.personagem;

import agente.Accao;
import agente.Controlo;
import agente.Percepcao;
import jogo.ambiente.ComandoJogo;
import jogo.ambiente.EventoJogo;
import maqest.Estado;
import maqest.MaquinaEstados;

public class ControloPersonagem implements Controlo {
  private Percepcao percepcao;
  private Accao accao;
  private MaquinaEstados maqEst;

  /*
   * Define os estados e transicoes, assim como a maquina de estado que os
   * controla
   */
  public ControloPersonagem() {
    Estado procura = new Estado("Procura");
    Estado inspecao = new Estado("Inspeção");
    Estado observacao = new Estado("Observação");
    Estado registo = new Estado("Registo");

    procura
        .transicao(EventoJogo.ANIMAL, observacao, new Accao(ComandoJogo.APROXIMAR))
        .transicao(EventoJogo.RUIDO, inspecao, new Accao(ComandoJogo.APROXIMAR))
        .transicao(EventoJogo.SILENCIO, procura, new Accao(ComandoJogo.PROCURAR));
    inspecao
        .transicao(EventoJogo.ANIMAL, observacao, new Accao(ComandoJogo.APROXIMAR))
        .transicao(EventoJogo.RUIDO, inspecao, new Accao(ComandoJogo.PROCURAR))
        .transicao(EventoJogo.SILENCIO, procura);

    observacao
        .transicao(EventoJogo.ANIMAL, registo, new Accao(ComandoJogo.OBSERVAR))
        .transicao(EventoJogo.FUGA, inspecao);

    registo
        .transicao(EventoJogo.ANIMAL, registo, new Accao(ComandoJogo.FOTOGRAFAR))
        .transicao(EventoJogo.FUGA, procura)
        .transicao(EventoJogo.FOTOGRAFIA, procura);

    maqEst = new MaquinaEstados(procura);
  }

  /*
   * É retornada uma ação, tendo em conta o evento percecionado
   */
  public Accao processar(Percepcao percepcao) {
    this.percepcao = percepcao;
    this.accao = maqEst.processar(this.percepcao.getEvento());
    mostrar();
    return accao;
  }

  /*
   * Apresenta a aplicaçao da acao do personagem na interface do jogo
   */
  private void mostrar() {
    System.out.println("\nOpções Válidas:"
        + "\nsilencio -> Silêncio"
        + "\nruido -> Ruído"
        + "\nanimal -> Animal"
        + "\nfuga -> Fuga"
        + "\nfotografia -> Fotografia"
        + "\nterminar -> Terminar");
    System.out.println("Estado: " + getEstado().nome);
  }

  /*
   * Getter para o Estado, propriedade read only
   */
  public Estado getEstado() {
    return this.maqEst.getEstado();
  }

}
