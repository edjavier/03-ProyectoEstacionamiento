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
public class Propietario {
    
    //atributos de la clase Propietario.
    
    private String apellido;
    private String nombre;
    private int dni;
    
    //metodo constructor por defecto.
    
    public Propietario (){
        
    }
    
    //metodo constructor con todos los atributos de la clase.
    //no incluye parametros referenciales.
    
    public Propietario (String apellido, String nombre, int dni){
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
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
}
