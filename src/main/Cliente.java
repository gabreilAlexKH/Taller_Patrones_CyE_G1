package main;

import serviciosVirtuales.ServiciosMobil;
import serviciosVirtuales.ServiciosWeb;
import serviciosVirtuales.ServiciosTelefono;
import factory.*;
import factory.PatronesDisenio.*;
import Decorator.*;

public class Cliente {
	

	public static void main(String[] args) {
		
		//Solisitud de targetas
		/* Logica incompleta no tocar

		CreditCard factoryTargeta;
		
		factoryTargeta = new CreditCardPremium();

		factoryTargeta.payment();
		*/
				
		//Uso de servicios virtuales
		String ID = "1725869524";
		ServiciosMobil servicioMobil = new ServiciosMobil(); 
		float deuda = servicioMobil.consultarDeuda(ID);
		
		System.out.println("Deuda de cliente es: " + deuda + "$");
		

		//Selecion de notificasiones
		Notificacion notificasion = new Mensaje(); //Manda SMS y Correo

		notificasion = new WhatsApp(notificasion); //Manda por WhatsApp

		notificasion = new Signal(notificasion); //Manda por Siganl

		notificasion.notificar();



	}

}
