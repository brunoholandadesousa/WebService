package br.com.webservice.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.com.webservice.controller.ClienteController;
import br.com.webservice.dao.ClienteDAO;
import br.com.webservice.model.Cliente;


@Path("/cliente")
public class ClienteResource {
	// Método responsável por fazer chamada ao controller

	@GET	
	@Path("/listarTodos")
	@Produces(MediaType.APPLICATION_JSON)	
	public ArrayList<Cliente> listarTodos() {
		ArrayList<Cliente> list = new ClienteController().listarTodos();		
		return list;
	}		
	
	
	/**	**/
	@GET
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public void cliente (@QueryParam(value = "longitude") double longitude,@QueryParam(value = "latatitude")double latatitude, @QueryParam(value = "data") String data) {		
		
		Cliente cliente = new Cliente ( longitude, latatitude, data);
		ClienteDAO clienteDao = new ClienteDAO();		
		clienteDao.add(cliente);	
		System.out.println("Salvo com sucesso: "+latatitude +""+latatitude+""+data);
		

	}

	
	
}