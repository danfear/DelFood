package com.delfood.delfood.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.engine.AttributeName;
import com.delfood.delfood.Models.Plato;
import com.delfood.delfood.service.PlatoService;
import java.util.List;
import org.springframework.ui.Model;

@Controller
public class delfoodControler {

	public final PlatoService platoService;

	public delfoodControler(PlatoService platoService){
		this.platoService=platoService;
	}
	
	@RequestMapping("/platos")
	public String buscartodo(Model model){
		List<Plato> platos = platoService.buscartodos();
        model.addAttribute("Platos", platos);
		return "listado";
	}
}
