/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.Area;
import modelo.Atencion;
import modelo.Fachada;
import modelo.Sector;



public class Controlador_Cliente_2_Ticket {
    
    private Fachada modelo = Fachada.getInstancia();
    private Interface_Cliente_2_Ticket vista;

    public Controlador_Cliente_2_Ticket(Interface_Cliente_2_Ticket vista) {
        this.vista = vista;
    }
    
    public Atencion getAtencion(int nroAtencion){
        return modelo.getAtencion(nroAtencion);
    }
    
}
