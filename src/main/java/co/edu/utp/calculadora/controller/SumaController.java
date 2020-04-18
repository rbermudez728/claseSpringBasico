package co.edu.utp.calculadora.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.utp.calculadora.dto.Operacion;
import co.edu.utp.calculadora.service.SumaService;

//	CLASE FRONTERA

@RestController
public class SumaController {

	SumaService sumaService;

	public SumaController(SumaService sumaService) {
		
		this.sumaService = sumaService;
	}

	@PostMapping("/sumar")
	Operacion newSuma(@RequestBody Operacion operacion) {

		return sumaService.sumar(operacion);
	}

}
