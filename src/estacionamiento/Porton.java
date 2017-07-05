/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

/**
 *
 * @author edjavier
 */
public class Porton {
    
    //atributos de la clase.
    
    private String descripcion;
    private String nombre;
    
    //metodo constructor por defecto.
    
    public Porton(){
        
    }
    
    //metodo constructor con todos los atributos de la clase.
    //no incluye parametros referenciales.
    
    public Porton(String descripcion, String nombre){
        this.descripcion = descripcion;
        this.nombre = nombre;
    }
    
    //metodos de seteo de la clase.
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
