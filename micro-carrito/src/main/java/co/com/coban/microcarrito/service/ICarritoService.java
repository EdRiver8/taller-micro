package co.com.coban.microcarrito.service;

import co.com.coban.microcarrito.entities.Articulo;

import java.util.List;

public interface ICarritoService {
    public abstract boolean addArticulo(Long idArticulo); // el public abstract es redundante, por ello no es necesario ya que todos los metodos de una interfaz son publicos y abstractos por defecto
    public abstract boolean removeArticulo(Long idArticulo);
    boolean clearCarrito();
    List<Articulo> showAll();
}
