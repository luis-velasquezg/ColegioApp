package com.colegio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.model.Alumno;
import com.colegio.model.Curso;
import com.colegio.model.Materia;
import com.colegio.model.Profesor;
import com.colegio.repository.AlumnoRepository;
import com.colegio.repository.CursoRepository;
import com.colegio.repository.MateriaRepository;
import com.colegio.repository.ProfesorRepository;


@Service
public class ColegioServiceImpl implements ColegioService {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Autowired
	private MateriaRepository materiaRepository;
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	private ProfesorRepository profesorRepository;

	@Override
	public void agregarMateriaACurso(Integer codigo, String semestre, String nombre, Integer cursoAdscrita,
			Integer profesorAsignado) {
		Curso curso = cursoRepository.obtenerCurso(cursoAdscrita);
		Profesor profesor = profesorRepository.obtenerProfesor(profesorAsignado);
		Materia nuevoMateria = new Materia();
		nuevoMateria.setCodigo(codigo);
		nuevoMateria.setSemestre(semestre);
		nuevoMateria.setNombre(nombre);
		nuevoMateria.setCursoAdscrita(curso);
		nuevoMateria.setProfesorAsignado(profesor);
		materiaRepository.save(nuevoMateria);

	}

	@Override
	public void asignarProfesorAMateria(Integer id, String nombres, String apellidos, String correoElectronico,
			Integer materiaACargo) {
		Materia materia = materiaRepository.obtenerMateria(materiaACargo);
		Profesor nuevoProfesor = new Profesor();
		nuevoProfesor.setId(id);
		nuevoProfesor.setNombres(nombres);
		nuevoProfesor.setApellidos(apellidos);
		nuevoProfesor.setCorreoElectronico(correoElectronico);
		nuevoProfesor.getListaMaterias().add(materia);
		profesorRepository.save(nuevoProfesor);
		
	}

	@Override
	public void matricularAlumnoACurso(Integer id, String nombres, String apellidos, String correoElectronico,
			Integer cursoAMatricular) {
		
		Curso curso = cursoRepository.obtenerCurso(cursoAMatricular);
		Alumno nuevoAlumno = new Alumno();
		nuevoAlumno.setId(id);
		nuevoAlumno.setNombres(nombres);
		nuevoAlumno.setApellidos(apellidos);
		nuevoAlumno.setCorreoElectronico(correoElectronico);
		nuevoAlumno.setCursoMatriculado(curso);
		alumnoRepository.save(nuevoAlumno);

	}

}
