package br.com.mvcs.teste;

import org.hibernate.Session;

import br.com.mvcs.model.Cliente;
import br.com.mvcs.persistance.HibernateUtil;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
        session.beginTransaction();
        Cliente cliente = new Cliente();
 
        cliente.setRazaoSocial("Eireli etc abc");
        cliente.setRazaoSocial("Venda do Zé");
        cliente.setCpfCnpj("364.350.128-57");
        cliente.setContato("(11) 971312661");
        cliente.setStatus("Ativo");
  
 
        session.save(cliente);
        session.getTransaction().commit();
 
	}

}
