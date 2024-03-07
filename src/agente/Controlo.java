package agente;

/*
 * Classe abstrata de controlo. Pode ter metodos abstractos e não abstractos
 */
public abstract class Controlo {
  public Percepcao percepcao;
  public Accao accao;

  public abstract Accao processar(Percepcao percepcao);
}