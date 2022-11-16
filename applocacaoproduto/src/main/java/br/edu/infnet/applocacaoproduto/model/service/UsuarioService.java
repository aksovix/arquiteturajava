package br.edu.infnet.applocacaoproduto.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.applocacaoproduto.clients.UsuarioClient;
import br.edu.infnet.applocacaoproduto.model.domain.Usuario;
import br.edu.infnet.applocacaoproduto.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioClient usuarioClient;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void incluir(Usuario usuario) {
		usuarioClient.incluir(usuario);
//		usuarioRepository.save(usuario);
	}
	
	public void excluir(Integer id) {
		usuarioClient.excluir(id);
//		usuarioRepository.deleteById(id);
	}
	
	public Collection<Usuario> obterLista() {
		return usuarioClient.obterLista();
//		return (Collection<Usuario>) usuarioRepository.findAll();
	}
	
	public Usuario validar(String email, String senha) {
		return usuarioClient.validar(email, senha);
//		Usuario usuario = usuarioRepository.findByEmail(email);
//		
//		if(usuario != null && senha.equals(usuario.getSenha())) {
//			return usuario;
//		}
//		
//		return null;
	}
}
