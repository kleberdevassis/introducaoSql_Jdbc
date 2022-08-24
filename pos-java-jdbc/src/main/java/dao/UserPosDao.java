package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
			insert.setLong(1, userposjava.getId());
			insert.setString(2, userposjava.getNome());
			insert.setString(3, userposjava.getEmail());
			insert.execute();
			connection.commit(); // salva no banco
		} catch (SQLException e) {
		     try {
				connection.rollback(); // reverte a operação
			} catch (SQLException e1) {
		
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
	public List<Userposjava> listar() throws Exception{
		List<Userposjava> list = new ArrayList<>();
		
		String sql = "select * from userposjava";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		ResultSet resultado = statement.executeQuery();
		
		while(resultado.next()) {
			Userposjava userposjava = new Userposjava();
			userposjava.setId(resultado.getLong("id"));
			userposjava.setNome(resultado.getString("nome"));
			userposjava.setEmail(resultado.getString("email"));
			
			list.add(userposjava);
		}
		
		return list;
	}
	
	

}
