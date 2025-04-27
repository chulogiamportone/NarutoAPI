package com.NinjaWorld.Naruto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Clan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String kekkei_genkai;
    
	public Clan() {
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
	public String getKekkei_genkai() {
		return kekkei_genkai;
	}
	public void setKekkei_genkai(String kekkei_genkai) {
		this.kekkei_genkai = kekkei_genkai;
	}
    


}
