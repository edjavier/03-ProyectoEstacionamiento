/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edjavier
 */
public class Marca {
    
    //atributos de la clase.
    
    private String nombre;
    private List<Modelo> modelos;
    
    //metodo constructor por defecto de la clase.
    
    public Marca(){
        
        modelos = new ArrayList<>();
        
    }
    
    //metodo constructor con todos los atributos de la clase.
    //no incluye los paramatros referenciales.
    
    public Marca (String nombre, List<Modelo> modelos){
        this.nombre = nombre;
        this.modelos = modelos;
    }
    
    //metodos de seteo de la clase.
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setModelos(List<Modelo> modelos){
        this.modelos = modelos;
    }
    
    public List<Modelo> getModelos(){
        return this.modelos;
    }
}
