package br.ufsc.hu.jcontatooh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String index() {
		System.out.println("Teste do index");
		return "home";
	}
}
