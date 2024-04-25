package OpenWebinars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Meta-INF/beans.xml");
		
		//USANDO Saludator.class
		
		Saludator saludator = null;
		
		saludator= appContext.getBean(Saludator.class);
		
		System.out.println(saludator.saludo()+"\n");
		
		//USANDO  IEmailService.class
		
		IEmailService eS = null;
		
		eS = appContext.getBean(IEmailService.class);
		
		eS.enviarEmail("laura@educa.madrid.org");
		
		((ClassPathXmlApplicationContext) appContext).close();
		
		
	}
}
