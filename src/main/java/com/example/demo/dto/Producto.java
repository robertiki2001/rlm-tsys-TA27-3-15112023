package com.example.demo.dto;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table (name = "productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private int precio;
	
	@OneToMany
    @JoinColumn(name="id_producto")
	private List<Venta> venta;
	
	  public Producto() {
	    }
	  
	    public Producto(int id, String nombre, int precio, List<Venta> venta) {
	    	this.id = id;
	    	this.nombre = nombre;
	        this.precio = precio;	 
	        this.venta = venta;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getPrecio() {
			return precio;
		}

		public void setPrecio(int precio) {
			this.precio = precio;
		}
		
		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
		public List<Venta> getVenta() {
			return venta;
		}

		public void setVenta(List<Venta> venta) {
			this.venta = venta;
		}
}