package co.com.coban.microarticulo.services;

import co.com.coban.microarticulo.entities.Articulo;

import java.util.List;

public interface IArticuloService {
    List<Articulo> findAll();
    Articulo findById(Long id);
    Articulo save(Articulo articulo);
    void deleteById(Long id);
    boolean update(Articulo articulo);
}
