package com.NinjaWorld.Naruto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Personage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String aldea;
    private int nivelDePoder;
    private String url_imagen;
    
        
	public Personage() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAldea() {
		return aldea;
	}
	public void setAldea(String raza) {
		this.aldea = raza;
	}
	public int getNivelDePoder() {
		return nivelDePoder;
	}
	public void setNivelDePoder(int nivelDePoder) {
		this.nivelDePoder = nivelDePoder;
	}

	public String getUrl_imagen() {
		return url_imagen;
	}

	public void setUrl_imagen(String url_imagen) {
		this.url_imagen = url_imagen;
	}
	

}
