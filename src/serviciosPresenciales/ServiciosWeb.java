package serviciosPresenciales;

public class ServiciosWeb {
	
	public void abonar(String ID, float pago) {
		
		TiendaFacade tienda= TiendaFacade.getInstance();
				
		tienda.abonar(ID, pago);
		
	}

}
