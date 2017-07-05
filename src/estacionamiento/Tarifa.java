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
public class Tarifa {
    
    //atributos de la clase.
    
    private int cantidadIngresosSinSaldo;
    private boolean esDeAbono;
    private Date fecha;
    private BigDecimal montoIngreso;
    
    //metodo constructor por defecto.
    
    public Tarifa(){
        
    }
    
    //metodo constructor con todos los atributos de la clase.
    //no incluye parametros referenciales.
    
    public Tarifa(int cantidadIngresosSinSaldo, boolean esDeAbono, Date fecha, BigDecimal montoIngreso){
        this.cantidadIngresosSinSaldo = cantidadIngresosSinSaldo;
        this.esDeAbono = esDeAbono;
        this.fecha = fecha;
        this.montoIngreso = montoIngreso;
    }
    
    //metodos de seteo de la clase.
    
    public void setCantidadIngresosSinSaldo(int cantidadIngresosSinSaldo){
        this.cantidadIngresosSinSaldo = cantidadIngresosSinSaldo;
    }
    
    public int getCantidadIngresosSinSaldo(){
        return this.cantidadIngresosSinSaldo;
    }
    
    public void setEsDeAbono(boolean esDeAbono){
        this.esDeAbono = esDeAbono;
    }
    
    public boolean getEsDeAbono(){
        return this.esDeAbono;
    }
    
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    
    public Date getFecha(){
        return this.fecha;
    }
    
    public void setMontoIngreso(BigDecimal montoIngreso){
        this.montoIngreso = montoIngreso;
    }
    
    public BigDecimal getMontoIngreso(){
        return this.montoIngreso;
    }
}
