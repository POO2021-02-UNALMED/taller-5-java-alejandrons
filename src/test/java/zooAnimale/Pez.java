package zooanimales;

import gestion.Zona;
import java.util.ArrayList;

public class Pez extends Animal{
    private ArrayList<Pez> listado;
    public int salmones;
    public int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, ArrayList<Pez> listado, int salmones, int bacalaos, String colorEscamas, int cantidadAletas) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.salmones = salmones;
        this.bacalaos = bacalaos;
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }
    
    public void crearSalmon(String nombre, int edad, String genero, Zona zona){
        Pez salmon = new Pez(1,nombre,edad,"oceano",genero,zona,this.listado,this.salmones,this.bacalaos,"rojo",6);
        this.listado.add(salmon);
        this.salmones += 1;
        super.setTotalAnimales(1);
        
    }
    public void crearBacalao(String nombre, int edad, String genero, Zona zona){
        Pez bacalao = new Pez(1,nombre,edad,"oceano",genero,zona,this.listado,this.salmones,this.bacalaos,"gris",6);
        this.listado.add(bacalao);
        this.bacalaos += 1;
        super.setTotalAnimales(1);
    }
    
    public int cantidadPeces(){
        return (this.salmones+this.bacalaos);
    }
    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
    
    
    
}
