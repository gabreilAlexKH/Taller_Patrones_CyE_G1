package serviciosVirtuales;

public class ServiciosMobil {
	
	public float consultarDeuda(String ID) {
		
		TiendaFacade tienda= TiendaFacade.getInstance();

		return tienda.consultarDeuda(ID);
	}

}
