package jogo.personagem;

import agente.Accao;
import agente.Controlo;
import agente.Percepcao;

public class ControloPersonagem implements Controlo {
    public Percepcao percepcao;
    public Accao accao;

    public ControloPersonagem() {
    }

    /*
     * É retornada uma ação, tendo em conta o evento percecionado
     */
    public Accao processar(Percepcao percepcao) {
        throw new UnsupportedOperationException("Unimplemented method 'processar'");
    }

    /*
     * Aprensenta a aplicaçao da acao do personagem na interface do jogo
     */
    private void mostrar() {
    }

}
