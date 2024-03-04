package jogo;

import jogo.ambiente.AmbienteJogo;
import jogo.personagem.Personagem;

public class Jogo {

    private static AmbienteJogo ambiente;
    private static Personagem personagem;

    public static void main(String[] args) {
        ambiente = new AmbienteJogo();
        personagem = new Personagem(ambiente);
    }

    public static void mostrar() {
        ambiente.evoluir();
        personagem.executar();
    }
}
