package Personas;

import java.util.ArrayList;
import java.util.List;

public class Personas implements PersonaDAO {
	List<Persona> personas = new ArrayList<Persona>();
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

	public void insertar() throws Exception {
		insert(new Persona("PaoloXML",22));
		insert(new Persona("LauraxML",19));
		insert(new Persona("HectorXML",21));
		insert(new Persona("Juan Carlos XML",45));
		
	}
}
