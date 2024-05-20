package co.com.coban.service;

import co.com.coban.entities.Producto;
import co.com.coban.repository.IProductoDAO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {

//	@Autowired
	private IProductoDAO dao;

	public ProductoServiceImpl(IProductoDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<Producto> findAll() {

		return (List<Producto>) dao.findAll();
	}

	@Override
	public Producto save(Producto pr) {

		return dao.save(pr);
	}

	@Override
	public boolean update(Producto pr) {

		if (dao.existsById(pr.getId())) {
			dao.save(pr);
			return true;
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Producto no encontrado");
	}

	@Override
	public void deleteById(int id) {
		if (dao.existsById(id)) {
			dao.deleteById(id);
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Producto no encontrado");
	}

	@Override
	public Producto findByName(String name) {

		return dao.findByName(name).stream().findFirst()
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Producto no encontrado"));

	}

	@Override
	public Producto findById(int id) {
		return dao.findById(id).stream().findFirst()
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Producto no encontrado"));
	}

}
