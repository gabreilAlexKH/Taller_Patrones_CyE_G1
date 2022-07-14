package serviciosVirtuales;

import serviciosPresenciales.SubClientes;
import serviciosPresenciales.SubDeudas;
import serviciosPresenciales.SubCuentas;
import serviciosPresenciales.SubPagos;


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
		
		//Llamadas a clases de servicioPresenciales

		
		return saldo;
	}
	
	public float consultarDeuda(String ID) {
		
		float deuda = 0;
		
		Object cliente = SubClientes.getCliente(ID);
		
		deuda = SubDeudas.getDeudaClient(cliente);
		
		return deuda;
	}
	
	public void abonar(String ID, float pago) {
		
		//Acceder a SubCliente
		//Acceder a SubPagos
		
	}
}
