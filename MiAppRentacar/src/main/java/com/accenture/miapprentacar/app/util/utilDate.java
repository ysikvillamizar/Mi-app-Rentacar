package com.accenture.miapprentacar.app.util;

import java.time.DateTimeException;
import java.util.Date;

public class utilDate {
	
	public static final double VALOR_PI=3.1416;
	
	public static int calcularDias(Date fechaInicio, Date fechaFin) {
		try {
			long diferencia= fechaFin.getTime()- fechaInicio.getTime();
			Long d=(diferencia/(1000*60*60*24));
			int dias=d.intValue();
			//ej.cierro conexion
			return dias;
		}
		catch(DateTimeException e){
			throw e;
		}
		finally {
			
		}
	}

}
