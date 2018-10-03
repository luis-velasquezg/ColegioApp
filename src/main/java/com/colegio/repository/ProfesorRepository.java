package com.colegio.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colegio.model.Profesor;

@Repository
public interface ProfesorRepository extends CrudRepository<Profesor, Integer> {
	
	public void insertarProfesor(Profesor profesor);
	
	public void modificarProfesor(Profesor profesor);
	
	public void eliminarProfesor(Integer id);
	
	public Profesor obtenerProfesor(Integer id);
	
	public List<Profesor> listarProfesor();

}
