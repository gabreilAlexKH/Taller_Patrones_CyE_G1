package Decorator;

public class Signal extends NotificacionAdicional {

	public Signal(Notificacion notificacion) {
		super(notificacion);
		notificar();
	}

	@Override
	public void notificar() {
		System.out.println("Signal enviado");		
	}

}

