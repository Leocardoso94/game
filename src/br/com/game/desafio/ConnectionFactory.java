package br.com.game.desafio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			return DriverManager.getConnection(
					"jdbc:mysql://104.154.196.175/fj21?useUnicode=true&characterEncoding=UTF-8", "root", "");
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}

//104.154.196.175
