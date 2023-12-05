package com.example.demo.dto;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "registration_date")
	private String registration_date;

	@Column(name = "state")
	private String state;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario user;

	@ManyToOne
	@JoinColumn(name = "id_videogame")
	private Videogame videogame;

	public Game() {
	}

	public Game(int id, String registration_date, String state, Usuario user, Videogame videogame) {
		this.id = id;
		this.registration_date = registration_date;
		this.state = state;
		this.user = user;
		this.videogame = videogame;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(String registration_date) {
		this.registration_date = registration_date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public Videogame getVideogame() {
		return videogame;
	}

	public void setVideogame(Videogame videogame) {
		this.videogame = videogame;
	}
	
	

}