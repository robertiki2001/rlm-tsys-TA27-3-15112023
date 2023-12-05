package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Videogame;


public interface IVideogameService {
	
		//Listar todos
		public List<Videogame> list();
		
		//Listar por id
		public Videogame byId(Integer id); 
		
		//Guardar
		public Videogame save(Videogame cajero);
		
		//Actualizar
		public Videogame update(Videogame cajero);
		
		//Eliminar
		public void delete(Integer id);

}