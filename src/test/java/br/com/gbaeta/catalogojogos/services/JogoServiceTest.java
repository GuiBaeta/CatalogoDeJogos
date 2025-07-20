package br.com.gbaeta.catalogojogos.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.gbaeta.catalogojogos.entity.Jogo;
import br.com.gbaeta.catalogojogos.repository.JogoRepository;
import br.com.gbaeta.catalogojogos.service.JogoService;

public class JogoServiceTest {

	@InjectMocks
	private JogoService jogoService;

	@Mock
	private JogoRepository jogoRepository;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void deveSalvarJogo() {
		Jogo jogo = new Jogo();
		jogo.setTitulo("Hollow Knight");
		when(jogoRepository.save(jogo)).thenReturn(jogo);
		Jogo salvo = jogoService.salvar(jogo);
		assertEquals("Hollow Knight", salvo.getTitulo());
	}

	@Test
	void deveAtualizarPrecoMaisBaixoSeMenor() {
		Jogo jogo = new Jogo();
		jogo.setId(1L);
		jogo.setPrecoAtual(new BigDecimal("50.00"));
		jogo.setPrecoMaisBaixoHistorico(new BigDecimal("45.00"));
		jogo.setTitulo("Celeste");

		Jogo novo = new Jogo();
		novo.setPrecoAtual(new BigDecimal("40.00"));

		when(jogoRepository.findById(1L)).thenReturn(Optional.of(jogo));
		when(jogoRepository.save(any(Jogo.class))).thenReturn(jogo);

		Jogo atualizado = jogoService.atualizar(1L, novo);
		assertEquals(new BigDecimal("40.00"), atualizado.getPrecoAtual());
	}

	@Test
	void naoAtualizaSeJogoNaoExiste() {
		when(jogoRepository.findById(99L)).thenReturn(Optional.empty());
		assertThrows(RuntimeException.class, () -> jogoService.atualizar(99L, new Jogo()));
	}
}
