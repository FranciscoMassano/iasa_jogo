package maqest;

import agente.Accao;
import ambiente.Evento;

public class Estado {
    public String nome;
    public Accao accao;
    private String[] transicoes;

    public Estado(String nome) {
    }

    public Transicao processar(Evento evento) {
        return null;
    }

    public Estado transicao(Evento evento, Estado estadoSucessor) {
        return null;
    }

    public Estado transicao(Evento evento, Estado estadoSucessor, Accao acao) {
        return null;
    }

}
