package OpenWebinars;

public class EmailService implements IEmailService {
	private Saludator saludator;
	public void setSaludator(Saludator saludator) {
		this.saludator= saludator;
	}
	public void enviarEmail(String destinatario) {
		System.out.println(" Envaindo email a "+ destinatario);
		System.out.println("\n Mensaje: "+ saludator.saludo());
	}
}
