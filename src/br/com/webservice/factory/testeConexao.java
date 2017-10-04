package br.com.webservice.factory;

public class testeConexao {

	public static void main(String[] args) {
		ConnectionFactory.getConnection();
		System.out.println(ConnectionFactory.status);

	}

}
