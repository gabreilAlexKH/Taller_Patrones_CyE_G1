package Decorator;

public class Wire extends NotificacionAdicional {

	public Wire(Notificacion notificacion) {
		super(notificacion);
	}

	@Override
	public void notificar() {
		System.out.println("Wire enviado");
		super.notificar();
		
	}

}
