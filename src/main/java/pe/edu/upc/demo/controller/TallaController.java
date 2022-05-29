package pe.edu.upc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.demo.serviceinterface.ITallaService;

@Controller
@RequestMapping("/tallas")
public class TallaController {

	@Autowired
	private ITallaService tService;

	@GetMapping("/listar")
	public String listTalla(Model model) {
		try {
			model.addAttribute("listaTallas", tService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}

		return "/Empresa/ListaEmpresa";
	}
}
