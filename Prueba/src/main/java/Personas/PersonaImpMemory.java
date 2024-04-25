package Personas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PersonaImpMemory implements PersonaDAO, InitializingBean,DisposableBean {
	List<Persona> personas = new ArrayList<Persona>();
	
	//InitializingBean
	@Override
	public void afterPropertiesSet() throws Exception {
		insert(new Persona("Paolo",22));
		insert(new Persona("Laura",19));
		insert(new Persona("Hector",21));
		insert(new Persona("Juan Carlos",45));
		
	}

	//DisposableBean
	@Override
	public void destroy() throws Exception {
	System.out.println("\nBorrando los datos de la lista");
	personas.clear();
		
	}

	
	
	//PersonaDAO
	@Override
	public Persona findById(int id) {
		
		return personas.get(id) ;
	}

	@Override
	public List<Persona> findAll() {
		
		return personas;
	}

	@Override
	public void insert(Persona persona) {
		personas.add(persona);
		
	}

	@Override
	public void edit(int id, Persona persona) {
		personas.remove(id);
		personas.add(id, persona);
		
	}

	@Override
	public void delete(int id) {
		personas.remove(id);
		
	}

	@Override
	public void delete(Persona persona) {
		personas.remove(persona);
		
	}

	
}
