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
public class Ingreso {
    
    //atributos de la clase.
    
    private long codigoBarra;
    private Date fechaHoraEgreso;
    private Date fechaHoraIngreso;
    private BigDecimal monto;
    private int nroTicket;
    private String observacion;
    private Usuario usuario;
    private Porton porton;
    private Tarifa tarifa;
    private Vehiculo vehiculo;
    
    //metodo constructor por defecto.
    
    public Ingreso(){
        
    }
    
    //metodo constructor con todos los atributos de la clase.
    //no incluye parametros referenciales.
    
    public Ingreso(long codigoBarra, Date fechaHoraEgreso, Date fechaHoraIngreso, BigDecimal monto, int nroTicket, String observacion, Usuario usuario, Porton porton, Tarifa tarifa, Vehiculo vehiculo){
        this.codigoBarra = codigoBarra;
        this.fechaHoraEgreso = fechaHoraEgreso;
        this.fechaHoraIngreso = fechaHoraIngreso;
        this.monto = monto;
        this.nroTicket = nroTicket;
        this.observacion = observacion;
        this.usuario = usuario;
        this.porton = porton;
        this.tarifa = tarifa;
        this.vehiculo = vehiculo;
    }
    
    //metodos de seteo de la clase.
    
    public long getCodigoBarra(){
        return this.codigoBarra;
    }
    
    public void setCodigoBarra(long codigoBarra){
        this.codigoBarra = codigoBarra;
    }
    
    public Date getFechaHoraEgreso(){
        return this.fechaHoraEgreso;
    }
    
    public void setFechaHoraEgreso(Date fechaHoraEgreso){
        this.fechaHoraEgreso = fechaHoraEgreso;
    }
    
    public Date getFechaHoraIngreso(){
        return this.fechaHoraIngreso;
    }
    
    public void setFechaHoraIngreso(Date fechaHoraIngreso){
        this.fechaHoraIngreso = fechaHoraIngreso;
    }
    
    public BigDecimal getMonto(){
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto){
        this.monto = monto;
    }
    
    public int getNroTicket(){
        return this.nroTicket;
    }
    
    public void setNroTicket(int nroTicket){
        this.nroTicket = nroTicket;
    }
    
    public String getObservacion(){
        return this.observacion;
    }
    
    public void setObservacion(String observacion){
        this.observacion = observacion;
    }
    
    public Usuario getUsuario(){
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    
    public Porton getPorton(){
        return this.porton;
    }
    
    public void getPorton(Porton porton){
        this.porton = porton;
    }
    
    public Tarifa getTarifa(){
        return this.tarifa;
    }
    
    public void setTarifa(Tarifa tarifa){
        this.tarifa = tarifa;
    }
    
    public Vehiculo getVehiculo(){
        return this.vehiculo;
    }
    
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
}
