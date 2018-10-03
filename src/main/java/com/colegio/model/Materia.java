package com.colegio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Materia implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "codigo")
	private Integer codigo;
	
	@NotNull
	@Size(min = 1, max = 10)
	@Column(name = "semestre")
	private String semestre;
	
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "curso_adscrita", nullable = false)
	private Curso cursoAdscrita;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "profesor_asignado", nullable = false)
	private Profesor profesorAsignado;

}
