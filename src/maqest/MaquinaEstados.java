package maqest;

import agente.Accao;
import ambiente.Evento;

public class MaquinaEstados {

    // readonly
    public Accao accao;
    public Estado estado;

    public MaquinaEstados(Estado estadoInicial) {
    }

    public Accao processar(Evento evento) {
        return null;
    }
}
