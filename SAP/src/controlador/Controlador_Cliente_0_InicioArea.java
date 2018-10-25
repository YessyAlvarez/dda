/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Area;
import modelo.Fachada;
import vista.Cliente_0_InicioArea;

/**
 *
 * @author juan sarramia
 */
public class Controlador_Cliente_0_InicioArea {
    
    private Fachada modelo = Fachada.getInstancia();
    private Interface_Cliente_0_InicioArea vista;

    public Controlador_Cliente_0_InicioArea(Interface_Cliente_0_InicioArea vista) {
        this.vista = vista;
    }
    
    public ArrayList<Area> getAreas(){
        return modelo.getAreas();
    }
    
}
