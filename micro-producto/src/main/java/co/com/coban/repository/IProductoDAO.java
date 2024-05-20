package co.com.coban.repository;

import co.com.coban.entities.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface IProductoDAO extends CrudRepository<Producto, Integer> {

	@Query("SELECT u FROM Producto as u WHERE u.nombre = :nombre")
	Optional<Producto> findByName(@Param("nombre") String nombre);

}
