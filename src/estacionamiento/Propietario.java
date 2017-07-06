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
public class Propietario {
    
    //atributos de la clase Propietario.
    
    private String apellido;
    private String nombre;
    private int dni;
    private  List<Vehiculo> vehiculos;
    
    //metodo constructor por defecto.
    
    public Propietario (){
        
        vehiculos = new ArrayList<>();
        
    }
    
    //metodo constructor con todos los atributos de la clase.
    //no incluye parametros referenciales.
    
    public Propietario (String apellido, String nombre, int dni, List<Vehiculo> vehiculos){
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.vehiculos = vehiculos;
    }
    
    //metodos de seteo de la clase.
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public void getNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setDni(int dni){
        this.dni = dni;
    }
    
    public int getDni(){
        return this.dni;
    }
    
    public void setVehiculos(List<Vehiculo> vehiculos){
        this.vehiculos = vehiculos;
    }
    
    public List<Vehiculo> getVehiculos(){
        return this.vehiculos;
    }
}
