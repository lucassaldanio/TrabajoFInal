package com.comit.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
}
