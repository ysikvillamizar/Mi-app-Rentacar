package com.accenture.miapprentacar.app.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.accenture.miapprentacar.app.entity.Cliente;
import com.accenture.miapprentacar.app.dao.IClienteDao;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	public Cliente guardar(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	public List<Cliente> guardar(Cliente[] clientes) {
		return (List<Cliente>) clienteDao.saveAll(Arrays.asList(clientes));
	}

	@Override
	public void borrar(Long id) {
		clienteDao.deleteById(id);

	}

	@Override
	public Cliente buscarClientePorId(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	public List<Cliente> listarTodos() {
		return (List<Cliente>) clienteDao.findAll();
	}

}
