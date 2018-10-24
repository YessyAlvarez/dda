/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import modelo.Fachada;
import modelo.Sector;
import modelo.Trabajador;
import vista.Principal;

/**
 *
 * @author Jessi
 */
public class Inicio {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cargarSectores();
        cargarAreas();
        cargarUsuarios();
        new Principal().setVisible(true);
    }
    
    
    private static void cargarSectores() {
        Fachada f = Fachada.getInstancia();
        int[] puestos3 = {4, 8, 9};
        int[] puesto1 = {1};
        int[] puestos2 = {2, 3};
        f.agregarSector("Sector AA", puestos3);
        f.agregarSector("Sector AB", puestos3);
        f.agregarSector("Sector AC", puestos3);
        f.agregarSector("Sector BA", puesto1);
        f.agregarSector("Sector CA", puestos2);
        f.agregarSector("Sector CB", puestos2);
    }
    
    private static void cargarAreas() {
        Fachada f = Fachada.getInstancia();
        //Obtengo los Sectores
        List<Sector> sectoresA = new ArrayList<>();
        sectoresA.add(f.obtenerSector("Sector AA"));
        sectoresA.add(f.obtenerSector("Sector AB"));
        sectoresA.add(f.obtenerSector("Sector AC"));
        List<Sector> sectoresB = new ArrayList<>();
        sectoresB.add(f.obtenerSector("Sector BA"));
        List<Sector> sectoresC = new ArrayList<>();
        sectoresC.add(f.obtenerSector("Sector CA"));
        sectoresC.add(f.obtenerSector("Sector CB"));
        f.agregarArea("Area A", sectoresA);
        f.agregarArea("Area B", sectoresB);
        f.agregarArea("Area C", sectoresC);
    }

    private static void cargarUsuarios() {
        Fachada f = Fachada.getInstancia();
        f.agregar(new Trabajador(1,"1","Juan perez", f.obtenerSector("Sector AA"), f.obtenerArea("Area A")));
        f.agregar(new Trabajador(2,"2","Ana Gonzalez", f.obtenerSector("Sector AB"), f.obtenerArea("Area A")));
        f.agregar(new Trabajador(3,"3","Pedro Hernandez", f.obtenerSector("Sector AC"), f.obtenerArea("Area A")));
        f.agregar(new Trabajador(4,"4","Pepe Trueno", f.obtenerSector("Sector BA"), f.obtenerArea("Area B")));
        f.agregar(new Trabajador(5,"5","Juan Carlos", f.obtenerSector("Sector CA"), f.obtenerArea("Area C")));
        f.agregar(new Trabajador(5,"5","Juan Carlos", f.obtenerSector("Sector CB"), f.obtenerArea("Area C")));
    }

    
}
