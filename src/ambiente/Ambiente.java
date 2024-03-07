package ambiente;

/*
 * A interface Ambiente define os metodos a serem implementados por classes que herdem de Ambiente
 */
public interface Ambiente {
  void evoluir();

  Evento observar();

  void executar(Comando comando);
}
