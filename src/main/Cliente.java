package main;

import serviciosVirtuales.ServiciosMobil;
import serviciosVirtuales.ServiciosWeb;
import serviciosVirtuales.ServiciosTelefono;

public class Cliente {
	

	public static void main(String[] args) {
		
		//Solisitud de targetas
		
		
		//Uso de servicios virtuales
		String ID = "1725869524";
		ServiciosMobil servicioMobil = new ServiciosMobil(); 
		float deuda = servicioMobil.consultarDeuda(ID);
		
		System.out.println("Deuda de cliente es: " + deuda + "$");
		
		//Selecion de notificasiones

	}

}
