package test;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class FormularioDePersona {

	@NotNull // Esto quiere decir que el cammpo no puede ser null
	@Size(min = 2, max = 30) // Y aqui que tiene que tener como minimo 2 caracteres y 30 como maximo
	private String name;

	@NotNull
	@Min(18) // minimo tiene que tener el valor de 18
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "La Persona con  NOMBRE: " + name + " y con EDAD: " + age;
	}

}
