package br.com.ews;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConnectionTest {
	
	@Test
	public void testConnection() {
				
		EntityManagerFactory factory = Persistence.
				createEntityManagerFactory("ewsJPA", System.getProperties());
		
		EntityManager manager = factory.createEntityManager();
		
		System.out.println("Conexao Aberta: " + manager.isOpen());
		assertTrue(manager.isOpen());
		
	}

	
	
}
