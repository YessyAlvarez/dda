/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


public class Fachada extends Observable{
    
    private static Fachada instancia = new Fachada();
    private Sistema_Usuarios su = new Sistema_Usuarios();
    
    public static final int EVENTO_USUARIO = 1;

    
    
    public static Fachada getInstancia() {
        return instancia;
    }
    
    private Fachada() {
    }

    public void agregarTrabajador(Trabajador u) {
        su.agregarTrabajdor(u);
    }

    
    public void agregarCliente(Cliente c) {
        su.agregarCliente(c);
    }
    
    public Trabajador login(int cedula, String pass) {
        return su.login(cedula, pass);
    }

    public void logout(Trabajador u) {
        su.logout(u);
    }

    public ArrayList<Trabajador> getLogueados() {
        return su.getLogueados();
    }
    protected void avisar(Object evento){
        setChanged();
        notifyObservers(evento);
    }
    
    
    public void agregarArea(String nombreArea, List<Sector> sectores) {
        su.agregarArea(nombreArea, sectores);
    }
    
    public void agregarSector(String nombreSector, int[] puestos) {
        su.agregarSector(nombreSector, puestos);
    }
    
    
    public Sector obtenerSector(String nombre){
        return su.ObtenerSector(nombre);
    }
    
    public Area obtenerArea(String nombre){
        return su.ObtenerArea(nombre);
    }
    
    public void asignarPuestoATrabajador(int cedula, int puesto){
        su.asignarPuestoATrabajador(cedula, puesto);
    }
    
    public Trabajador getTrabajadorPorCI(int cedula){
        return su.getTrabajadorPorCI(cedula);
    }
    
    
}
