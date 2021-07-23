package com.comit.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comit.demo.modelo.Jubilado;

@Controller
@RequestMapping("/jubilado")
public class JubiladoController { 
	public String crear (@ModelAttribute(name = "jubilado")Jubilado jubilado) {
		return "redirect:/";
	}

}
