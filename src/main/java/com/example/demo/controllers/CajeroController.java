package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Cajero;
import com.example.demo.services.CajeroService;

@RestController
@RequestMapping("/api")
public class CajeroController {

	@Autowired
	CajeroService cajeroService;

	@GetMapping("/cajeros")
	public List<Cajero> listarCajeros() {
		return cajeroService.listarCajeros();
	}

	@GetMapping("/cajero/{id}")
	public Cajero cajeroXID(@PathVariable(name = "id") Integer id) {
		return cajeroService.cajeroXID(id);
	}

	@PostMapping("/cajero")
	public Cajero guardarCajero(@RequestBody Cajero cajero) {
		return cajeroService.guardarCajero(cajero);
	}

	@PutMapping("/cajero/{id}")
	public Cajero actualizarCajero(@PathVariable(name = "id") Integer id, @RequestBody Cajero cajero) {

		Cajero cajero_seleccionado = cajeroService.cajeroXID(id);
		Cajero cajero_actualizado = new Cajero();

		cajero_seleccionado.setNom_apels(cajero.getNom_apels());

		cajero_actualizado = cajeroService.actualizarCajero(cajero_seleccionado);

		return cajero_actualizado;
	}

	@DeleteMapping("/cajero/{id}")
	public void eliminarCajero(@PathVariable Integer id) {
		cajeroService.eliminarCajero(id);
	}

}
