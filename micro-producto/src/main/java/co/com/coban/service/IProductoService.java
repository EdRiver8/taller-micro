package co.com.coban.service;

import co.com.coban.entities.Producto;

import java.util.List;

public interface IProductoService {
	List<Producto> findAll();

	Producto save(Producto pr);

	boolean update(Producto pr);

	void deleteById(int id);

	Producto findByName(String name);

	Producto findById(int id);
}
