package com.accenture.miapprentacar.app.service;

import java.util.List;

import com.accenture.miapprentacar.app.entity.Vehiculo;

public interface IVehiculoService {

	public Vehiculo guardar (Vehiculo vehiculo);
	
	public void borrar (Long id);
	
	public Vehiculo buscaVehiculoPorId(Long id);
	
	public List<Vehiculo> listarTodos();
}
