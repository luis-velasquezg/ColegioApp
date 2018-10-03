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
public class Alumno implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@NotNull
    @Size(min = 1, max = 30)
	@Column(name = "nombres")
	private String nombres;
	
	@NotNull
    @Size(min = 1, max = 30)
	@Column(name = "apellidos")
	private String apellidos;
	
	@NotNull
    @Size(min = 1, max = 50)
	@Column(name = "correo_electronico")
	private String correoElectronico;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "curso_matriculado", nullable = false)
	private Curso cursoMatriculado;

}
