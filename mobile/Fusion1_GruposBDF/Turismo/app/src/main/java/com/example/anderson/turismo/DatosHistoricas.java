package com.example.anderson.turismo;

import java.io.Serializable;

/**
 * Created by LUCHEEINS on 29/1/2017.
 */

public class DatosHistoricas implements Serializable {
    public int imagen;
    public String titulo;
    public String descripcion;
    public String ubicacion;

    public DatosHistoricas(int imagen, String titulo, String descripcion, String ubicacion) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
