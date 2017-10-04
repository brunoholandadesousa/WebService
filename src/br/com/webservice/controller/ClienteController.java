package br.com.webservice.controller;

import java.util.ArrayList;

import javax.ws.rs.PathParam;

import br.com.webservice.dao.ClienteDAO;
import br.com.webservice.model.Cliente;

//Classe responsável por ser o controlador entre o resource e a camada DAO
public class ClienteController {

	public ArrayList<Cliente> listarTodos() {
		System.out.println("passou ClienteController ArrayList");
		return ClienteDAO.getInstance().listarTodos();
	}
/*	public Cliente add() {
		System.out.println("passou ClienteController add");
		return ClienteDAO.getInstance().add(Cliente cliente);
	}
	*/


	
	
	
	

}