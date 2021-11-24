package zooanimales;

import gestion.Zona;
import java.util.ArrayList;

public class Reptil extends Animal{
    private ArrayList<Reptil> listado;
    public int iguanas;
    public int serpeintes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, ArrayList<Reptil> listado, int iguanas, int serpeintes, String colorEscamas, int largoCola) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.iguanas = iguanas;
        this.serpeintes = serpeintes;
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public void crearIguana(String nombre, int edad, String genero, Zona zona){
        Reptil iguana = new Reptil(1,nombre,edad,"humedal",genero,zona,this.listado,this.iguanas,this.serpeintes,"verde",3);
        this.listado.add(iguana);
        this.iguanas +=1;
        super.setTotalAnimales(1);
    }
    
    public void crearSerpiente(String nombre, int edad, String genero, Zona zona){
        Reptil serpiente = new Reptil(1,nombre,edad,"jungla",genero,zona,this.listado,this.iguanas,this.serpeintes,"blanco",1);
        this.listado.add(serpiente);
        this.serpeintes += 1;
        super.setTotalAnimales(1);
    }
    
    public int cantidadReptiles(){
        return (this.iguanas+this.serpeintes);
    }
    
    public ArrayList<Reptil> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Reptil> listado) {
        this.listado = listado;
    }

    
    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
    
    
}
