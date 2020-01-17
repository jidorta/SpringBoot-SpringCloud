package com.formacionbdi.springboot.app.productosb.modeles.dao;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.springboot.app.productosb.modeles.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
