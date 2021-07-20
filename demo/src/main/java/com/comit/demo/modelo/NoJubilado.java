package com.comit.demo.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity 
@DiscriminatorValue ("NO_JUBILADO")
public class NoJubilado extends Beneficiario implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;
	
	private Integer edad;
	private String genero;
	private Integer cantHijos;
	private BigDecimal ingresos;
	private String ocupacion;
	private String movilidad;
	
	private List<Contacto> contactos;
	public NoJubilado() {}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(Integer cantHijos) {
		this.cantHijos = cantHijos;
	}

	public BigDecimal getIngresos() {
		return ingresos;
	}

	public void setIngresos(BigDecimal ingresos) {
		this.ingresos = ingresos;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getMovilidad() {
		return movilidad;
	}

	public void setMovilidad(String movilidad) {
		this.movilidad = movilidad;
	}
	

}
