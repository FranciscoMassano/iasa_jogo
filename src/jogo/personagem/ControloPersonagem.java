package jogo.personagem;

import agente.Accao;
import agente.Controlo;
import agente.Percepcao;
import maqest.Estado;
import maqest.MaquinaEstados;

public class ControloPersonagem extends Controlo {
    public Percepcao percepcao;
    public Accao accao;
    private MaquinaEstados maqest;

    // readonly
    public Estado estado;

    public ControloPersonagem() {
    }

    public Accao processar(Percepcao percepcao) {
        throw new UnsupportedOperationException("Unimplemented method 'processar'");
    }

    private void mostrar() {
    }

}
