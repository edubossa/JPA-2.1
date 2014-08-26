package br.com.ews;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import br.com.ews.entity.Usuario;

public class LifecycleCallbacksTest {
	
	/** Gerenciador de Transacoes **/
	EntityManager manager;
	
	@Before
	public void init(){
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ewsJPA");
		manager = factory.createEntityManager();	
	}
	
	@Test
	public void callbackInsertTest() {
		
		manager.getTransaction().begin();
		
		Usuario usuario = new Usuario();
		usuario.setNome("Eduardo Wallace");
		usuario.setSobrenome("Wallace");
		usuario.setTelefone("97672-7500");
		
		manager.persist(usuario);
		manager.getTransaction().commit();
		
	}
	
	@Test
	public void callbackPostLoad() {
		Usuario usr = manager.find(Usuario.class, 1);
		assertNotNull(usr);
	}
	
}