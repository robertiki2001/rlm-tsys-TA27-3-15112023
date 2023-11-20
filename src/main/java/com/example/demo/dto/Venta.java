package com.example.demo.dto;

import javax.persistence.*;

@Entity
@Table (name = "venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_cajero")
	private Cajero cajero;

	@ManyToOne
	@JoinColumn(name="id_maquina_registradora ")
	private MaquinaRegistradora maquinaRegistradora;
	
	@ManyToOne
	@JoinColumn(name="id_producto ")
	private Producto producto;
	
	  public Venta() {
	    }
	  
	    public Venta(int id, Cajero cajero, MaquinaRegistradora maquinaRegistradora,Producto producto) {
	    	this.id = id;
	        this.cajero = cajero;
	        this.maquinaRegistradora = maquinaRegistradora;
	        this.producto = producto;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Cajero getCajero() {
			return cajero;
		}

		public void setCajero(Cajero cajero) {
			this.cajero = cajero;
		}

		public MaquinaRegistradora getMaquinaRegistradora() {
			return maquinaRegistradora;
		}

		public void setMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
			this.maquinaRegistradora = maquinaRegistradora;
		}

		public Producto getProducto() {
			return producto;
		}

		public void setProducto(Producto producto) {
			this.producto = producto;
		}

	   
}