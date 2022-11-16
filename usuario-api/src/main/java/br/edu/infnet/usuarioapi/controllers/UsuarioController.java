package br.edu.infnet.usuarioapi.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.usuarioapi.model.domain.Usuario;
import br.edu.infnet.usuarioapi.model.service.UsuarioService;


@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Usuario usuario) {
		usuarioService.incluir(usuario);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		usuarioService.excluir(id);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Usuario> obterLista(){
		return usuarioService.obterLista();
	}
	
	@PostMapping(value = "/validar")
	public Usuario validar(@RequestParam String email, @RequestParam String senha) {
		return usuarioService.validar(email, senha);
	}
}