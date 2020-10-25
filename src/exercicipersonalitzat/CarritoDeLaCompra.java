
package exercicipersonalitzat;

import java.util.ArrayList;

/*

* Implementa una ejercicio original con:
 * 
 * Herencia
 * 
 * Polimorfismo
 * 
 * Intefaces
 * 
 * Propiedades, etc.
 * 
 * 
 * Opcionalmente, usa este ejemplo para tu desarrollo.
 * 
 * Fecha limite entrega Domingo 25 a las 12 de la noche.
 * 
 * 
 * No olvides implementar y verificar checkout()
*/
public class CarritoDeLaCompra implements Finalizable {
    private ArrayList<Detalle> carrito = new ArrayList<>();
    
    
    public void añade(Detalle detalle) {
            carrito.add(detalle);
    }
    
    public void elimina(Detalle detalle) {
        carrito.remove(detalle);
    }
    
    

    @Override
    public double checkout() {
        int quantitat;
        double preu;
        double x = 0.0;      
        
        for(int i = 0; i<carrito.size();i++){
            quantitat = carrito.get(i).getCantidad(); //Recull la quantitat d'items que tens.
            preu = carrito.get(i).getItem().getPrecio(); //Recull el preu del item concret.
            x += (quantitat*preu); //Fa un calcul del preu de tots els items en total.
            System.out.println(carrito.get(i).toString()); //Recull els elements de l'ArrayList i els converteix en un String.
        }
        return x; //Retornem el preu final.
    }
}
