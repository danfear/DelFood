package com.delfood.delfood.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.thymeleaf.engine.AttributeName;
import com.delfood.delfood.Models.Plato;
import com.delfood.delfood.Models.Domicilio;
//import com.delfood.delfood.repository.DomicilioRepository;
import com.delfood.delfood.service.DomicilioService;
import com.delfood.delfood.service.PlatoService;
import java.util.List;
//import org.springframework.ui.Model;

@Controller
public class delfoodControler {

	public final PlatoService platoService;
	public final DomicilioService domicilioService;

	public delfoodControler(PlatoService platoService , DomicilioService domicilioservice){
		this.platoService=platoService;
		this.domicilioService=domicilioservice;
	}
	
	@RequestMapping("/platos")
	public String buscartodo(Model model){
		List<Plato> platos = platoService.buscartodos();
		Domicilio domicilio = new Domicilio();
		model.addAttribute("Domicilio",domicilio);
        model.addAttribute("Platos", platos);
		return "listado";
	}
	@RequestMapping("/domicilio/{Id}")
	public String Domicilio(@PathVariable Long Id,Domicilio domicilio,Model model){
		Domicilio domicilio2=domicilioService.crearDomicilio(Id, domicilio); 
		model.addAttribute("Domicilio",domicilio2);
		return "pagina2";
	}
	@RequestMapping("/confirmacion/{Id}")
	public String Confirmacion(@PathVariable Long Id,Domicilio domicilio,Model model){
		Domicilio domilioguar=domicilioService.guardarDomicilio(Id, domicilio);
		model.addAttribute("Domicilio",domilioguar);
		return "pagina3";
	}

}