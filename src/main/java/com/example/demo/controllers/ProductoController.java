package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Producto;
import com.example.demo.services.ProductoService;

@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	 ProductoService productoService;

	@GetMapping("/productos")
	public List<Producto> listarProductos() {
		return productoService.listarProductos();
	}

	@GetMapping("/producto/{id}")
	public Producto productoXID(@PathVariable(name = "id") Integer id) {
		return productoService.productoXID(id);
	}

	@PostMapping("/producto")
	public Producto guardarProducto(@RequestBody Producto producto) {
		return productoService.guardarProducto(producto);
	}

	@PutMapping("/producto/{id}")
	public Producto actualizarProducto(@PathVariable(name = "id") Integer id, @RequestBody Producto producto) {

		Producto producto_seleccionado = productoService.productoXID(id);
		Producto producto_actualizado = new Producto();

		producto_seleccionado.setNombre(producto.getNombre());

		producto_actualizado = productoService.actualizarProducto(producto_seleccionado);

		return producto_actualizado;
	}

	@DeleteMapping("/cajero/{id}")
	public void eliminarProducto(@PathVariable Integer id) {
		productoService.eliminarProducto(id);
	}

}
