package persona;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Servicio {

	@GetMapping(value="/persona",produces=MediaType.APPLICATION_JSON_VALUE)

	public List<Persona> datosPersonas(){
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Paolo","Román",22));
		personas.add(new Persona("Marilyn", "Nuñez ", 31));
		return personas;
	}
}
