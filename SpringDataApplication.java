package com.example.SpringData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataApplication.class, args);

		CocheRepository repository = context.getBean(CocheRepository.class);

		Coche ford = new Coche(null, "Ford", "Mustang");
		repository.save(ford);

		System.out.println("El numero de coches en base de datos es: " + repository.count());

		System.out.println(repository.findAll());
	}


}
