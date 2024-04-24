package test;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jakarta.validation.Valid;

@Controller
public class ControladorWeb implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {

		registry.addViewController("/results").setViewName("results");

	}

	@GetMapping("/")
	public String showFormulario(FormularioDePersona formulario) {

		return "form";

	}

	@PostMapping("/")
	public String checkInfoDePersona(@Valid FormularioDePersona formulario, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "form";
		}
		return "redirect:/results";
	}

	// El @Valid coge los atributos del formulario
	// El uso de la interfaz BindingResult es para que pueda probar y recuperar
	// errores de validacion

	// Si todos los atributos de la persona son validos, redirigimos al results
	// plantilla final
}
