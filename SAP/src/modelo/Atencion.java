/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Jessi
 */
public class Atencion {
    private final String nombre;
    private List<Sector> sectores;

    public Atencion(String nombre, List<Sector> sectores) {
        this.nombre = nombre;
        this.sectores = sectores;
    }

    public List<Sector> getSectores() {
        return sectores;
    }

    public void setSectores(List<Sector> sectores) {
        this.sectores = sectores;
    }

    public String getNombre() {
        return nombre;
    }

 
    
    
    
    
    
    
}
