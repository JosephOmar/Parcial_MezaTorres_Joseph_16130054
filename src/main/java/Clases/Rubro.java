/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Joseph
 */
public class Rubro {
    
    private String nombre;
    private boolean estado;

    public Rubro(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public boolean habilitar(){
        boolean estado = getEstado();
        if(estado){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean deshabilitar(){
        boolean estado = getEstado();
        if(estado){
            return false;
        }else{
            return true;
        }
    }
}
