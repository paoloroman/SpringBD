package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(TestSpringApplication.class, args);

	}

	// Aqui creo mis Loggers
	private static final Logger log = LoggerFactory.getLogger(TestSpringApplication.class);

	@Bean
	CommandLineRunner test(RepositorioCliente repositorio) {
		return (args) -> {

			// Aqui guardo Clientes
			repositorio.save(new Cliente("Paolo", "Roman"));
			repositorio.save(new Cliente("Marilyn", "Nuñez"));
			repositorio.save(new Cliente("Pedro", "Cruz"));

			// Aqui buscamos Clientes
			log.info("Cliente encontrado con findAll();");
			log.info("---------------------------------------");
			repositorio.findAll().forEach(cliente -> {
				log.info(cliente.toString());

			});
			log.info("");

			// Aqui buscamos de forma individual al cliente por el Id
			Cliente cliente = repositorio.findById(1L);
			log.info("Cliente encontrado con findById(1L):");
			log.info("---------------------------------------");
			log.info(cliente.toString());
			log.info("");

			// Aqui buscamos al cliente por el nombre
			log.info("Cliente encontrado con findByNombre('Marilyn'):");
			log.info("---------------------------------------");
			repositorio.findByNombre("Marilyn").forEach(marilyn -> {
				log.info(marilyn.toString());
			});
			log.info("");

		};

	}

}
/*
 * https://spring.io/guides/gs/accessing-data-jpa
 */
