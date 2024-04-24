package test;

/*
 * Importamos los jakarta que vamos a usar en este ejemplo
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*Entity indica que es una entidad JPA
*Como indica Spring.io la pag web no existe ninguna anotacion @Table
*por lo que se supone que esta asignada una tabla denominada como Cliente que es nuestra clase */
@Entity
public class Cliente {
	/*
	 * Aqui podemos ver dos anotaciones una la de @Id que esta asociada a nuestro
	 * atributo id que es de tipo Long y luego la anotacion de @GeneratedValue que
	 * le da un valor automatico
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre, apellido;

	public Cliente() {}
	
	public Cliente(String nombre, String apellido) {

		this.nombre = nombre;
		this.apellido = apellido;

	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
