package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.MaquinaRegistradora;
import com.example.demo.services.MaquinaRegistradoraService;

@RestController
@RequestMapping("/api")
public class MaquinaRegistradoraController {

	@Autowired
	MaquinaRegistradoraService maquinaRegistradoraService;

	@GetMapping("/maquina_registradoras")
	public List<MaquinaRegistradora> listarMaquinasRegistradoras() {
		return maquinaRegistradoraService.listarMaquinasRegistradoras();
	}

	@GetMapping("/maquina_registradora/{id}")
	public MaquinaRegistradora maquinaRegistradoraXID(@PathVariable(name = "id") Integer id) {
		return maquinaRegistradoraService.maquinaRegistradoraXID(id);
	}

	@PostMapping("/maquina_registradora")
	public MaquinaRegistradora guardarCajero(@RequestBody MaquinaRegistradora maquina_registradora) {
		return maquinaRegistradoraService.guardarMaquinaRegistradora(maquina_registradora);
	}

	@PutMapping("/maquina_registradora/{id}")
	public MaquinaRegistradora actualizarMaquinaRegistradora(@PathVariable(name = "id") Integer id, @RequestBody MaquinaRegistradora maquina_registradora) {

		MaquinaRegistradora maquina_registradora_seleccionado = maquinaRegistradoraService.maquinaRegistradoraXID(id);
		MaquinaRegistradora maquina_registradora_actualizado = new MaquinaRegistradora();

		maquina_registradora_seleccionado.setPiso(maquina_registradora.getPiso());

		maquina_registradora_actualizado = maquinaRegistradoraService.actualizarMaquinaRegistradora(maquina_registradora_seleccionado);

		return maquina_registradora_actualizado;
	}

	@DeleteMapping("/maquina_registradora/{id}")
	public void eliminarCajero(@PathVariable Integer id) {
		maquinaRegistradoraService.eliminarMaquinaRegistradora(id);
	}

}
