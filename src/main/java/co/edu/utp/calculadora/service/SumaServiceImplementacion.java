package co.edu.utp.calculadora.service;

import org.springframework.stereotype.Service;

import co.edu.utp.calculadora.dto.OperacionDto;
import co.edu.utp.calculadora.model.entity.Operacion;
import co.edu.utp.calculadora.model.repository.OperacionRepository;

//CLASE CONTROL

@Service
public class SumaServiceImplementacion implements SumaService {

	OperacionRepository operacionRepository;
	
	public SumaServiceImplementacion(OperacionRepository operacionRepository) {
		
		this.operacionRepository = operacionRepository;
	}
	
	@Override
	public OperacionDto sumar(OperacionDto operacion) {
		
		//Ejecutar la lógica del negocio
		operacion.setResultado(operacion.getOperador1() + operacion.getOperador2());
		
		//Persistir la operación en la base de datos
		Operacion operacionEntity = new Operacion();		
		operacionEntity.setOperador1(operacion.getOperador1());
		operacionEntity.setOperador2(operacion.getOperador2());
		operacionEntity.setResultado(operacion.getResultado());
		operacionRepository.save(operacionEntity);
		
		return operacion;
	}

	@Override
	public Boolean eliminarOperacion(Integer id) {
		
		Boolean respuesta = true;
		
		try {
		
			operacionRepository.deleteById(id);
		}catch(Exception e) {
			
			respuesta = false;
		}
		
		return respuesta;
	}
	
}
