package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SeguridadWeb_Config {

	// Este Bean se encarga de indicar que rutas proteger y cuales no
	// la ruta / y /home no estan protegidas en cambio todas las demas si
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(
				(requests) -> requests.requestMatchers("/", "/home").permitAll().anyRequest().authenticated())
				.formLogin((form) -> form.loginPage("/login").permitAll()).logout((logout) -> logout.permitAll());
		return http.build();
	}

	// Este Bean se encarga de cofigurar un almacen de usuarios en memoria con un
	// unico usuario
	// con nombre de usuario = usuario, contraseña = usuario y su funcion = USUARIO
	@Bean
	public UserDetailsService userDetailService() {
		UserDetails usuario = User.withDefaultPasswordEncoder().username("usuario").password("usuario")
				.roles("USUARIO").build();
		return new InMemoryUserDetailsManager(usuario);
		
	}
}
