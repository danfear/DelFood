package com.delfood.delfood.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class controler {
    @RequestMapping("")
	public String Inicio(Model modelo) {
		return "pagina";
	}  
    @RequestMapping("/domicilio")
	public String Domicilio(Model modelo) {
		return "pagina2";
	}  
    @RequestMapping("/confirmacion")
	public String Confirmacion(Model modelo) {
		return "pagina3";
	}  
}
