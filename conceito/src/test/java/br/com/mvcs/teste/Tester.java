package br.com.mvcs.teste;

import java.util.List;

import org.hibernate.Session;

import br.com.mvcs.model.Cliente;
import br.com.mvcs.persistance.ClienteDAO;
import br.com.mvcs.persistance.HibernateUtil;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        Cliente cliente = new Cliente();
 
//        cliente.setRazaoSocial("Eireli etc 222");
//        cliente.setRazaoSocial("Venda do João");
        cliente.setCpfCnpj("364.350.128-57");
//        cliente.setContato("(11) 971312661");
//        cliente.setStatus("Ativo");
//  
//        ClienteDAO.createCliente(cliente);
        
        List<Cliente> lista=  ClienteDAO.readCliente(cliente);
//        
//        
        for(Cliente cli :lista) {
        	System.out.println(cli.getId());
        	System.out.println(cli.getRazaoSocial());
        }
 
	}

}
