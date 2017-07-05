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
public class Vehiculo {
    
    //atributos de la clase.
    
    private String dominio;
    
    //metodo constructor de la clase.
    
    public Vehiculo(){
        
    }
    
    //metodo constructor con todos los atributos de la clase.
    //no incluye los parametros referenciales.
    
    public Vehiculo(String dominio){
        this.dominio = dominio;
    }
    
    //metodos de seteo de la clase.
    
    public void setDominio(String dominio){
        this.dominio = dominio;
    }
    
    public String getDominio(){
        return this.dominio;
    }
}
