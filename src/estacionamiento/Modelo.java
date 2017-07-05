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
public class Modelo {
    
    //atributos de la clase.
    
    private String nombre;
    
    //metodo constructor por defecto de la clase.
    
    public Modelo(){
        
    }
    
    //metodo constructor con todos los atributos de la clase.
    //no incluye los parametros referenciales.
    
    public Modelo(String nombre){
        this.nombre = nombre;
    }
    
    //metodos de seteo de la clase.
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
