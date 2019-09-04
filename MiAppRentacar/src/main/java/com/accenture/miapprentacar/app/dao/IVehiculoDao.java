package com.accenture.miapprentacar.app.dao;
import org.springframework.data.repository.CrudRepository;

import com.accenture.miapprentacar.app.entity.Vehiculo;

public interface IVehiculoDao extends CrudRepository <Vehiculo, Long> {
 //public String nombreDelMetodo();
	
}
