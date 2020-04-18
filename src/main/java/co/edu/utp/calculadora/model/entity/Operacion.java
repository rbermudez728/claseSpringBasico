package co.edu.utp.calculadora.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Operacion {
	
	@Id
	@GeneratedValue
	private Integer iid;
	
	private Integer operador1;
	private Integer operador2;
	private Integer resultado;
	
	private String nombre;

	public Integer getOperador1() {
		return operador1;
	}

	public void setOperador1(Integer operador1) {
		this.operador1 = operador1;
	}

	public Integer getOperador2() {
		return operador2;
	}

	public void setOperador2(Integer operador2) {
		this.operador2 = operador2;
	}

	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}

	public Integer getIid() {
		return iid;
	}

	public void setIid(Integer iid) {
		this.iid = iid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
