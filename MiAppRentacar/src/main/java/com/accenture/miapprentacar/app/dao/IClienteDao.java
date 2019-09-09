package com.accenture.miapprentacar.app.dao;
import org.springframework.data.repository.CrudRepository;
import com.accenture.miapprentacar.app.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
	
}
