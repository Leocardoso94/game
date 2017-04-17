package br.com.game.desafio.modelo;

import java.util.Calendar;

public class Tarefa {
	private Long id;
	private boolean situacao;
	private Calendar resolvida;
	private boolean dica;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public Calendar getResolvida() {
		return resolvida;
	}
	public void setResolvida(Calendar resolvida) {
		this.resolvida = resolvida;
	}
	public boolean isDica() {
		return dica;
	}
	public void setDica(boolean dica) {
		this.dica = dica;
	}


}
