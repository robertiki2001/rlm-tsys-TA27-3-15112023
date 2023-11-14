package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IVentaDAO;
import com.example.demo.dto.Venta;

@Service
public class VentaService implements IVentaService{
	
	@Autowired
	IVentaDAO iVentaDAO;

		//Listar todos
		public List<Venta> listarVentas(){
			return iVentaDAO.findAll();
		};
		
		//Listar por id
		public Venta ventaXID(Integer id) {
			return iVentaDAO.findById(id).get();
		}; 
		
		//Guardar
		public Venta guardarVenta(Venta venta) {
			return iVentaDAO.save(venta);
		};
		
		//Actualizar
		public Venta actualizarVenta(Venta venta) {
			return iVentaDAO.save(venta);
		};
		
		//Eliminar
		public void eliminarVenta(Integer id) {
			iVentaDAO.deleteById(id);
		}	

}