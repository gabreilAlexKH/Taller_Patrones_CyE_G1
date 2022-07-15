package Decorator;

public class Mensaje implements Notificacion {

	public Mensaje() {
		
	}
	
	@Override
	public void notificar() {
		System.out.println("SMS y correo enviados");
		
	}

}