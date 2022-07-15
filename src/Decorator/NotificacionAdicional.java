package Decorator;

public abstract class NotificacionAdicional implements Notificacion {
	private Notificacion notificacion;
	
	public NotificacionAdicional(Notificacion notificacion) {
		this.notificacion = notificacion;
	}

	@Override
	public void notificar() {
		// TODO Auto-generated method stub
		
	}

}
