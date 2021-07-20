package com.comit.demo.modelo;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Usuario implements Serializable  {	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;

}
