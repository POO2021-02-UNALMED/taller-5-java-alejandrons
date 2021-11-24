package zooanimales;

import gestion.Zona;
import java.util.ArrayList;

public class Mamifero extends Animal{
    private ArrayList<Mamifero> listado;
    public int caballos = 0;
    public int leones = 0;
    private boolean pelaje;
    private int patas;

    public Mamifero(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, ArrayList<Mamifero> listado, int caballos, int leones, boolean pelaje, int patas) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.caballos = caballos;
        this.leones = leones;
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public void crearCaballo(String nombre, int edad, String genero, Zona zona){
        Mamifero caballo = new Mamifero(1,nombre,edad,"pradera",genero,zona,this.listado,this.caballos,this.leones,true,4);
        listado.add(caballo);
        this.caballos += 1;
        super.setTotalAnimales(1);
        
    }
    
    public void crearLeon(String nombre, int edad, String genero, Zona zona){
        Mamifero leon = new Mamifero(1,nombre,edad,"selva",genero,zona,this.listado,this.caballos,this.leones,true,4);
        listado.add(leon);
        this.leones += 1;
        super.setTotalAnimales(1);
    }
    
    public int cantidadMamiferos(){
        return (this.leones + this.caballos);
    }

    public ArrayList<Mamifero> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Mamifero> listado) {
        this.listado = listado;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    
    
}
