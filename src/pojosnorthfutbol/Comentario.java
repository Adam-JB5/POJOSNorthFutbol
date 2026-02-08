package pojosnorthfutbol;

import java.io.Serializable;
import java.util.Date;

public class Comentario implements Serializable {

    private Integer idComentario;
    private Noticia noticia;
    private Usuario usuario;
    private String contenido;
    private Date fechaCreacion;

    public Integer getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public Noticia getNoticia() {
        return noticia;
    }

    public void setNoticia(Noticia noticia) {
        this.noticia = noticia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "idComentario=" + idComentario +
                ", noticia=" + noticia +
                ", usuario=" + usuario +
                ", contenido='" + contenido + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
