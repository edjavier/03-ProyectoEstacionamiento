/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author edjavier
 */
public class AbonoPropietario {
    
    //atributos de la clase.
    
    private Date fechaHora;
    private BigDecimal montoCobrado;
    private int numeroComprobante;
    private BigDecimal saldoActual;
    private Propietario propietario;
    private Usuario usuario;
    private List<Ingreso> ingresos;
    
    //metodo constructor por defecto.
    
    public AbonoPropietario(){
        
        ingresos = new ArrayList<>();
    }
    
    //metodo constructor con todos los atributos de la clase.
    //no incluye los parametros referenciales.
    
    public AbonoPropietario(Date fechaHora, BigDecimal montoCobrado, int numeroComprobante, BigDecimal saldoActual, Propietario propietario, Usuario usuario, List<Ingreso> ingresos){
        this.fechaHora = fechaHora;
        this.montoCobrado = montoCobrado;
        this.numeroComprobante = numeroComprobante;
        this.saldoActual = saldoActual;
        this.propietario = propietario;
        this.usuario = usuario;
        this.ingresos = ingresos;
    }
    
    //metodos de seteo de la clase.
    
    public void setFechaHora(Date fechaHora){
        this.fechaHora = fechaHora;
    }
    
    public Date getFechaHora(){
        return this.fechaHora;
    }
    
    public void setMontoCobrado(BigDecimal montoCobrado){
        this.montoCobrado = montoCobrado;
    }
    
    public BigDecimal getMontoCobrado(){
        return this.montoCobrado;
    }
    
    public void setNumeroComprobante(int numeroComprobante){
        this.numeroComprobante = numeroComprobante;
    }
    
    public int getNumeroComprobrante(){
        return this.numeroComprobante;
    }
    
    public void setSaldoActual(BigDecimal saldoActual){
        this.saldoActual = saldoActual;
    }
    
    public BigDecimal getSaldoActual(){
        return this.saldoActual;
    }
    
    public void setPropietario(Propietario propietario){
        this.propietario = propietario;
    }
    
    public Propietario getPropieario(){
        return this.propietario;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    
    public Usuario getUsuario(){
        return this.usuario;
    }
    
    public void setIngresos(List<Ingreso> ingresos){
        this.ingresos = ingresos;
    }
    
    public List<Ingreso> getIngresos(){
        return this.ingresos;
    }
}
