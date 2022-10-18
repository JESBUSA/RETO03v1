package co.us.Ciclo03.Ciclo03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan(basePackages = {"co.us.ciclo03.ciclo03.modelo"})
@SpringBootApplication
public class Ciclo03Application {

	public static void main(String[] args) {
		SpringApplication.run(Ciclo03Application.class, args);
	}

}
