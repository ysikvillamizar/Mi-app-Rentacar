package com.accenture.miapprentacar.app.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="cliente_x_vehiculo")
public class ClienteVehiculo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Cliente cliente;
	
	@OneToMany(fetch=FetchType.LAZY)
	private List<Vehiculo>vehiculos;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_creacion_registro")
	private Date fechaCreacionRegistro;
	
	private String observaiones;
	
	@PrePersist
	public void prePersist() {
		fechaCreacionRegistro=new Date();
	}
}
