package com.colegio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.model.Curso;
import com.colegio.model.Materia;
import com.colegio.repository.AlumnoRepository;
import com.colegio.repository.CursoRepository;
import com.colegio.repository.MateriaRepository;
import com.colegio.repository.ProfesorRepository;
import com.example.model.Player;
import com.example.model.Team;
import com.example.repository.PlayerRepository;
import com.example.repository.TeamRepository;

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
		Curso curso = cursoRepository.obtenerCurso(cursoAdscrita).getClass();
		Materia nuevaMateria = new Materia();
		nuevaMateria.setCodigo(codigo);
		nuevaMateria.setSemestre(semestre);
		nuevaMateria.setNombre(nombre);
		nuevaMateria.setCurso(cursoAdscrita);
		playerRepository.save(newPlayer);

	}

	@Override
	public void asignarProfesorAMateria(Integer id, String nombres, String apellidos, String correoElectronico,
			Integer materiaACargo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void matricularAlumnoACurso(Integer id, String nombres, String apellidos, String correoElectronico,
			Integer cursoAMatricular) {
		// TODO Auto-generated method stub

	}

}
