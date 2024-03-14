package maqest;

import agente.Accao;
import ambiente.Evento;

public class MaquinaEstados {
    private Estado estado;

    /*
     * Definição dos atributos iniciais da maquina de estados
     */
    public MaquinaEstados(Estado estadoInicial) {
        this.estado = estadoInicial;
    }

    /*
     * Metodo responsavel pelo processamento do estado actual
     * Atravez do estado sucessor, obtem se um Accao atravez da transicao
     */
    public Accao processar(Evento evento) {
        Transicao transicao = estado.processar(evento);

        if (transicao != null) {
            estado = transicao.getEstadoSucessor();
            return transicao.getAcao();
        }

        return null;
    }

    /*
     * Getters para propriedades publicas read only.
     */
    public Estado getEstado() {
        return estado;
    }
}
