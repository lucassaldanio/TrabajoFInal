package com.comit.demo.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity 
@Getter
@Setter
@NoArgsConstructor

@DiscriminatorValue ("NO_JUBILADO")
public class NoJubilado extends Beneficiario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private Integer edad;
	private String genero;
	private Integer cantHijos;
	private String ocupacion;
	private BigDecimal ingresos;
	private String movilidad;
	@OneToMany
	private List<Contacto> contactos;
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public Long getNroSeguridad() {
		// TODO Auto-generated method stub
		return null;
	}

}
