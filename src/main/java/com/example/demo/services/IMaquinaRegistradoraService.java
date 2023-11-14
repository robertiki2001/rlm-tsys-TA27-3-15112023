package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.MaquinaRegistradora;


public interface IMaquinaRegistradoraService {
	
		//Listar todos
		public List<MaquinaRegistradora> listarMaquinasRegistradoras();
		
		//Listar por id
		public MaquinaRegistradora maquinaRegistradoraXID(Integer id); 
		
		//Guardar
		public MaquinaRegistradora guardarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora);
		
		//Actualizar
		public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora);
		
		//Eliminar
		public void eliminarMaquinaRegistradora(Integer id);

}