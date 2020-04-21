package co.edu.utp.calculadora.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.utp.calculadora.dto.OperacionDto;
import co.edu.utp.calculadora.service.SumaService;

//	CLASE FRONTERA

@RestController
public class SumaController {

	SumaService sumaService;

	public SumaController(SumaService sumaService) {
		
		this.sumaService = sumaService;
	}

	@PostMapping("/sumar")
	OperacionDto newSuma(@RequestBody OperacionDto operacion) {

		return sumaService.sumar(operacion);
	}
	
	@DeleteMapping("/eliminarSuma/{iid}")
	Boolean deleteSuma(@PathVariable("iid") Integer iid) {

		return sumaService.eliminarOperacion(iid);
	}

}
