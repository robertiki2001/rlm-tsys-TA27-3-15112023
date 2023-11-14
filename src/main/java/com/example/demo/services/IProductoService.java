package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Producto;


public interface IProductoService {
	
		//Listar todos
		public List<Producto> listarProductos();
		
		//Listar por id
		public Producto productoXID(Integer id); 
		
		//Guardar
		public Producto guardarProducto(Producto producto);
		
		//Actualizar
		public Producto actualizarProducto(Producto producto);
		
		//Eliminar
		public void eliminarProducto(Integer id);

}