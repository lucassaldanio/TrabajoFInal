package com.comit.demo.modelo;

import java.io.Serializable;
import java.util.Random;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public abstract class Beneficiario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Random RND = new Random();
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long celular;
	private String  email;
	private Long nroSeguridad = RND.nextLong();
	
	
	public Beneficiario() {
		
	}
	
	public Beneficiario(Long celular, String email) {
		this();	
		this.celular =  celular;
		this.email = email;
	}

	
}
