package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import ConexaoJdbc.SingleConnection;
import dao.UserPosDao;
import model.UserPosJava;

public class TesteBancoJdbc {
	
	
	@Test
	public void initBanco() {
		UserPosDao userPosDao = new UserPosDao();
		UserPosJava userPosJava = new UserPosJava();
		
		
		userPosDao.salvar(userPosJava);
	}

}
