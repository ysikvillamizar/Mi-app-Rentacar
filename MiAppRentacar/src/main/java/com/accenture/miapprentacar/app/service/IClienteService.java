package com.accenture.miapprentacar.app.service;

import java.util.List;
import com.accenture.miapprentacar.app.entity.Cliente;

public interface IClienteService {

	public Cliente guardar (Cliente cliente);
	public List<Cliente> guardar (Cliente[] clientes);
	public void borrar (Long id);
	public Cliente buscarClientePorId(Long id);
	public List<Cliente> listarTodos();
}
