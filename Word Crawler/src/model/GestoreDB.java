package model;

import controller.PageResponse;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GestoreDB {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static GestoreDB istance;
	
	private GestoreDB() {
		emf = Persistence.createEntityManagerFactory("WordCrawler");             		
		em = emf.createEntityManager();

	}
	
	public static GestoreDB getIstance() {
		if (istance == null) {
			GestoreDB.istance = new GestoreDB();
		}
		return GestoreDB.istance;
	}
	
	public void salvaDominio(Domini d) {
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
	}
	
	
//	
//	public void salvaUrl(String url) {
//		
//		List<Domini> domini = em.createQuery("select d from Domini d", Domini.class).getResultList();
//		Domini d = new Domini();
//		d.setDominio(url);
//	
//	
//		
//		em.getTransaction().begin();
//		em.persist(d);
//		em.getTransaction().commit();
//	}
	
	
//	public void salva(PageResponse pr) {
//		
//	
////		EntityManagerFactory emf =Persistence.createEntityManagerFactory("WordCrawler");
////		
////		EntityManager em = emf.createEntityManager();	
////		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("WordCrawler");             		
//		EntityManager em = emf.createEntityManager();
//		List<Url> urls = em.createQuery("select u from Url u", Url.class).getResultList();
//		List<Parole> parole = em.createQuery("select p from Parole p", Parole.class).getResultList();
//		List<Domini> domini = em.createQuery("select d from Domini d", Domini.class).getResultList();
//		
//		em.getTransaction().begin();
//		em.persist(pr);
//		em.getTransaction().commit();
//		
//	}
}
