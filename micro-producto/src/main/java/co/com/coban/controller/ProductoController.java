package co.com.coban.controller;

import co.com.coban.entities.Producto;
import co.com.coban.service.IProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

	private IProductoService productoService;

	public ProductoController(IProductoService productoService) {
		this.productoService = productoService;
	}

	@GetMapping
	public List<Producto> findAll() {
		return productoService.findAll();
	}

	@GetMapping("/producto/{id}")
	public Producto findById(@PathVariable("id") int id) {
		return productoService.findById(id);
	}

	@PostMapping("/save")
	public Producto saveProducto(@RequestBody Producto producto) {
		return productoService.save(producto);
	}

	@PutMapping("/update")
	public boolean updateProducto(@RequestBody Producto producto) {
		return productoService.update(producto);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteProducto(@PathVariable("id") int id) {
		productoService.deleteById(id);
	}

	@GetMapping("/producto/name/{name}")
	public Producto findByName(@PathVariable("name") String name) {
		return productoService.findByName(name);
	}
}
