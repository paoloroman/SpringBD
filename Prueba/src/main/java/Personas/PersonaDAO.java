package Personas;

import java.util.List;

public interface PersonaDAO {
	public Persona findById(int id);
	public List<Persona> findAll();
	public void insert(Persona persona);
	public void edit(int id, Persona persona);
	public void delete(int id);
	public void delete(Persona persona);

}
