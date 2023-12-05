package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IVideogameDAO;
import com.example.demo.dto.Videogame;

@Service
public class VideogameService implements IVideogameService{
	
	@Autowired
	IVideogameDAO iVideogameDAO;

		//Listar todos
		public List<Videogame> list(){
			return iVideogameDAO.findAll();
		};
		
		//Listar por id
		public Videogame byId(Integer id) {
			return iVideogameDAO.findById(id).get();
		}; 
		
		//Guardar
		public Videogame save(Videogame videogame) {
			return iVideogameDAO.save(videogame);
		};
		
		//Actualizar
		public Videogame update(Videogame videogame) {
			return iVideogameDAO.save(videogame);
		};
		
		//Eliminar
		public void delete(Integer id) {
			iVideogameDAO.deleteById(id);
		}

}