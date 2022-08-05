package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import ConexaoJdbc.SingleConnection;

public class TesteBancoJdbc {
	
	
	@Test
	public void initBanco() {
		SingleConnection.getConnection();
	}

}
