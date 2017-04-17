package br.com.game.mvc.logica;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.game.desafio.dao.TarefaDao;
import br.com.game.desafio.modelo.Tarefa;

public class AlteraTarefaLogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Tarefa tarefa = new Tarefa();
		tarefa.setNome(req.getParameter("nome"));
		tarefa.setId(Long.parseLong(req.getParameter("id")));
		tarefa.setEmail(req.getParameter("email"));
		tarefa.setEndereco(req.getParameter("endereco"));
		Calendar dataNascimento = null;
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter("dataNascimento"));
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
		} catch (ParseException e) {
			System.out.println("Erro de conversão da data");
		}
		tarefa.setDataNascimento(dataNascimento);
		Connection connection = (Connection) req.getAttribute("conexao");

		TarefaDao tarefaDao = new TarefaDao(connection);

		tarefaDao.altera(tarefa);
		return "mvc?logica=ListatarefasLogic";
	}

}
