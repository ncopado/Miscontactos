package com.ncopado.miscontactosapp;

/**
 * Created by ncopado on 18/08/17.
 */

public class Contacto {

    private String Nombre;
    private String Telefono;
    private String Email;

    public Contacto(String nombre, String telefono) {
       this.Nombre = nombre;
        this.Telefono = telefono;
    }

    public Contacto(String nombre, String telefono, String email) {
        Nombre = nombre;
        Telefono = telefono;
        Email = email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
