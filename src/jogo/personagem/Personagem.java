package jogo.personagem;

import agente.Agente;
import agente.Controlo;
import jogo.ambiente.AmbienteJogo;

public class Personagem extends Agente {
    public ControloPersonagem controlo;

    public Personagem(AmbienteJogo ambiente) {
        super(ambiente, new ControloPersonagem());
    }

}
