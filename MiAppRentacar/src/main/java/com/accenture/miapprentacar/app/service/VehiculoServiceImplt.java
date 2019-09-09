package com.accenture.miapprentacar.app.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.miapprentacar.app.entity.Vehiculo;
import com.accenture.miapprentacar.app.dao.IVehiculoDao;

@Service
public class VehiculoServiceImplt implements IVehiculoService {

	@Autowired
	private IVehiculoDao vehiculoDao;
	
	@Override
	public Vehiculo guardar(Vehiculo vehiculo) {
		return vehiculoDao.save(vehiculo);
	}
	
	@Override
	public List<Vehiculo> guardar (Vehiculo[] vehiculos){
		return (List<Vehiculo>) vehiculoDao.saveAll(Arrays.asList(vehiculos));
	}

	@Override
	public void borrar(Long id) {
		vehiculoDao.deleteById(id);
	}

	@Override
	public Vehiculo buscaVehiculoPorId(Long id) {
		return vehiculoDao.findById(id).orElse(null);
	}

	@Override
	public List<Vehiculo> listarTodos() {
		return (List<Vehiculo>) vehiculoDao.findAll();
	}

}
