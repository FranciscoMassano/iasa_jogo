package maqest;

import java.util.HashMap;
import java.util.Map;
import agente.Accao;
import ambiente.Evento;

public class Estado {
    public String nome;
    private Map<Evento, Transicao> transicoes;

    public Estado(String nome) {
        this.nome = nome;
        transicoes = new HashMap<>();
    }

    /*
     * Consoante o estado actual e o evento, vai devolver uma transicao para uma
     * Accao
     */
    public Transicao processar(Evento evento) {
        return transicoes.get(evento);
    }

    /*
     * Utiliza-se a função transicao com parametro accao
     */
    public Estado transicao(Evento evento, Estado estadoSucessor) {
        return transicao(evento, estadoSucessor, null);
    }

    /*
     *
     * Retorna este objecto estado
     */
    public Estado transicao(Evento evento, Estado estadoSucessor, Accao accao) {
        Transicao t = new Transicao(estadoSucessor, accao);
        transicoes.put(evento, t);
        return this;
    }

}
