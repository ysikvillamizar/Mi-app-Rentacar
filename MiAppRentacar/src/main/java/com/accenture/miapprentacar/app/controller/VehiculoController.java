package com.accenture.miapprentacar.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.miapprentacar.app.entity.Vehiculo;
import com.accenture.miapprentacar.app.service.IVehiculoService;

@RestController
@RequestMapping("/api")
public class VehiculoController {

	@Autowired
	private IVehiculoService vehiculoService;
	
	@GetMapping("/vehiculos")
	public List<Vehiculo> listar(){
		return vehiculoService.listarTodos();
	}
}
