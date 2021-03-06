/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Fachada;
import modelo.Trabajador;

/**
 *
 * @author Jessi
 */
public class Controlador_Trabajador_2_InicioJornada {
    
    private Trabajador logueado;
    private Fachada modelo = Fachada.getInstancia();
    private Interface_Trabajador_2_InicioJornada vista;
    
    
    public Controlador_Trabajador_2_InicioJornada(Interface_Trabajador_2_InicioJornada vista) {
        this.vista = vista;
    }
    
    
    public Controlador_Trabajador_2_InicioJornada(Trabajador logueado, Interface_Trabajador_2_InicioJornada vista) {
        this.vista = vista;
        this.logueado = logueado;
    }
    
    
    
    public void asignarPuestoATrabajador(int cedula, int puesto){
        modelo.asignarPuestoATrabajador(cedula, puesto);
        Trabajador t = modelo.getTrabajadorPorCI(cedula);
        //Muestro la ventana Monitoreo del Trabajador
        vista.verMonitorEspera(t);
        
    }
    
    
    
}
