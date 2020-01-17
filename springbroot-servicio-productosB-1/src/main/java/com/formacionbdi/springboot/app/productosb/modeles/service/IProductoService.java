package com.formacionbdi.springboot.app.productosb.modeles.service;

import java.util.List;

import com.formacionbdi.springboot.app.productosb.modeles.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);

}
