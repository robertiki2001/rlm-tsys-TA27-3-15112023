package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IGameDAO;
import com.example.demo.dto.Game;

@Service
public class GameService implements IGameService{
	
	@Autowired
	IGameDAO iGameDAO;

		//Listar todos
		public List<Game> list(){
			return iGameDAO.findAll();
		};
		
		//Listar por id
		public Game byId(Integer id) {
		return iGameDAO.findById(id).get();
				}; 
		
		//Guardar
		public Game save(Game game) {
			return iGameDAO.save(game);
		};
		
		//Actualizar
		public Game update(Game game) {
			return iGameDAO.save(game);
		}
		
		public void delete(Integer id) {
			iGameDAO.deleteById(id);
		}		

}