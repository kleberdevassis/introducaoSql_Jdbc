package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import ConexaoJdbc.SingleConnection;
import dao.UserPosDao;
import model.Userposjava;

public class TesteBancoJdbc{
	
	
	@Test
	public void initBanco() {
		UserPosDao userPosDao = new UserPosDao();
		Userposjava userposjava = new Userposjava();
		
		userPosDao.salvar(userposjava);
		
	}

}
