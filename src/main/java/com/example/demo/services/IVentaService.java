package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Venta;


public interface IVentaService {
	
		//Listar todos
		public List<Venta> listarVentas();
		
		//Listar por id
		public Venta ventaXID(Integer id); 
		
		//Guardar
		public Venta guardarVenta(Venta venta);
		
		//Actualizar
		public Venta actualizarVenta(Venta venta);
		
		//Eliminar
		public void eliminarVenta(Integer id);

}