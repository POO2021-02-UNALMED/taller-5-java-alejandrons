package zooanimales;

import gestion.Zona;
import java.util.ArrayList;

public class Anfibio extends Animal{
    private ArrayList<Anfibio> listado;
    public int ranas;
    public int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, ArrayList<Anfibio> listado, int ranas, int salamandras, String colorPiel, boolean venenoso) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.ranas = ranas;
        this.salamandras = salamandras;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public void crearRana(String nombre, int edad, String genero, Zona zona){
        Anfibio Rana = new Anfibio(1,nombre,edad,"selva",genero,zona,this.listado,this.ranas,this.salamandras,"rojo",true);
        this.listado.add(Rana);
        this.ranas +=1;
        super.setTotalAnimales(1);
    }
    
    public void crearSalamandra(String nombre, int edad, String genero, Zona zona){
        Anfibio salamandra = new Anfibio(1,nombre,edad,"selva",genero,zona,this.listado,this.ranas,this.salamandras,"negro y amarillo",false);
        this.listado.add(salamandra);
        this.salamandras +=1;
        super.setTotalAnimales(1);
        
    }
    
    public ArrayList<Anfibio> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Anfibio> listado) {
        this.listado = listado;
    }

    
    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    
    
    
}
