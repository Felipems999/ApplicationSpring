package com.felipe.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.felipe.application.model.Usuario;
import com.felipe.application.repository.UsuariosRepository;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

	@Autowired
	private UsuariosRepository usuarios;

	@GetMapping
	public ModelAndView listarUsuarios() {
		ModelAndView modeView = new ModelAndView("ListaUsuariosView");

		modeView.addObject("usuarios", usuarios.findAll());
		modeView.addObject(new Usuario());

		return modeView;
	}

	@PostMapping
	public String salvar(Usuario usuario) {
		this.usuarios.save(usuario);
		return "redirect:/usuarios";
	}

}
