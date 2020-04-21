package co.edu.utp.calculadora.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.utp.calculadora.model.entity.Operacion;

public interface OperacionRepository extends CrudRepository<Operacion, Integer> {

}