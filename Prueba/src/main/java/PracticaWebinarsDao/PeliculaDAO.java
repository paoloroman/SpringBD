package PracticaWebinarsDao;

import java.util.Collection;

import PracticaWebinars.Pelicula;

public interface PeliculaDAO {

	public Pelicula findbyId(long id);
	public Collection<Pelicula> findAll();
	public void insert(Pelicula pelicula);
	public void edit(Pelicula pelicula);
	public void delete(Pelicula pelicula);
	public void delete(long id );
}
