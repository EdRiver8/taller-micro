package co.com.coban.microcarrito.service;

import co.com.coban.microcarrito.entities.Articulo;
import co.com.coban.microcarrito.entities.Carrito;
import co.com.coban.microcarrito.feign.IArticuloFeign;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoServiceImpl implements ICarritoService{

    private final Carrito carrito;
    private final IArticuloFeign articuloFeign;

    public CarritoServiceImpl(Carrito carrito, IArticuloFeign articuloFeign) {
        this.carrito = carrito;
        this.articuloFeign = articuloFeign;
    }

    @Override
    public boolean addArticulo(Long idArticulo) {
        Articulo articulo = articuloFeign.findById(idArticulo);
        if(articulo != null){
            carrito.getArticulos().add(articulo);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeArticulo(Long idArticulo) {
        Articulo articulo = articuloFeign.findById(idArticulo);
        if(articulo != null){
            carrito.getArticulos().remove(articulo);
            return true;
        }
        return false;
    }

    @Override
    public boolean clearCarrito() {
        carrito.getArticulos().clear();
        return true;
    }

    @Override
    public List<Articulo> showAll() {
        return carrito.getArticulos();
    }
}
