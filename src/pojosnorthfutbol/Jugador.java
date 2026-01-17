package pojosnorthfutbol;

import java.util.Date;

public class Jugador {

    private Integer idJugador;
    private Equipo equipo;
    private String nombre;
    private String apellido;
    private Character posicion;
    private Date fechaNacimiento;
    private String paisOrigen;
    private Integer dorsal;

    public Integer getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Character getPosicion() {
        return posicion;
    }

    public void setPosicion(Character posicion) {
        this.posicion = posicion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "idJugador=" + idJugador +
                ", equipo=" + equipo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", posicion=" + posicion +
                ", fechaNacimiento=" + fechaNacimiento +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", dorsal=" + dorsal +
                '}';
    }
}
