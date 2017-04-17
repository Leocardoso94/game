package br.com.game.mvc.logica;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.game.desafio.dao.TarefaDao;
import br.com.game.desafio.modelo.Tarefa;

public class ListaTarefa implements Logica {
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Connection connection = (Connection) req.getAttribute("conexao");

		List<Tarefa> tarefas = new TarefaDao(connection).getLista();
		req.setAttribute("tarefas", tarefas);
		return "/WEB-INF/jsp/index.jsp";
	}
}
