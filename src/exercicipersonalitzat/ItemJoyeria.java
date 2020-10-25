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
public class ItemJoyeria extends Item {
    
    private String material;
    private boolean llevaDiamante;

    public ItemJoyeria(String material, boolean llevaDiamante, double precio, String descripcion, String nombre, int id) {
        super(precio, descripcion, nombre, id);
        this.material = material;
        this.llevaDiamante = llevaDiamante;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isLlevaDiamante() {
        return llevaDiamante;
    }

    public void setLlevaDiamante(boolean llevaDiamante) {
        this.llevaDiamante = llevaDiamante;
    }

    @Override
    public String toString() {
        return "ItemJoyeria{" + "material=" + material + ", llevaDiamante=" + llevaDiamante + '}';
    }

    

    
    
    
}
