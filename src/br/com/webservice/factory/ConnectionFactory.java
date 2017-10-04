package br.com.webservice.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	// Caminho do banco de dados.
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/WebService";
	private static final String USUARIO = "postgres";
	private static final String SENHA = "335789";
	static String status="";
	// Método responsável por criar uma conexao com o banco

	 
	    
	    public static Connection getConnection(){
	    	 Connection conn = null;
	    	
	    	 
	    	 try {
				Class.forName("org.postgresql.Driver").newInstance();
				String url = "jdbc:postgresql://localhost:5432/WebService";
				conn = (Connection) DriverManager.getConnection(url,"postgres","335789");
				status = "Connection opened";
			} catch (SQLException e) {
				// TODO: handle exception
				status = e.getMessage();
			}catch (ClassNotFoundException e){
				status = e.getMessage();
			}catch (Exception e) {
				// TODO: handle exception
				status = e.getMessage();				
			}
	    	 return conn;
	    }
}
