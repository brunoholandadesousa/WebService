package br.com.webservice.resource;

import java.util.ArrayList;

import br.com.webservice.dao.ClienteDAO;
import br.com.webservice.model.Cliente;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Cliente>lista = new ArrayList<>();
		
		ClienteDAO dao = new ClienteDAO();
		
		lista = dao.listarTodos();
		
		for(int i = 0;i>lista.size();i++) {
			System.out.println(lista.get(i).getId() + " " + lista.get(i).getLatatitude());
		}
	}

}
