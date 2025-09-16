package Actividad3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){

        Producto producto1 = new Producto("Laptop", "Electrónica", 120.50, 10);
        Producto producto2 = new Producto("Camiseta", "Ropa", 250.99, 50);
        Producto producto3 = new Producto("Libro", "Educación", 150.75, 30);
        Producto producto4 = new Producto("Teléfono", "Electrónica", 80.00, 20);
        Producto producto5 = new Producto("Pantalones", "Ropa", 90, 40);
        Producto producto6 = new Producto("Cuaderno", "Educación", 15.25, 100);

        List<Producto> productos = List.of(producto1, producto2, producto3, producto4, producto5, producto6);
        List<Producto> productosPrecioMayorA100 = productos.stream()
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .filter(producto -> producto.getPrecio() > 100)
                .collect(Collectors.toList());
        System.out.println(productosPrecioMayorA100);

        Map<String, Double> productosPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.summingDouble(Producto::getStock)));
        System.out.println(productosPorCategoria);

        String productosSeparados = productos.stream()
                .map(producto -> producto.getNombre() + " $" + producto.getPrecio())
                .collect(Collectors.joining(" - "));
        System.out.println(productosSeparados);

        Map<String, Double> promedioPrecioCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.averagingDouble(Producto::getPrecio)));
        System.out.println(promedioPrecioCategoria);
    }
}
