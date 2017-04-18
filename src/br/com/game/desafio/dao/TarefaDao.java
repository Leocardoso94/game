package br.com.game.desafio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.game.desafio.modelo.Tarefa;

public class TarefaDao {
	private Connection connection;

	public TarefaDao(Connection connection) {
		this.connection = connection;
	}

	public Tarefa pesquisar(int id) {
		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from desafios where id = ?");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			Tarefa t = new Tarefa();
			while (rs.next()) {
				t.setId(rs.getLong("id"));
				t.setSituacao(rs.getBoolean("situacao"));
				t.setDica(rs.getBoolean("dica"));
				t.setResposta(rs.getString("resposta"));
				t.setPergunta(rs.getString("pergunta"));
			}
			rs.close();
			stmt.close();
			return t;
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}

	public List<Tarefa> getLista() {
		try {
			List<Tarefa> tarefas = new ArrayList<Tarefa>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from desafios");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Tarefa t = new Tarefa();
				t.setId(rs.getLong("id"));
				t.setSituacao(rs.getBoolean("situacao"));
				t.setDica(rs.getBoolean("dica"));
				t.setPergunta(rs.getString("pergunta"));
				t.setResposta(rs.getString("resposta"));
				t.setResolvida(rs.getString("resolvida"));
				tarefas.add(t);
			}
			rs.close();
			stmt.close();
			return tarefas;
		} catch (SQLException e) {
			throw new DAOException(e);
		}

	}

	public void proxima(Long id) {
		String sql = "update desafios set situacao=? where id=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setBoolean(1, true);
			stmt.setLong(2, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		sql = "update desafios set resolvida = NOW() where id=" + (id - 1);
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
