package com.example.demo.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String username;

	private String password;

	private String role;
	
	@OneToMany
	@JoinColumn(name = "id_usuario")
	@JsonIgnore
	private List<Game> game;
	
	@OneToMany
	@JoinColumn(name = "id_usuario")
	@JsonIgnore
	private List<Party> party;
	
	public Usuario() {
		super();
	}
	
	public Usuario(int id, String username, String password, String role, List<Game> game, List<Party> party) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.game = game;
		this.party = party;
	}



	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Game")
	public List<Game> getGame() {
		return game;
	}

	public void setGame(List<Game> game) {
		this.game = game;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Party")
	public List<Party> getParty() {
		return party;
	}

	public void setParty(List<Party> party) {
		this.party = party;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}