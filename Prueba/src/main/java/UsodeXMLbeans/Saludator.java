package UsodeXMLbeans;

public class Saludator {
	private String mensaje;


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje.toUpperCase();
	}
	
	public String saludo() {
		return (mensaje == null) ? "Hola desde la clase":mensaje;
	}

	
}
