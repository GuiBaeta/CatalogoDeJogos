package br.com.gbaeta.catalogojogos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gbaeta.catalogojogos.entity.Usuario;
import br.com.gbaeta.catalogojogos.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	private final UsuarioRepository repository;

	public UsuarioController(UsuarioRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping
	public Usuario salvar(@RequestBody Usuario u) {
		return repository.save(u);
	}
	
	@GetMapping
	public List<Usuario> listar() {
		return repository.findAll();
	}

}
