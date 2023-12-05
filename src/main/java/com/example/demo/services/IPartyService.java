package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Party;


public interface IPartyService {
	
		//Listar todos
		public List<Party> list();
		
		//Listar por id
		public Party byId(Integer id); 
		
		//Guardar
		public Party save(Party venta);
		
		//Actualizar
		public Party update(Party venta);
		
		//Eliminar
		public void delete(Integer id);

}