package co.com.coban.microcarrito.entities;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component // se agrega la anotación @Component para que Spring pueda manejar la inyección de dependencias
// spring se encarga de crear una instancia de la clase carrito y la mantiene en memoria para ser inyectada en otras clases
public class Carrito {
    private List<Articulo> articulos;

    public Carrito() {
        articulos = new ArrayList<>(); // se inicializa la lista de articulos para evitar null pointer exceptions
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
}
