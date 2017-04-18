package br.com.game.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.game.desafio.dao.TarefaDao;
import br.com.game.desafio.modelo.Tarefa;

public class CorrigeTarefa implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Tarefa tarefa = new Tarefa();
		Connection connection = (Connection) req.getAttribute("conexao");
		TarefaDao dao = new TarefaDao(connection);
		tarefa = dao.pesquisar((int) Long.parseLong(req.getParameter("id")));
		String resposta = req.getParameter("resposta");		
		resposta = resposta.toLowerCase().trim();
		if(resposta.equals(tarefa.getResposta())){
			dao.proxima(tarefa.getId()+1);
			return "Resposta Correta!";
		}
		return "Tá errado!";
	}

}
