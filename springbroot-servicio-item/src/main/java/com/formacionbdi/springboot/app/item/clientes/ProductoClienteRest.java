package com.formacionbdi.springboot.app.item.clientes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.formacionbdi.springboot.app.item.models.Producto;

import java.util.*;

@FeignClient(name ="servicio-productos")
public interface ProductoClienteRest {
		
	
	@GetMapping("/listar")
	public List<Producto> listar();
		
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id);

}
