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
public class Jubilado extends Beneficiario  {
	private static final long serialVersionUID = 1L;
	private Integer documento;

	public Jubilado(Integer documento, Long celular, String email) {
		super(celular, email);
		this.documento = documento;
	}
	


}
