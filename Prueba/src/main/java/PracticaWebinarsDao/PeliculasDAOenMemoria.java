package PracticaWebinarsDao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import PracticaWebinars.Pelicula;
@Repository
public class PeliculasDAOenMemoria implements PeliculaDAO {

	List<Pelicula> peliculas = new ArrayList<Pelicula>();
	
	public void insertar() {
		peliculas = LectorFicheroPeliculas.lector(null, null, null);
	}
	
	
	
	@Override
	public Pelicula findbyId(long id) {
		return null;
	}

	@Override
	public Collection<Pelicula> findAll() {
		return null;
	}

	@Override
	public void insert(Pelicula pelicula) {

	}

	@Override
	public void edit(Pelicula pelicula) {

	}

	@Override
	public void delete(Pelicula pelicula) {

	}

	@Override
	public void delete(long id) {

	}

}
