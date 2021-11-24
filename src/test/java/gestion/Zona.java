package gestion;

import java.util.ArrayList;
import zooanimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales;

    public Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = animales;
    }
    public Zona(){
        
    }
    
    public void agregarAnimales(Animal animal){
        animales.add(animal);
    }
    
    public int cantidadAnimales(){
        int totalAnimales = 0;
        for(Animal a : animales){
            totalAnimales += a.getTotalAnimales();
        }
        return totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }
    
}
