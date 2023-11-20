package com.example.demo.dto;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table (name = "cajeros")
public class Cajero {
	
	@Id
	private int id;
	private String nom_apels;
	
	@OneToMany
    @JoinColumn(name="id_cajero")
	private List<Venta> venta;
	
	  public Cajero() {
	    }
	  
	    public Cajero(int id, String nom_apels, List<Venta> venta) {
	    	this.id = id;
	    	this.nom_apels = nom_apels;
	        this.venta = venta;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNom_apels() {
			return nom_apels;
		}

		public void setNom_apels(String nom_apels) {
			this.nom_apels = nom_apels;
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