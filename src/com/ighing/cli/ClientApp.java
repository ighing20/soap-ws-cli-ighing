package com.ighing.cli;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.ighing.service.Cliente;
import com.ighing.service.ClienteService;

public class ClientApp {
	public static void main(String[] args) throws Exception {
		URL wsdlUrl = new URL("http://localhost:9090/soap-ws-ighing/cliente-service?wsdl");
		QName qname = new QName("http://service.ighing.com/", "ClienteService");
		Service service = Service.create(wsdlUrl, qname);
		ClienteService clienteWS = service.getPort(ClienteService.class);

		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNombre("Ricardo");
		cliente.setDireccion("Lima");
		cliente.setTelefono("8887777");

		String resulatdo = clienteWS.crearCliente(cliente);

		System.out.println(resulatdo);
		
		List<Cliente> clientes = clienteWS.consultarCliente();
		
		clientes.forEach(System.out::println);

	}
}