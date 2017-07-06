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
    private TipoVehiculo tipoVehiculo;
    private Modelo modelo;
    
    //metodo constructor de la clase.
    
    public Vehiculo(){
        
    }
    
    //metodo constructor con todos los atributos de la clase.
    //no incluye los parametros referenciales.
    
    public Vehiculo(String dominio, TipoVehiculo tipoVehiculo, Modelo modelo){
        this.dominio = dominio;
        this.tipoVehiculo = tipoVehiculo;
        this.modelo = modelo;
    }
    
    //metodos de seteo de la clase.
    
    public void setDominio(String dominio){
        this.dominio = dominio;
    }
    
    public String getDominio(){
        return this.dominio;
    }
    
    public void setTipoVehiculo(TipoVehiculo tipoVehiculo){
        this.tipoVehiculo = tipoVehiculo;
    }
    
    public TipoVehiculo getTipoVehiculo(){
        return this.tipoVehiculo;
    }
    
    public void setModelo(Modelo modelo){
        this.modelo = modelo;
    }
    
    public Modelo getModelo(){
        return this.modelo;
    }
}
