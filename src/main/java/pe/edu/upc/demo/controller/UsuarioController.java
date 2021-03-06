package pe.edu.upc.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.demo.entities.Usuario;
import pe.edu.upc.demo.serviceinterface.ICiudadService;
import pe.edu.upc.demo.serviceinterface.IUsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private IUsuarioService uService;
	@Autowired
	private ICiudadService cService;

	@GetMapping("/nuevo")
	public String newUsuario(Model model) {
		model.addAttribute("usuario", new Usuario());
		model.addAttribute("listaCiudades", cService.list());

		return "/usuario/frmRegistro";
	}

	@PostMapping("/guardar")
	public String saveUsuario(@Valid Usuario objUsuario, BindingResult binRes) {

		if (binRes.hasErrors()) {
			return "/usuario/frmRegistro";
		} else {
			uService.insert(objUsuario);
			return "redirect:/usuarios/nuevo";
		}
	}

	@GetMapping("/listar")
	public String listUsuario(Model model) {
		try {
			model.addAttribute("listaUsuarios", uService.list());

		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "/usuario/frmLista";
	}

}
