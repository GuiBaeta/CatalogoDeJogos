package br.com.gbaeta.catalogojogos.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Jogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String genero;

	@Enumerated(EnumType.STRING)
	private Plataforma plataforma;

	private LocalDate anoLancamento;
	private BigDecimal precoAtual;
	private String desenvolvedora;
	private BigDecimal precoMaisBaixoHistorico;
	private Long appIdSteam;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

	public LocalDate getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(LocalDate anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public BigDecimal getPrecoAtual() {
		return precoAtual;
	}

	public void setPrecoAtual(BigDecimal precoAtual) {
		this.precoAtual = precoAtual;
	}

	public String getDesenvolvedora() {
		return desenvolvedora;
	}

	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}

	public BigDecimal getPrecoMaisBaixoHistorico() {
		return precoMaisBaixoHistorico;
	}

	public void setPrecoMaisBaixoHistorico(BigDecimal precoMaisBaixoHistorico) {
		this.precoMaisBaixoHistorico = precoMaisBaixoHistorico;
	}

	public Long getAppIdSteam() {
		return appIdSteam;
	}

	public void setAppIdSteam(Long appIdSteam) {
		this.appIdSteam = appIdSteam;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
