package co.edu.utp.calculadora.service;

import co.edu.utp.calculadora.dto.OperacionDto;

public interface SumaService {
	
	OperacionDto sumar(OperacionDto operacion);

	Boolean eliminarOperacion(Integer id);

}
