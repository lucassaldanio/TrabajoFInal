package com.comit.demo.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue ("JUBILADO")
public class Jubilado extends Beneficiario {

}
