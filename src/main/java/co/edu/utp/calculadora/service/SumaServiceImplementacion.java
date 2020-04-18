package co.edu.utp.calculadora.service;

import org.springframework.stereotype.Service;

import co.edu.utp.calculadora.dto.Operacion;

//CLASE CONTROL

@Service
public class SumaServiceImplementacion implements SumaService {

	@Override
	public Operacion sumar(Operacion operacion) {
		
		operacion.setResultado(operacion.getOperador1() + operacion.getOperador2());
		
		return operacion;
	}
	
}
