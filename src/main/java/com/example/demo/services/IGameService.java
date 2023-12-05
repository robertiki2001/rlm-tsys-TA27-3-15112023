package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Game;


public interface IGameService {
	
		//Listar todos
		public List<Game> list();
		
		//Listar por id
		public Game byId(Integer id); 
		
		//Guardar
		public Game save(Game game);
		
		//Actualizar
		public Game update(Game game);
		
		//Eliminar
		public void delete(Integer id);

}