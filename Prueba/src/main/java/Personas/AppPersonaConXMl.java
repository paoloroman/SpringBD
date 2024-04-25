package Personas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppPersonaConXMl {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Meta-INF/beansPersonaXMl.xml");
		
		PersonaDAO  personaDAO = appContext.getBean(Personas.class);
		
		personaDAO.findAll().forEach(System.out :: println);
		
		((ClassPathXmlApplicationContext) appContext).close();

	}
}




