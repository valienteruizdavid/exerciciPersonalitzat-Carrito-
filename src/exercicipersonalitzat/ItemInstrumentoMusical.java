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
public class ItemInstrumentoMusical extends Item {
    
    private String tipoInstrumento;

    public ItemInstrumentoMusical(String tipoInstrumento, double precio, String descripcion, String nombre, int id) {
        super(precio, descripcion, nombre, id);
        this.tipoInstrumento = tipoInstrumento;
    }

    public String getTipoInstrumento() {
        return tipoInstrumento;
    }

    public void setTipoInstrumento(String tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    @Override
    public String toString() {
        return "ItemInstrumentoMusical{" + "tipoInstrumento=" + tipoInstrumento + '}';
    }

    
    
    
}
