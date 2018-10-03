package com.colegio.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colegio.model.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Integer>  {
	
	public void insertarAlumno(Alumno alumno);
	
	public void modificarAlumno(Alumno alumno);
	
	public void eliminarAlumno(Integer id);
	
	public Alumno obtenerAlumno(Integer id);
	
	public List<Alumno> listarAlumnos();

}
