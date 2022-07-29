package co.edu.cue.proyecto;

import javax.swing.*;

public class Cliente {
    private String nombre;
    private double identificacion;
    private String tipoDocumento;
    private String genero;
    private String ciudad;

    public Cliente(String nombre, double identificacion, String tipoIdentificacion, String genero, String ciudad) {
        this.nombre=nombre;
        this.identificacion=identificacion;
        this.tipoDocumento=tipoIdentificacion;
        this.genero=genero;
        this.ciudad=ciudad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(double identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }






}
