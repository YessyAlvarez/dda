/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
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
        cargarTrabajadores();
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

    private static void cargarTrabajadores() {
        Fachada f = Fachada.getInstancia();
        f.agregarTrabajador(new Trabajador(1,"1","Juan perez", f.obtenerSector("Sector AA"), f.obtenerArea("Area A")));
        f.agregarTrabajador(new Trabajador(2,"2","Ana Gonzalez", f.obtenerSector("Sector AB"), f.obtenerArea("Area A")));
        f.agregarTrabajador(new Trabajador(3,"3","Pedro Hernandez", f.obtenerSector("Sector AC"), f.obtenerArea("Area A")));
        f.agregarTrabajador(new Trabajador(4,"4","Pepe Trueno", f.obtenerSector("Sector BA"), f.obtenerArea("Area B")));
        f.agregarTrabajador(new Trabajador(5,"5","Juan Carlos", f.obtenerSector("Sector CA"), f.obtenerArea("Area C")));
        f.agregarTrabajador(new Trabajador(5,"5","Juan Carlos", f.obtenerSector("Sector CB"), f.obtenerArea("Area C")));
    }

    
    private static void cargarUsuarios(){
        Fachada f = Fachada.getInstancia();
        f.agregarCliente(new Cliente(11, "11", "Claudio Claucu", 11, "clau@gmail.com"));
        f.agregarCliente(new Cliente(12, "12", "Nil Martin Caballero", 12, "Nil@gmail.com"));
        f.agregarCliente(new Cliente(13, "13", "Sergio Jimenez Rojas", 13, "Rojas@gmail.com"));
        f.agregarCliente(new Cliente(14, "14", "Alicia Marquez Gallego", 14, "Alicia@gmail.com"));
        f.agregarCliente(new Cliente(15, "15", "Sergio Mora", 15, "Mora@gmail.com"));
        f.agregarCliente(new Cliente(16, "16", "Manuela Romero", 16, "Manuela@gmail.com"));
        f.agregarCliente(new Cliente(17, "17", "Omar Peña", 17, "Omar@gmail.com"));
        f.agregarCliente(new Cliente(18, "18", "Leyre Gomez Molina", 18, "Leyre@gmail.com"));
        f.agregarCliente(new Cliente(19, "19", "Andrea Ortiz", 19, "Ortiz@gmail.com"));
        f.agregarCliente(new Cliente(20, "20", "Aitor Calvo Castillo", 20, "Castillo@gmail.com"));
        f.agregarCliente(new Cliente(21, "21", "Enrique Vidal Carmona", 21, "Vidal@gmail.com"));
        f.agregarCliente(new Cliente(22, "22", "Alicia Marin", 22, "Alicia@gmail.com"));
        f.agregarCliente(new Cliente(23, "23", "Álvaro Sola Iglesias", 23, "Sola@gmail.com"));
        f.agregarCliente(new Cliente(24, "24", "Érik Gimenez Diez", 24, "Gimenez@gmail.com"));
    }
    
    
    
    
}
