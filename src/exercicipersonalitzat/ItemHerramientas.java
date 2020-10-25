/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicipersonalitzat;

/**
 *
 * @author dvali
 */
public class ItemHerramientas extends Item {
    
    private String tipoAutomatizacion;

    public ItemHerramientas(String tipoAutomatizacion, double precio, String descripcion, String nombre, int id) {
        super(precio, descripcion, nombre, id);
        this.tipoAutomatizacion = tipoAutomatizacion;
    }

    public String getTipoAutomatizacion() {
        return tipoAutomatizacion;
    }

    public void setTipoAutomatizacion(String tipoAutomatizacion) {
        this.tipoAutomatizacion = tipoAutomatizacion;
    }

    @Override
    public String toString() {
        return "ItemHerramientas{" + "tipoAutomatizacion=" + tipoAutomatizacion + '}';
    }

    
    

    
    
    
    
}
