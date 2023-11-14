package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMaquinaRegistradoraDAO;
import com.example.demo.dto.MaquinaRegistradora;

@Service
public class MaquinaRegistradoraService implements IMaquinaRegistradoraService{
	
	@Autowired
	IMaquinaRegistradoraDAO iMaquinaRegistradoraDAO;

		//Listar todos
		public List<MaquinaRegistradora> listarMaquinasRegistradoras(){
			return iMaquinaRegistradoraDAO.findAll();
		};
		
		//Listar por id
		public MaquinaRegistradora maquinaRegistradoraXID(Integer id) {
			return iMaquinaRegistradoraDAO.findById(id).get();
		}; 
		
		//Guardar
		public MaquinaRegistradora guardarMaquinaRegistradora(MaquinaRegistradora maquina_registradora) {
			return iMaquinaRegistradoraDAO.save(maquina_registradora);
		};
		
		//Actualizar
		public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquina_registradora) {
			return iMaquinaRegistradoraDAO.save(maquina_registradora);
		};
		
		//Eliminar
		public void eliminarMaquinaRegistradora(Integer id) {
			iMaquinaRegistradoraDAO.deleteById(id);
		}		

}