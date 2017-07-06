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
public class TipoVehiculo {
    
    //atributos de la clase.
    
    private String descripcion;
    private String nombre;
    private List<Tarifa> tarifas;
    
    //metodo constructor por defecto.
    
    public TipoVehiculo(){
        
        tarifas = new ArrayList<>();
        
    }
    
    //metodo constructor con todos los atributos de la clase.
    //no incluye parametros referenciales.
    
    public TipoVehiculo(String descripcion, String nombre, List<Tarifa> tarifas){
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.tarifas = tarifas;
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
    
    public void setTarifas(List<Tarifa> tarifas){
        this.tarifas = tarifas;
    }
    
    public List<Tarifa> getTarifas(){
        return this.tarifas;
    }
}
