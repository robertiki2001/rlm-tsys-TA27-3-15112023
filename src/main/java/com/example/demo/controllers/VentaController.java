package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Venta;
import com.example.demo.services.VentaService;

@RestController
@RequestMapping("/api")
public class VentaController {

	@Autowired
	VentaService ventaService;

	@GetMapping("/ventas")
	public List<Venta> listarVentas() {
		return ventaService.listarVentas();
	}

	@GetMapping("/venta/{id}")
	public Venta ventaXID(@PathVariable(name = "id") Integer id) {
		return ventaService.ventaXID(id);
	}

	@PostMapping("/venta")
	public Venta guardarVenta(@RequestBody Venta venta) {
		return ventaService.guardarVenta(venta);
	}

	@PutMapping("/venta/{id}")
	public Venta actualizarVenta(@PathVariable(name = "id") Integer id, @RequestBody Venta venta) {

		Venta venta_seleccionado = ventaService.ventaXID(id);
		Venta venta_actualizado = new Venta();

		venta_seleccionado.setCajero(venta.getCajero());
		venta_seleccionado.setMaquinaRegistradora(venta.getMaquinaRegistradora());
		venta_seleccionado.setProducto(venta.getProducto());

		venta_actualizado = ventaService.actualizarVenta(venta_seleccionado);

		return venta_actualizado;
	}

	@DeleteMapping("/venta/{id}")
	public void eliminarVenta(@PathVariable Integer id) {
		ventaService.eliminarVenta(id);
	}

}
