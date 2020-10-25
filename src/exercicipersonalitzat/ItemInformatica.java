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
public class ItemInformatica extends Item {
    
    private String marca;

    public ItemInformatica(String marca, double precio, String descripcion, String nombre, int id) {
        super(precio, descripcion, nombre, id);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "ItemInformatica{" + "marca=" + marca + '}';
    }

    
    
    
    
    
    
}
