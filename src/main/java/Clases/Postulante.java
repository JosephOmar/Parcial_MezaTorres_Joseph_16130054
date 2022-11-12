/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Joseph
 */
public class Postulante {
    
    private String email;
    private String nombre;
    private String apellidos;
    private String direccion;
    private Date nacimiento;
    private String clave;

    public Postulante(String email, String nombre, String apellidos, String direccion, Date nacimiento, String clave) {
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public boolean asignarGradoEstudio(GradoEstudio grado){
        return true;
    }
    
    public boolean postular(Oferta oferta){
        return true;
    }
    
    public boolean anularPostulacion(Postulacion postulacion){
        return true;
    }
    
    public Postulacion[] getPostulaciones(){
        int indice = 0;
        Postulacion[] post = new Postulacion[indice];
        return post;
    }
    
    
}
