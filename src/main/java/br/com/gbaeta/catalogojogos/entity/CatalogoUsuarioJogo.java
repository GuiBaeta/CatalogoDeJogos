package br.com.gbaeta.catalogojogos.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CatalogoUsuarioJogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Usuario usuario;
	
	@ManyToOne
	private Jogo jogo;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	private Integer notaPessoal;
	private LocalDate dataCompra;
	private BigDecimal precoPago;
	
	public Long getId() {
		return id;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Jogo getJogo() {
		return jogo;
	}
	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Integer getNotaPessoal() {
		return notaPessoal;
	}
	public void setNotaPessoal(Integer notaPessoal) {
		this.notaPessoal = notaPessoal;
	}
	public LocalDate getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}
	public BigDecimal getPrecoPago() {
		return precoPago;
	}
	public void setPrecoPago(BigDecimal precoPago) {
		this.precoPago = precoPago;
	}
	
	

}
