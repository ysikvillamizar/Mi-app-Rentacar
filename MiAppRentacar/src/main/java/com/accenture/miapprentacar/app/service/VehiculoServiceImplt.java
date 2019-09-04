package com.accenture.miapprentacar.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.miapprentacar.app.entity.Vehiculo;
import com.accenture.miapprentacar.app.dao.IVehiculoDao;

public class VehiculoServiceImplt implements IVehiculoService {

	@Autowired
	private IVehiculoDao vehiculoDao;
	
	@Override
	public Vehiculo guardar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return vehiculoDao.save(vehiculo);
	}

	@Override
	public void borrar(Long id) {
		// TODO Auto-generated method stub
		vehiculoDao.deleteById(id);
	}

	@Override
	public Vehiculo buscaVehiculoPorId(Long id) {
		// TODO Auto-generated method stub
		return vehiculoDao.findById(id).orElse(null);
	}

	@Override
	public List<Vehiculo> listarTodos() {
		// TODO Auto-generated method stub
		return (List<Vehiculo>) vehiculoDao.findAll();
	}

}
