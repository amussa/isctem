package mz.co.empresa;

import java.util.Date;

public class Nota {
	
	private String texto;
	private Date dataCriacao;
	
	public Nota(String texto) {
		this.texto = texto;
		this.dataCriacao = new Date();
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
}
