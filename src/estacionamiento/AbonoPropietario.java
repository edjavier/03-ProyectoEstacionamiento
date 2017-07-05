/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import java.math.BigDecimal;
import java.util.Date;

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
    
    //metodo constructor por defecto.
    
    public AbonoPropietario(){
        
    }
    
    //metodo constructor con todos los atributos de la clase.
    //no incluye los parametros referenciales.
    
    public AbonoPropietario(Date fechaHora, BigDecimal montoCobrado, int numeroComprobante, BigDecimal saldoActual){
        this.fechaHora = fechaHora;
        this.montoCobrado = montoCobrado;
        this.numeroComprobante = numeroComprobante;
        this.saldoActual = saldoActual;
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
}
