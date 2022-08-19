package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ConexaoJdbc.SingleConnection;
import model.Userposjava;

public class UserPosDao {
	
	private Connection connection;
	
	public UserPosDao() {
	    connection = SingleConnection.getConnection();
	    
	   }
	
	public void salvar (Userposjava userposjava) {		
		try {
			String sql = "insert into userposjava(id, nome, email) values (?,?,?)";
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setLong(1, 6);
			insert.setString(2, "robson");
			insert.setString(3, "robson@gmail.com");
			insert.execute();
			connection.commit(); // salva no banco
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	

}
