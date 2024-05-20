package co.com.coban.microarticulo.services;

import co.com.coban.microarticulo.entities.Articulo;
import co.com.coban.microarticulo.repositories.IArticuloDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloServiceImpl implements IArticuloService{

    private final IArticuloDAO articuloDAO;

    public ArticuloServiceImpl(IArticuloDAO articuloDAO) {
        this.articuloDAO = articuloDAO;
    }

    @Override
    public List<Articulo> findAll() {
        return (List<Articulo>) articuloDAO.findAll();
    }

    @Override
    public Articulo findById(Long id) {
//        return articuloDAO
//                .findById(id).stream().findFirst()
//                .orElseThrow(() -> new RuntimeException("Articulo no encontrado"));
        Optional<Articulo> articulo = articuloDAO.findById(id);
        if (articulo.isPresent()) {
            return articulo.get();
        } else {
            throw new RuntimeException("Articulo no encontrado");
        }
    }

    @Override
    public Articulo save(Articulo articulo) {
        return articuloDAO.save(articulo);
    }

    @Override
    public void deleteById(Long id) {
        articuloDAO.deleteById(id);
    }

    @Override
    public boolean update(Articulo articulo) {
        articuloDAO.save(articulo);
        return true;
    }
}
