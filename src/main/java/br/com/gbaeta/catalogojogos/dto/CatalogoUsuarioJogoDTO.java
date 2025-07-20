package br.com.gbaeta.catalogojogos.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.gbaeta.catalogojogos.entity.Status;

public class CatalogoUsuarioJogoDTO {
	private Long idUsuario;
	private Long idJogo;
	private Status status;
	private Integer notaPessoal;
	private LocalDate dataCompra;
	private BigDecimal precoPago;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdJogo() {
		return idJogo;
	}

	public void setIdJogo(Long idJogo) {
		this.idJogo = idJogo;
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
