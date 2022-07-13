package serviciosPresenciales;

public class TiendaFacade {
	
	private static TiendaFacade instance ;
	
	private TiendaFacade() {
		
	}
	
	static public TiendaFacade getInstance() {
		
		if (instance == null) {
			
			instance = new TiendaFacade();
		}
		
		return instance;
	}
	
	public float consultarSaldo(String ID) {
		
		float saldo = 0;
		
		return saldo;
	}
	
	public float consultarDeuda(String ID) {
		
		float deuda = 0;
		
		return deuda;
	}
	
	public void abonar(String ID, float pago) {
		
		
	}
}
