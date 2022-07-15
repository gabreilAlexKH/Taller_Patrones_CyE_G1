package Decorator;

public class Mensaje implements Notificacion {

	public Mensaje() {
		notificar();
	}
	
	@Override
	public void notificar() {
		System.out.println("SMS y correo enviados");
		
	}

}