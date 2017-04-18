package br.com.game.desafio.modelo;

public class Tarefa {
	private Long id;
	private boolean situacao;
	private String resolvida;
	private boolean dica;
	private String resposta;
	private String pergunta;

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

	public String getResolvida() {
		return resolvida;
	}

	public void setResolvida(String resolvida) {
		this.resolvida = resolvida;
	}

	public boolean isDica() {
		return dica;
	}

	public void setDica(boolean dica) {
		this.dica = dica;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

}
