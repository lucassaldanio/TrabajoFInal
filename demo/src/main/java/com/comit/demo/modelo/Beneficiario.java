package com.comit.demo.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Beneficiario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;
	
	
	
	public Beneficiario() {
		// TODO Auto-generated constructor stub
	}
	public Short getId() {
		return id;
	}
}
