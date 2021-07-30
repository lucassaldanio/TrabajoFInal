package com.comit.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.comit.demo.modelo.NoJubilado;

@Controller
@RequestMapping
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping(path = "/quienessomos")
	public String quienesSomos() {
		return "quienesSomos";
	}

	@GetMapping("/noticias")
	public String noticias() {
		return "noticiaspf";
	}
	
	@GetMapping("/contacto")
	public String contacto() {
		return "contactoTF";
	}
	
	@GetMapping("/jubilados")
	public String jubilado() {
		return "jubilados";
	}

	@GetMapping("/noJubiladoForm")
	public String noJubilado(Model model) {
		model.addAttribute("noJubilado", new NoJubilado());
		return "noJubiladoForm";}
		
	@GetMapping("/jubiladoFormulario")
	public String jubiladoFormulario() {
		return "jubiladoFormulario";	
	
	
	}
	
	
	
	
}
