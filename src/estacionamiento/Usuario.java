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
public class Usuario {
    
    //atributos de la clase.
    
    private String apellido;
    private String nombre;
    private String nombreUsuario;
    private String password;
    
    //metodo constructor por defecto.
    
    public Usuario(){
        
    }
    
    //metodo constructor con todos los atributos de la clase.
    //no incluye parametros referenciales.
    
    public Usuario(String apellido, String nombre, String nombreUsuario, String password){
        this.apellido = apellido;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }
    
    //metodos de seteo de la clase.
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
    
    public String getNombreUsuario(){
        return this.nombreUsuario;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return this.password;
    }
}
