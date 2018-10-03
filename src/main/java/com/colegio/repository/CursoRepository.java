package com.colegio.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.colegio.model.Curso;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Integer> {

	public void insertarCurso(Curso curso);
	
	public void modificarCurso(Curso curso);
	
	public void eliminarCurso(int codigo);
	
	public Curso obtenerCurso(int codigo);
	
	public List<Curso> listarCursos();
		
}
