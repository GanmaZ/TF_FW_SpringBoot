package pe.edu.upc.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.demo.entities.Marca;
import pe.edu.upc.demo.serviceinterface.IMarcaService;

@Controller
@RequestMapping("/marcas")
public class MarcaController {
	@Autowired
	private IMarcaService marService;

	@GetMapping("/nuevo")
	public String newMarca(Model model) {
		model.addAttribute("m", new Marca());
		return "marca/frmRegistro";
	}

	@PostMapping("/guardar")
	public String saveMarca(@Valid Marca mar, BindingResult binRes, Model model) {
		if (binRes.hasErrors()) {
			return "marca/frmRegistro";
		} else {
			marService.Insert(mar);
			model.addAttribute("mensaje", "Se registro correctamente!!");
			return "redirect:/marcas/nuevo";
		}
	}

	@GetMapping("/listar")
	public String listMarca(Model model) {
		try {
			model.addAttribute("listaMarcas", marService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "/marca/frmLista";
	}

}
