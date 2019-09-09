package com.accenture.miapprentacar.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.miapprentacar.app.entity.Cliente;
import com.accenture.miapprentacar.app.service.IClienteService;


@RestController
@RequestMapping ("/apiRenta")
public class ClienteController {

	@Autowired
	private IClienteService clienteService;
	
	@PostMapping("/cliente")
	public Cliente guardar(@RequestBody Cliente cliente) {
		return clienteService.guardar(cliente);
	}

	@PostMapping ("/clientes")
	public List<Cliente> guardar(@RequestBody Cliente[] clientes) {
		return clienteService.guardar(clientes);
	}

	@DeleteMapping("/clientes/{id}")
	public String borrar(@PathVariable Long id) {
		clienteService.borrar(id);
		return "El cliente e elimino correctamente";

	}

	@GetMapping("/cliente/{id}")
	public Cliente buscarClientePorId(@PathVariable Long id) {
		return clienteService.buscarClientePorId(id);
	}

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		return (List<Cliente>) clienteService.listarTodos();
	}
	
	@SuppressWarnings("unused")
	@PostMapping("/actualizarCliente")
	public Cliente actualizar(@RequestBody Cliente cliente) {
		
		Cliente clienteAActualizar= new Cliente();
		Cliente clienteActual=clienteService.buscarClientePorId(cliente.getId());
		
		clienteAActualizar.setId(cliente.getId());
		clienteAActualizar.setCedula(cliente.getCedula());
		clienteAActualizar.setNombre(cliente.getNombre());
		clienteAActualizar.setApellido(cliente.getApellido());
		clienteAActualizar.setTelefono(cliente.getTelefono());
		clienteAActualizar.setDireccion(cliente.getDireccion());
		clienteAActualizar.setEmail(cliente.getEmail());
		
		return clienteService.guardar(clienteAActualizar);
	}
	

	
}
