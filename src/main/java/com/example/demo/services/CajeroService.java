package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajeroDAO;
import com.example.demo.dto.Cajero;

@Service
public class CajeroService implements ICajeroService{
	
	@Autowired
	ICajeroDAO iCajeroDAO;

		//Listar todos
		public List<Cajero> listarCajeros(){
			return iCajeroDAO.findAll();
		};
		
		//Listar por id
		public Cajero cajeroXID(Integer id) {
			return iCajeroDAO.findById(id).get();
		}; 
		
		//Guardar
		public Cajero guardarCajero(Cajero cajero) {
			return iCajeroDAO.save(cajero);
		};
		
		//Actualizar
		public Cajero actualizarCajero(Cajero cajero) {
			return iCajeroDAO.save(cajero);
		};
		
		//Eliminar
		public void eliminarCajero(Integer id) {
			iCajeroDAO.deleteById(id);
		}		

}