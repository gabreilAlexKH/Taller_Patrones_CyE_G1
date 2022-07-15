package Decorator;

public class WhatsApp extends NotificacionAdicional {

	public WhatsApp(Notificacion notificacion) {
		super(notificacion);
		notificar();
	}

	@Override
	public void notificar() {
		System.out.println("WhatsApp enviado");
		
	}

}
