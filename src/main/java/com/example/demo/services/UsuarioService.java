package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUsuarioDAO;
import com.example.demo.dto.Usuario;

@Service
public class UsuarioService {

	@Autowired
	IUsuarioDAO iusuarioDAO;

		//Listar todos
		public List<Usuario> list(){
			return iusuarioDAO.findAll();
		};
		
		//Listar por id
		public Usuario byId(Integer id) {
			return iusuarioDAO.findById(id).get();
		}; 
		
		//Guardar
		public Usuario save(Usuario usuario) {
			return iusuarioDAO.save(usuario);
		};
		
		//Actualizar
		public Usuario update(Usuario usuario) {
			return iusuarioDAO.save(usuario);
		};
		
		//Eliminar
		public void delete(Integer id) {
			iusuarioDAO.deleteById(id);
		}	

}
