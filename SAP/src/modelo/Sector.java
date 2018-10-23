/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;


public class Sector {
    
    private final String nombre;
    private final List<Integer> puestos;

    public Sector(String nombre, List<Integer> puestos) {
        this.nombre = nombre;
        this.puestos = puestos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getPuestos() {
        return puestos;
    }
    
    
    
    
    
}
