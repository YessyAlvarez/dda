/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;


public class Atencion {
    private int  numeroAtencion;
    private Cliente cliente;
    private String sector;
    private String Area;
    private int puesto;
    private Date fechaHoraSolicitado;
    private long inicioAtencion;
    private long finAtencion;

    public Atencion(int numeroAtencion, Cliente cliente) {
        this.numeroAtencion = numeroAtencion;
        this.cliente = cliente;
        this.fechaHoraSolicitado = new Date();
    }

    public int getNumeroAtencion() {
        return numeroAtencion;
    }

    public void setNumeroAtencion(int numeroAtencion) {
        this.numeroAtencion = numeroAtencion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }


    public long getInicioAtencion() {
        return inicioAtencion;
    }

    public void setInicioAtencion(long inicioAtencion) {
        this.inicioAtencion = inicioAtencion;
    }

    public long getFinAtencion() {
        return finAtencion;
    }

    public void setFinAtencion(long finAtencion) {
        this.finAtencion = finAtencion;
    }

    public Date getFechaHoraSolicitado() {
        return fechaHoraSolicitado;
    }

    public void setFechaHoraSolicitado(Date fechaHoraSolicitado) {
        this.fechaHoraSolicitado = fechaHoraSolicitado;
    }

    
}
