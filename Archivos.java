/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package archivos;


/**
 *
 * @author Ezq
 */
public class Archivos {
    
    private String nombre;
    private int fecha; 
    private String tipo;
    private int peso; 
    
    public Archivos(){
        
        
    }
    
    public void setNombre(String nuevoNombre){
    nombre=nuevoNombre;
    }
    
    public void setTipo(String nuevoTipo){
    tipo=nuevoTipo;
    }
    
    public void setPeso(int nuevoPeso){
    peso=nuevoPeso;
    }
    
    public void setFecha(int nuevaFecha){
    fecha=nuevaFecha;
    }
    
  
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Archivos Archivo1 = new Archivos();    
        Archivos Archivo2 = new Archivos();
        Archivos Archivo3 = new Archivos(); 
    
    Archivo1.setNombre("Tutorial de java");
    Archivo1.setTipo("Video mp3");
    Archivo1.setFecha(20181022);
    
    Archivo2.setNombre("Ensayo");
    Archivo2.setTipo("Archivo de texto .doc");
    Archivo2.setFecha(20181208);
    
    Archivo3.setNombre("Deber Arquitectura");
    Archivo3.setTipo("Archivo de lectura .pdf");
    Archivo3.setFecha(20180507);
    
    System.out.println("Archivo 1: ");
    System.out.println("Nombre: " + Archivo1.nombre + " " + "Tipo: " + Archivo1.tipo + " " + "Fecha: " + Archivo1.fecha);
    System.out.println("Archivo 2: ");
    System.out.println("Nombre: " + Archivo2.nombre + " " + "Tipo: " + Archivo2.tipo + " " + "Fecha: " + Archivo2.fecha);
    System.out.println("Archivo 3: ");
    System.out.println("Nombre: " + Archivo3.nombre + " " + "Tipo: " + Archivo3.tipo + " " + "Fecha: " + Archivo3.fecha);
}
}
