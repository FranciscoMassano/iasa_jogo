package jogo.ambiente;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import ambiente.Ambiente;
import ambiente.Comando;
import ambiente.Evento;

public class AmbienteJogo implements Ambiente {

    // Discreto: porque tem um conjunto finito de estados
    // Estocástico: por ter alguma imprevisibilidade
    // Parcialmente Observável: não tenho conhecimento total do ambiente
    // Tem agente único
    // Estático: o ambiente não muda, o que mudam são os comportamentos do agente

    /*
     * As caracteristicas deste ambiente são:
     * 1. Discreto: porque tem um conjunto finito de eventos
     * 2. Estocástico: por ter alguma imprevisibilidade
     * 3. Parcialmente Observável: não tenho conhecimento total do ambiente
     * 4. Estático: o ambiente não muda, o que mudam são os comportamentos do agente
     */

    /*
     * O Enumerado EventosJogo contém os eventos possiveis de acontecer, evento
     * representa o actual evento
     * O mapa eventos guarda o mapeamento entre inputs e eventos
     * O scanner recebe o input do utilizador
     */
    public Comando comando;
    private EventoJogo evento;
    private Map<String, EventoJogo> eventos;
    private Scanner scanner = new Scanner(System.in);

    /*
     * Construtor da classe AmbienteJogo
     * Aqui definimos os inputs que corresndem aos eventos
     */
    public AmbienteJogo() {
        eventos = new HashMap<String, EventoJogo>();
        eventos.put("silencio", EventoJogo.SILENCIO);
        eventos.put("ruido", EventoJogo.RUIDO);
        eventos.put("animal", EventoJogo.ANIMAL);
        eventos.put("fuga", EventoJogo.FUGA);
        eventos.put("fotografia", EventoJogo.FOTOGRAFIA);
        eventos.put("terminar", EventoJogo.TERMINAR);
    }

    /*
     * O ambiente evolui de acordo com o evento escolhido
     */
    public void evoluir() {
        this.evento = (EventoJogo) observar();
        executar(comando);
    }

    /*
     * O agente observa o ambiente, disto resulta um evento
     */
    public Evento observar() {
        Evento evento = gerarEvento();
        return evento;
    }

    /*
     * Vai gerar o evento de acordo com input do utilizador
     */
    private EventoJogo gerarEvento() {
        String in = scanner.next();
        return eventos.get(in);
    }

    /*
     * Deve executar o o comando escolhido
     */
    public void executar(Comando comando) {
        comando.mostrar();
    }

    /*
     * Uma vez que a propriedade evento é read only, é possível obter o evento com
     * um getter
     */
    public EventoJogo getEvento() {
        return evento;
    }

}
