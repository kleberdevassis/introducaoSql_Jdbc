package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ConexaoJdbc.SingleConnection;
import model.UserPosJava;

public class UserPosDao {
	
	private Connection connection;
	
	public UserPosDao() {
		
		connection = SingleConnection.getConnection();
	}
	
	public void salvar (UserPosJava userposjava) {
		String sql = "insert into userposjava (id, nome, email) values (?,?,?)";
		try {
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setLong(1, 3);
			insert.setString(2, "Egidio salvar Dao");
			insert.setString(3, "Egidio@gmail.com");
			insert.execute();
			connection.commit(); // salva no banco
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
