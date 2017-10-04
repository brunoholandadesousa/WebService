package br.com.webservice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.webservice.factory.ConnectionFactory;
import br.com.webservice.model.Cliente;

public class ClienteDAO extends ConnectionFactory {

	private static ClienteDAO instance = new ClienteDAO();;

	// Método responsável por criar uma instancia da classe ClienteDAO (Singleton)

	public static ClienteDAO getInstance() { 
		return instance;
	}

	// Método responsável por listar todos os clientes do banco

	public ArrayList<Cliente> listarTodos() {
		Connection conexao = null;		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<Cliente> clientes = null;

		conexao = getConnection();
		
		clientes = new ArrayList<Cliente>();
		try {
			pstmt = conexao.prepareStatement("SELECT * FROM dados");
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Cliente cliente = new Cliente();

				cliente.setId(rs.getInt("id"));
				cliente.setLatatitude(rs.getDouble("latitude"));
				cliente.setLongitude(rs.getDouble("longitude"));
				cliente.setData(rs.getString("data"));

				clientes.add(cliente);
			}

		} catch (Exception e) {
			System.out.println("Erro ao listar todos os clientes: " + e);
			e.printStackTrace();
		} finally {
			
			try {
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return clientes;
	}
	
	public void add(Cliente cliente) {
		Connection conexao = null;	
		conexao = getConnection();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conexao.prepareStatement("INSERT INTO dados (latitude,longitude, data) VALUES (?,?,?)"); 
			
			pstmt.setDouble(1, cliente.getLatatitude());
			pstmt.setDouble(2, cliente.getLongitude());
			pstmt.setString(3, cliente.getData());
			pstmt.execute();
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("Erro ao adicionar: " + e);
			e.printStackTrace();
			
		} finally {
			
			try {
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	


}

