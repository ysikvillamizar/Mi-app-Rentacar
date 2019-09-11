package com.accenture.miapprentacar.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="prestamo")
public class Prestamo implements Serializable {

	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="vehiculo_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Vehiculo vehiculo;
	
}
