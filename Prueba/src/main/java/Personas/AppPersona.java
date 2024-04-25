package Personas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppPersona {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Meta-INF/beansPersona.xml");
		
		PersonaDAO  personaDAO = appContext.getBean(PersonaImpMemory.class); //tambien puedo poner PersonaDAO.class que igual funciona
		
		personaDAO.findAll().forEach(System.out :: println);
		
		((ClassPathXmlApplicationContext) appContext).close();

	}

}
