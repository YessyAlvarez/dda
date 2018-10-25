/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;


public class Sistema_Usuarios {
    
    private ArrayList<Cliente> clientes = new ArrayList();
    private ArrayList<Trabajador> logueados = new ArrayList();
    private ArrayList<Trabajador> trabajadores = new ArrayList();
    private ArrayList<Area> areas = new ArrayList();
    private ArrayList<Sector> sectores = new ArrayList();
    private ArrayList<Atencion> monitorDeAtencionesRealizadas = new ArrayList();
    private ArrayList<Atencion> AlertasEnEspera = new ArrayList();
    
     public void agregarTrabajdor(Trabajador u){
        trabajadores.add(u);
    }
     
    public void agregarCliente(Cliente u){
        clientes.add(u);
    }
    
  public Trabajador login(int cedula, String c){
        if(!trabajadores.isEmpty()){
            for(Trabajador u:trabajadores){
                if(u.getCedula()==cedula && u.getPassword().equals(c)){
                    logueados.add(u);
                    Fachada.getInstancia().avisar(Fachada.EVENTO_USUARIO);
                    return u;
                }
            }
        }
        return null;
    }
    
    public void logout(Trabajador u){
        logueados.remove(u);
        Fachada.getInstancia().avisar(Fachada.EVENTO_USUARIO);
    }

    public ArrayList<Trabajador> getLogueados() {
        return logueados;
    }
    
    public Trabajador getTrabajadorPorCI(int cedula){
        int indice = 0;
        int cantidad = logueados.size();
        if(!logueados.isEmpty()){
            while(indice<cantidad){
                Trabajador aux = logueados.get(indice);
                if(aux.getCedula()==cedula){
                    return aux;
                }
                indice++;
            }
        }
        return null;
    }
    
    public void agregarArea(String nombreArea, List<Sector> sectores){
        areas.add(new Area(nombreArea, sectores));
    }
    
    public void agregarSector(String nombreSector, int[] puestos){
        sectores.add(new Sector(nombreSector, puestos));
    }
    
    public Sector ObtenerSector(String nombre){
        Sector sector = null;
        int indice = 0;
        int cantidad = sectores.size();
        if(sectores!=null && !sectores.isEmpty()){
            while(sector==null && indice<cantidad){
                Sector aux = sectores.get(indice);
                if(aux!=null){
                    if(aux.getNombre().equalsIgnoreCase(nombre)){
                        sector = aux;
                    }
                }
                indice++;
            }
        }
        return sector;
    }
        
    public Area ObtenerArea(String nombre){
        Area area = null;
        int indice = 0;
        int cantidad = areas.size();
        if(!areas.isEmpty()){
            while(area==null && indice<cantidad){
                Area aux = areas.get(indice);
                if(aux.getNombre().equals(nombre)){
                    area = aux;
                }
                indice++;
            }
        }
        return area;
    }
    
    
    public void asignarPuestoATrabajador(int cedula, int puesto){
        getTrabajadorPorCI(cedula).setPuesto(puesto);
    }
    
}
