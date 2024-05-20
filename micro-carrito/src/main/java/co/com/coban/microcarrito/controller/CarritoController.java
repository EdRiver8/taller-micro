package co.com.coban.microcarrito.controller;

import co.com.coban.microcarrito.entities.Articulo;
import co.com.coban.microcarrito.service.ICarritoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrito")
public class CarritoController {
    private final ICarritoService carritoService;

    public CarritoController(ICarritoService carritoService) {
        this.carritoService = carritoService;
    }

    @PostMapping("/add/{idArticulo}")
    public boolean addArticulo(@PathVariable("idArticulo") Long idArticulo) {
        return carritoService.addArticulo(idArticulo);
    }

    @PostMapping("/remove/{idArticulo}")
    public boolean removeArticulo(@PathVariable("idArticulo") Long idArticulo) {
        return carritoService.removeArticulo(idArticulo);
    }

    @GetMapping("/clear")
    public boolean clearCarrito() {
        return carritoService.clearCarrito();
    }

    @GetMapping("/showAll")
    public List<Articulo> showAll() {
        return carritoService.showAll();
    }
}
