import java.sql.Connection;

import br.com.game.desafio.ConnectionFactory;
import br.com.game.desafio.dao.TarefaDao;

public class Teste {

	public static void main(String[] args) {
		Connection con = new ConnectionFactory().getConnection();
		TarefaDao dao = new TarefaDao(con);
		
		dao.proxima((long) 2);

	}

}
