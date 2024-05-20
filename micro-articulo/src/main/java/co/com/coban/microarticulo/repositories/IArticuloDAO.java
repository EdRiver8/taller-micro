package co.com.coban.microarticulo.repositories;

import co.com.coban.microarticulo.entities.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticuloDAO extends JpaRepository<Articulo, Long> {
}
