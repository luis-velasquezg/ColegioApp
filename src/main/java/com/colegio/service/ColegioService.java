package com.colegio.service;

public interface ColegioService {
	
	public void agregarMateriaACurso(Integer codigo, String semestre, String nombre,
			Integer cursoAdscrita, Integer profesorAsignado);
	
	public void asignarProfesorAMateria(Integer id, String nombres, String apellidos,
			String correoElectronico, Integer materiaACargo);
	
	public void matricularAlumnoACurso(Integer id, String nombres, String apellidos,
			String correoElectronico, Integer cursoAMatricular);	

}
