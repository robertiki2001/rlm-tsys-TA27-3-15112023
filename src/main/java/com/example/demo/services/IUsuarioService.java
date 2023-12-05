package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Usuario;

public interface IUsuarioService {
	//Listar todos
			public List<Usuario> list();
			
			//Listar por id
			public Usuario byId(Long id); 
			
			//Guardar
			public Usuario save(Usuario venta);
			
			//Actualizar
			public Usuario update(Usuario venta);
			
			//Eliminar
			public void delete(Long id);
}
