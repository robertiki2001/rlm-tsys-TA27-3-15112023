package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProductoDAO;
import com.example.demo.dto.Producto;

@Service
public class ProductoService implements IProductoService{
	
	@Autowired
	IProductoDAO iProductoDAO;

		//Listar todos
		public List<Producto> listarProductos(){
			return iProductoDAO.findAll();
		};
		
		//Listar por id
		public Producto productoXID(Integer id) {
			return iProductoDAO.findById(id).get();
		}; 
		
		//Guardar
		public Producto guardarProducto(Producto producto) {
			return iProductoDAO.save(producto);
		};
		
		//Actualizar
		public Producto actualizarProducto(Producto producto) {
			return iProductoDAO.save(producto);
		};
		
		//Eliminar
		public void eliminarProducto(Integer id) {
			iProductoDAO.deleteById(id);
		}		

}