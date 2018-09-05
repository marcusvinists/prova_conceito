package br.com.mvcs.persistance;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.mvcs.model.Cliente;

public class ClienteDAO {
	
	public static void createCliente(Cliente cliente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(cliente);
	        session.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
			 session.getTransaction().rollback();
		}finally {
			session.close();
		}
	}
	
	
	public static List<Cliente> readCliente(Cliente cliente) {
		List<Cliente> clientes = new ArrayList<Cliente>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Query<Cliente> query = null;
			if (cliente.getId() > 0) {
				query = session.createQuery("from cliente  where id = :id ");
				query.setParameter("id",cliente.getId());
				
			}else if(cliente.getRazaoSocial() != null && !cliente.getRazaoSocial().isEmpty()) {
				query = session.createQuery("from cliente  where razao_social = :rz ");
				query.setParameter("rz",cliente.getRazaoSocial());
				
			}else if(cliente.getCpfCnpj() != null && !cliente.getCpfCnpj().isEmpty()) {				
				query = session.createQuery("from cliente  where cnpj_cpf = :cnp ");
				query.setParameter("cnp",cliente.getCpfCnpj());
			}
			
			if(query != null) {
				List<Cliente> list = query.list();
				clientes = (List<Cliente>)list;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}

		return clientes;
	}

}
