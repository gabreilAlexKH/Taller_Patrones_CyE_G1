package Decorator;

public class Telegram extends NotificacionAdicional {

	public Telegram(Notificacion notificacion) {
		super(notificacion);
		notificar();
	}

	@Override
	public void notificar() {
		System.out.println("Telegram enviado");
		
	}

}

