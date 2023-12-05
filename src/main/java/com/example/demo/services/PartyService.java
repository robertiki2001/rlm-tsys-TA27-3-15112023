package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPartyDAO;
import com.example.demo.dto.Party;

@Service
public class PartyService implements IPartyService{
	
	@Autowired
	IPartyDAO iPartyDAO;

		//Listar todos
		public List<Party> list(){
			return iPartyDAO.findAll();
		};
		
		//Listar por id
		public Party byId(Integer id) {
			return iPartyDAO.findById(id).get();
		}; 
		
		//Guardar
		public Party save(Party party) {
			return iPartyDAO.save(party);
		};
		
		//Actualizar
		public Party update(Party party) {
			return iPartyDAO.save(party);
		};
		
		//Eliminar
		public void delete(Integer id) {
			iPartyDAO.deleteById(id);
		}	

}