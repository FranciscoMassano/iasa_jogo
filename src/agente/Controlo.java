package agente;

/*
 * Classe abstrata de controlo. Pode ter metodos abstractos e não abstractos
 */
public interface Controlo {
  public abstract Accao processar(Percepcao percepcao);
}