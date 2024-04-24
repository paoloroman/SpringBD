package test;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RepositorioCliente extends CrudRepository<Cliente, Long> {

	List<Cliente> findByNombre(String nombre);
	Cliente findById(long id);
	
}
