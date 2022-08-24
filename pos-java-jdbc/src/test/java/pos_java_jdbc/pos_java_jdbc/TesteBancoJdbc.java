package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.Test;

import ConexaoJdbc.SingleConnection;
import dao.UserPosDao;
import model.Userposjava;

public class TesteBancoJdbc {

	@Test
	public void initBanco() {
		UserPosDao userPosDao = new UserPosDao();
		Userposjava userposjava = new Userposjava();

		userposjava.setId(8L);
		userposjava.setNome("Eduardo");
		userposjava.setEmail("eduardo@gmail.com");

		userPosDao.salvar(userposjava);

	}

	@Test
	public void initListar() {
		UserPosDao dao = new UserPosDao();
		try {
			List<Userposjava> list = dao.listar();

			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("-------------------------");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
