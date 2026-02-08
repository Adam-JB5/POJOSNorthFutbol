package pojosnorthfutbol;

import java.io.Serializable;

public class UsuarioEquiposSeguidos implements Serializable {

    private Usuario usuario;
    private Equipo equipo;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "UsuarioEquiposSeguidos{" +
                "usuario=" + usuario +
                ", equipo=" + equipo +
                '}';
    }
}
