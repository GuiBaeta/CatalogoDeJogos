package br.com.gbaeta.catalogojogos.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gbaeta.catalogojogos.entity.Jogo;
import br.com.gbaeta.catalogojogos.repository.JogoRepository;

@Service
public class JogoService {

	@Autowired
	private JogoRepository repository;
	
	@Autowired
	private SteamApiService steamApiService;

	public Jogo salvar(Jogo jogo) {
		return repository.save(jogo);
	}

	public List<Jogo> listarTodos() {
		return repository.findAll();
	}

	public Optional<Jogo> buscarPorId(long id) {
		return repository.findById(id);
	}

	public void deletar(Long id) {
		repository.deleteById(id);
	}

	public Jogo atualizar(Long id, Jogo jogoAtualizado) {
		return repository.findById(id).map(jogo -> {
			jogo.setTitulo(jogoAtualizado.getTitulo());
			jogo.setPlataforma(jogoAtualizado.getPlataforma());
			jogo.setGenero(jogoAtualizado.getGenero());
			jogo.setAnoLancamento(jogoAtualizado.getAnoLancamento());
			jogo.setPrecoAtual(jogoAtualizado.getPrecoAtual());
			jogo.setDesenvolvedora(jogoAtualizado.getDesenvolvedora());
			return repository.save(jogo);
		}).orElseThrow(() -> new RuntimeException("Jogo não encontrado"));
	}

	public void atualizarPrecosSteam() {
		List<Jogo> jogos = repository.findAll();
		for (Jogo jogo : jogos) {
			if (jogo.getAppIdSteam() != null) {
				Optional<BigDecimal> precoSteam = steamApiService.buscarPrecoDoJogo(jogo.getAppIdSteam());

				if (precoSteam.isPresent()) {
					BigDecimal novoPreco = precoSteam.get();

					jogo.setPrecoAtual(novoPreco);

					BigDecimal precoHistorico = jogo.getPrecoMaisBaixoHistorico();
					if (precoHistorico == null || novoPreco.compareTo(precoHistorico) < 0) {
						jogo.setPrecoMaisBaixoHistorico(novoPreco);
					}

					repository.save(jogo);
				}
			}
		}
	}

}
