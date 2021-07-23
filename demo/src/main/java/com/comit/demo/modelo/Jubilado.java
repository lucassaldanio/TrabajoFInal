package com.comit.demo.modelo;

import java.io.Serializable;

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
@DiscriminatorValue ("JUBILADO")
public class Jubilado extends Beneficiario implements Serializable  {	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;
	private Integer documento;
	private Integer celular;
	private String  email;
	
	
	public Jubilado(Integer documento, Integer celular, String email) {
		super();
		this.documento = documento;
		this.celular = celular;
		this.email = email;
	}
	


}
