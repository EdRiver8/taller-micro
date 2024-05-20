package co.com.coban.microcarrito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients // sirve para habilitar el uso de Feign lo cual permite hacer peticiones HTTP a otros microservicios
@SpringBootApplication
public class MicroCarritoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroCarritoApplication.class, args);
    }

}
