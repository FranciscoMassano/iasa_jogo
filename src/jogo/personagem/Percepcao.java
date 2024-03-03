package jogo.personagem;

import jogo.ambiente.Evento;

public class Percepcao {
    /*
     * O evento a ser processado
     */
    private Evento evento;

    /*
     * Contructor da classe Percepcao
     */
    public Percepcao(Evento evento) {

    }

    /*
     * Retorna o proximo evento processado pela classe Controlo
     */
    public Evento getEvento() {
        return evento;
    }

}
