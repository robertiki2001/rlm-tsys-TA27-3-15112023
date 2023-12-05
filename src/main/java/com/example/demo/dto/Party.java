package com.example.demo.dto;

import javax.persistence.*;

@Entity
@Table(name = "parties")
public class Party {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "content")
	private String content;

	@Column(name = "registration_date")
	private String registration_date;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario user;

	public Party() {
	}

	public Party(int id, String content, String registration_date, Usuario user) {
		this.id = id;
		this.content = content;
		this.registration_date = registration_date;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(String registration_date) {
		this.registration_date = registration_date;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

}