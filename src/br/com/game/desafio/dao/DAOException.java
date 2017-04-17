package br.com.game.desafio.dao;

import java.sql.SQLException;

public class DAOException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DAOException(){
		super("Causa do Erro Desconhecida");
	}

	public DAOException(SQLException e) {
		super(e);
	}

}
