package com.colegio.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Table(name = "curso")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Curso implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codigo")
	private Integer codigo;
	
	@NotNull
	@Size(min = 1, max = 25)
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "curso_matriculado")
    private List<Alumno> listaAlumnos;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "curso_adscrita")
    private List<Materia> listaMaterias;
	
}
