package com.comit.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comit.demo.modelo.NoJubilado;
import com.comit.demo.servicios.NoJubiladoService;

@Controller
@RequestMapping("/nojubilado")
public class NoJubiladoController { 
	
	private final NoJubiladoService nojubiladoService;
	
	@Autowired
	public NoJubiladoController (NoJubiladoService nojubiladoService) {
		this.nojubiladoService = nojubiladoService;
	}
	
	@GetMapping
	public String listar() {
		return "nojubilados";
	}
	
	
	@GetMapping("/crearnoJubilado")
	public String crear (@ModelAttribute(name = "nojubilado")NoJubilado nojubilado) {
		NoJubiladoService.guardar(nojubilado);
		return "redirect:/";
	}

}
}