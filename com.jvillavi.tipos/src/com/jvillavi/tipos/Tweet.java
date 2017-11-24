package com.jvillavi.tipos;

import java.util.Date;

/**
 * Representacion de un tweet
 */
public class Tweet {
    private String usuario;
    private Date fecha;
    private String contenido;

    public Tweet(String usuario,Date fecha,String contenido){
        setUsuario(usuario);
        setFecha(fecha);
        setContenido(contenido);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
