/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Date;
import java.util.List;
import modelo.Area;
import modelo.Fachada;
import modelo.Sector;


public class Controlador_Cliente_1_SolicitoNumero {
    
    private Fachada modelo = Fachada.getInstancia();
    private Interface_Cliente_1_SolicitoNumero vista;

    public Controlador_Cliente_1_SolicitoNumero(Interface_Cliente_1_SolicitoNumero vista) {
        this.vista = vista;
    }

    
    public Area getArea(String nombreArea){
        return modelo.getArea(nombreArea);
    }
    
    public List<Sector> getSectores(String nombreArea){
        return modelo.getSectores(nombreArea);
    }
 
    /*
    Esto podria devolver el error de que el cliente no existe 
    */
    public int registrarAtencion(int nroCliente, String sectorSeleccionado, String nombreArea, Date fechaHoraSolicituda){
        return modelo.registrarAtencion(nroCliente, sectorSeleccionado, nombreArea, fechaHoraSolicituda); 
    }
    
    
}
