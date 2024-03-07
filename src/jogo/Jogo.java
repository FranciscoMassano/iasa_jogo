package jogo;

import jogo.ambiente.AmbienteJogo;
import jogo.ambiente.EventoJogo;
import jogo.personagem.Personagem;

public class Jogo {

    private static AmbienteJogo ambiente;
    private static Personagem personagem;

    /*
     * Define o ambiente e personagem e executa o jogo
     */
    public static void main(String[] args) {
        ambiente = new AmbienteJogo();
        personagem = new Personagem(ambiente);
        executar();
    }

    public static void executar() {
        while (!ambiente.getEvento().equals(EventoJogo.TERMINAR)) {
            ambiente.evoluir();
            personagem.executar();
        }

    }
}
