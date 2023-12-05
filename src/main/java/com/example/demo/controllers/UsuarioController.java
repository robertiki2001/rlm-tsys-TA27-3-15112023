package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Usuario;
import com.example.demo.services.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping("/usuarios")
	public List<Usuario> list() {
		return usuarioService.list();
	}

	@GetMapping("/usuario/{id}")
	public Usuario byId(@PathVariable(name = "id") Integer id) {
		return usuarioService.byId(id);
	}

	@PostMapping("/usuario")
	public Usuario save(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}

	@PutMapping("/usuario/{id}")
	public Usuario update(@PathVariable(name = "id") Integer id, @RequestBody Usuario usuario) {

		Usuario usuario_selected = new Usuario();
		Usuario usuario_updated = new Usuario();

		usuario_selected = usuarioService.byId(id);
		usuario_selected.setId(id);
		usuario_selected.setUsername(usuario.getUsername());
		usuario_selected.setRole(usuario.getRole());
		usuario_selected.setPassword(usuario.getPassword());

		usuario_updated = usuarioService.update(usuario_selected);

		return usuario_updated;
	}

	@DeleteMapping("/usuario/{id}")
	public void delete(@PathVariable Integer id) {
		usuarioService.delete(id);
	}

}
