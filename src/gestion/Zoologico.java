package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = zonas;
    }
    
    public Zoologico(){
        
    }
    
    public void agregarZonas(Zona zona){
        this.zonas.add(zona);
    }
    
    public void cantidadTotalAnimales(){
        
    }
}
