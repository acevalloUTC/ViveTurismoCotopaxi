package com.example.anderson.turismo;

import java.io.Serializable;

/**
 * Created by JWEB.NET on 21/01/2017.
 */

public class DatosAcontecimientos implements Serializable {
    public int imagen;
    public String titulo;
    public String descripcion;
    public String ubicacion;



    public DatosAcontecimientos(int imagen, String titulo, String descripcion, String ubicacion) {
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
