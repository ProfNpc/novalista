package com.cit.novalista.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mapa")
public class MapaController {

	@GetMapping("/")
	public String mapa() {
		return "mapa";
	}
}
