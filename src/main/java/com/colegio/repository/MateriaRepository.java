package com.colegio.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colegio.model.Materia;

@Repository
public interface MateriaRepository extends CrudRepository<Materia, Integer> {
	
	public void insertarMateria(Materia materia);
	
	public void modificarMateria(Materia materia);
	
	public void eliminarMateria(Integer codigo);
	
	public Materia obtenerMateria(Integer codigo);
	
	public List<Materia> listarMateria();

}
