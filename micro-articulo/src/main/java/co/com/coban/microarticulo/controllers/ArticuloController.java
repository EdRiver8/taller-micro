package co.com.coban.microarticulo.controllers;

import co.com.coban.microarticulo.entities.Articulo;
import co.com.coban.microarticulo.services.IArticuloService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articulos")
public class ArticuloController {
    private final IArticuloService articuloService;

    public ArticuloController(IArticuloService articuloService) {
        this.articuloService = articuloService;
    }

    @GetMapping
    public List<Articulo> findAll() {
        return articuloService.findAll();
    }

    @GetMapping("/articulo/{id}")
    public Articulo findById(@PathVariable("id") Long id) {
        // la diferencia entre pathvariable y requestparam es que el primero se usa para obtener un valor de la url y el segundo de la query
        // en este caso se usa pathvariable para obtener el id del articulo
        return articuloService.findById(id);
    }

    @PostMapping("/save")
    public Articulo save(@RequestBody Articulo articulo) {
        return articuloService.save(articulo);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        articuloService.deleteById(id);
    }
}
