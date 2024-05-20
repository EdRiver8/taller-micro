package co.com.coban.microcarrito.feign;

import co.com.coban.microcarrito.entities.Articulo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "micro-articulo", url = "http://localhost:9091/articulos")
public interface IArticuloFeign {
    @GetMapping("/articulo/{id}")
    public abstract Articulo findById(@PathVariable("id") Long id);


}
