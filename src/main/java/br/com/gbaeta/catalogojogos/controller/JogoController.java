package br.com.gbaeta.catalogojogos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gbaeta.catalogojogos.entity.Jogo;
import br.com.gbaeta.catalogojogos.repository.JogoRepository;
import br.com.gbaeta.catalogojogos.service.JogoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/jogos")
public class JogoController {

	@Autowired
	private JogoService service;
	
	@Autowired
	private JogoRepository jogoRepository;

	@PostMapping
	public ResponseEntity<Jogo> cadastrar(@RequestBody Jogo jogo) {
		return ResponseEntity.ok(service.salvar(jogo));
	}

	public ResponseEntity<List<Jogo>> listar() {
		return ResponseEntity.ok(service.listarTodos());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Jogo> buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("/{id}")
	public ResponseEntity<Jogo> atualizar(@PathVariable Long id, @RequestBody Jogo jogo) {
		try {
			return ResponseEntity.ok(service.atualizar(id, jogo));
		} catch (RuntimeException e) {
			return ResponseEntity.noContent().build();
		}
	}

	@GetMapping
	public List<Jogo> listarTodos() {
		return jogoRepository.findAll();
	}
	
	@PutMapping("/atualizar-precos-steam")
	public ResponseEntity<String> atualizarPrecosSteam() {
		try {
			service.atualizarPrecosSteam();
			return ResponseEntity.ok("Preços atualizados com sucesso.");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(500).body("Erro ao atualizar os preços.");
		}
	}
}
