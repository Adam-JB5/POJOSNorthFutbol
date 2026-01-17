package pojosnorthfutbol;

public class EventoPartido {

    private Integer idEvento;
    private Partido partido;
    private Jugador jugador;
    private Character tipoEvento;
    private Integer minuto;

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Character getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(Character tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return "EventoPartido{" +
                "idEvento=" + idEvento +
                ", partido=" + partido +
                ", jugador=" + jugador +
                ", tipoEvento=" + tipoEvento +
                ", minuto=" + minuto +
                '}';
    }
}
