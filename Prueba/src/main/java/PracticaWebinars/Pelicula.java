package PracticaWebinars;

import java.util.List;

public class Pelicula {

	private long id;
	private String titulo, año;
	private List<String> generos;
	
	@Override
	public String toString() {
		return "Pelicula [" + id + ", " + titulo + ", " + año + ", " + generos + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public List<String> getGeneros() {
		return generos;
	}

	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}

	public Pelicula(long id,String titulo,String año,List<String> generos) {
		this.id = id;
		this.titulo = titulo;
		this.año = año;
		this.generos = generos;
	}
	
}
