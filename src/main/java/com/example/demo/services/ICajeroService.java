package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Cajero;


public interface ICajeroService {
	
		//Listar todos
		public List<Cajero> listarCajeros();
		
		//Listar por id
		public Cajero cajeroXID(Integer id); 
		
		//Guardar
		public Cajero guardarCajero(Cajero cajero);
		
		//Actualizar
		public Cajero actualizarCajero(Cajero cajero);
		
		//Eliminar
		public void eliminarCajero(Integer id);

}