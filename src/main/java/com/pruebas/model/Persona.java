package com.pruebas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
/**@author ropold@yahoo.fr
**/
@Entity
public class Persona {
	
	@Id
	@Column
	private Long id;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private Integer dni;
	
	@Column
	private Boolean esEmpleado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	public Boolean getEsEmpleado() {
		return esEmpleado;
	}
	public void setEsEmpleado(Boolean esEmpleado) {
		this.esEmpleado = esEmpleado;
	}
	public Persona() {	
	}
	public Persona(String nombre, String apellido, Integer dni, Boolean esEmpleado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.esEmpleado = esEmpleado;
	}
	
	
}
