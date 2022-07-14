package serviciosVirtuales;

public class ServiciosTelefono {
	
	public float consultarSaldo(String ID) {
		
		TiendaFacade tienda= TiendaFacade.getInstance();

		return tienda.consultarSaldo(ID);
	}

}
