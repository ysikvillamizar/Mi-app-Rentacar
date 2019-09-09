package com.accenture.miapprentacar.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.miapprentacar.app.entity.Vehiculo;
import com.accenture.miapprentacar.app.service.IVehiculoService;

@RestController
@RequestMapping("/apiRenta")
public class VehiculoController {

	@Autowired
	private IVehiculoService vehiculoService;
	
	@GetMapping("/vehiculos")
	public List<Vehiculo> listar(){
		return vehiculoService.listarTodos();
	}
	
	@GetMapping("/vehiculos/{id}")
	public Vehiculo buscarPorId (@PathVariable Long id) {
		return vehiculoService.buscaVehiculoPorId(id);
	}
	
	@PostMapping("/vehiculo")
	public Vehiculo guardar (@RequestBody Vehiculo vehiculo) {
		return vehiculoService.guardar(vehiculo);
	}
	
	@PostMapping("/vehiculos")
	public List<Vehiculo> guardar(@RequestBody Vehiculo[] vehiculos){
		return vehiculoService.guardar(vehiculos);
	}
	
	@PostMapping("/actualizar")
	public Vehiculo actualizar (@RequestBody Vehiculo vehiculo) {
		
		
		Vehiculo vehiculoActual=vehiculoService.buscaVehiculoPorId(vehiculo.getId());
		
		vehiculoActual.setColor(vehiculo.getColor());
		vehiculoActual.setLinea(vehiculo.getLinea());
		vehiculoActual.setMarca(vehiculo.getMarca());
		vehiculoActual.setModeloAuto(vehiculo.getModeloAuto());
		vehiculoActual.setPlaca(vehiculo.getPlaca());
		
		return vehiculoService.guardar(vehiculoActual);
		
	}
	
	@DeleteMapping("/vehiculos/{id}")
	public String borrar(@PathVariable Long id) {
		vehiculoService.borrar(id);
		return "El vehiculo seelimino correctamente";
	}
	


}
