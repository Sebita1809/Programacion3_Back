package ActividadesEqualsHashCode.Actividad2;

import ActividadesEqualsHashCode.Actividad1.Producto;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main (String[]args){

        Producto p1 = new Producto(1, "Laptop HP", 650000);
        Producto p2 = new Producto(2, "Impresora Samsung", 500000);
        Producto p3 = new Producto(1, "Laptop HP", 650000);
        Producto p4 = new Producto(3, "Lavarropa Phillips", 1200000);
        Producto p5 = new Producto(2, "Impresora Samsung", 500000);
        Set<Producto> productos = new HashSet<>();

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);

        for (Producto producto : productos){
            System.out.println(producto);
        }
    }
}
