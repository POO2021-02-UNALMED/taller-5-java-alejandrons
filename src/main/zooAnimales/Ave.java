package zooanimales;

import gestion.Zona;
import java.util.ArrayList;

public class Ave extends Animal{
    private ArrayList<Ave> listado;
    public int halcones;
    public int aguilas;
    private String colorPlumas;

    public Ave( int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, ArrayList<Ave> listado, int halcones, int aguilas, String colorPlumas) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.halcones = halcones;
        this.aguilas = aguilas;
        this.colorPlumas = colorPlumas;
    }
    
    public void crearHalcon(String nombre, int edad, String genero, Zona zona){
        Ave halcon = new Ave(1,nombre,edad,"montanas",genero,zona,this.listado,this.halcones,this.aguilas,"cafe glorioso");
        listado.add(halcon);
        this.halcones += 1;
        super.setTotalAnimales(1);
    }
    
    public void crearAguila(String nombre, int edad, String genero, Zona zona){
        Ave aguila = new Ave(1,nombre,edad,"montanas",genero,zona,this.listado,this.halcones,this.aguilas,"blanco y amarillo");
        listado.add(aguila);
        this.aguilas += 1;
        super.setTotalAnimales(1);
    }
    
    public int cantidadAves(){
        return (this.aguilas+this.halcones);
    }
    public ArrayList<Ave> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Ave> listado) {
        this.listado = listado;
    }

    
    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
    
    
    
}
