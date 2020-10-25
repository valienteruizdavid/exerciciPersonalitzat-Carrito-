
package exercicipersonalitzat;


public class m03_uf04_secondassignment  {
    
    public static void main(String[] args) {
        
        Detalle d1 = new Detalle(1, 3, new ItemJoyeria("oro", true, 499.99, "Una pieza única", "Anillo de oro", 1));
        Detalle d2 = new Detalle(2, 6, new ItemHerramientas("Manual", 25.0, "Sierra de acero inoxidable", "Sierra", 2));
        Detalle d3 = new Detalle(5, 13, new ItemInstrumentoMusical("Viento", 600.0, "Fagot de madera", "Fagot", 5));
        
         CarritoDeLaCompra c1 = new CarritoDeLaCompra();
         c1.añade(d1);
         c1.añade(d2);
         c1.añade(d3);
         
         System.out.println("Items añadidos a la cesta y precio final...\n");
         System.out.println(c1.checkout());
         
    }
    

    
    
}
