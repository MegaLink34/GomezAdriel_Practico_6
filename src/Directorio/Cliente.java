package Directorio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EL MEGAS
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private String ciudad;
    private String domicilio;

    public Cliente(String nombre, String apellido, String dni, String ciudad, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.ciudad = ciudad;
        this.domicilio = domicilio;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDomicilio() {
        return domicilio;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Cliente)){
            return false;
        } else {
            Cliente viene =(Cliente)obj;
            return dni.equals(viene.getDni());
        }
    }

    @Override
    public int hashCode() {
        return dni.hashCode();
    }

    @Override
    public String toString() {
        return "Cliente: " + apellido + ' ' + nombre + "\n\tDNI: " + dni + "\n\tCiudad: " + ciudad + "\n\tDomicilio:" + domicilio;
    }
    
    
}
