package ambiente;

public interface Ambiente {
  void evoluir();

  Evento observar();

  void executar(Comando comando);
}
