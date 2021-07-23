package com.comit.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comit.demo.modelo.Jubilado;
import com.comit.servicios.JubiladoService;

@Controller
@RequestMapping("/jubilado")
public class JubiladoController { 
	
	private final JubiladoService jubiladoService;
	
	@Autowired
	public JubiladoController (JubiladoService jubiladoService) {
		this.jubiladoService = jubiladoService;
	}
	
	
	@GetMapping("/crearJubilado")
	public String crear (@ModelAttribute(name = "jubilado")Jubilado jubilado) {
		jubiladoService.guardar(jubilado);
		return "redirect:/";
	}

}
