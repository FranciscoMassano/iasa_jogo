package jogo.ambiente;

import ambiente.Ambiente;
import ambiente.Comando;
import ambiente.Evento;

public class AmbienteJogo implements Ambiente {

    public EventoJogo evento; // readonly??
    private Evento[] eventos;

    public AmbienteJogo() {

    }

    public void evoluir() {
        throw new UnsupportedOperationException("Unimplemented method 'evoluir'");
    }

    public Evento observar() {
        throw new UnsupportedOperationException("Unimplemented method 'observar'");
    }

    public void executar(Comando comando) {
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }

    private Evento gerarEvento() {
        return null;
    }

}
