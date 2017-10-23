package model;

import controller.PageResponse;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GestoreDB {

	public void salvaUrl(String url) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("WordCrawler");             		
		EntityManager em = emf.createEntityManager();
		
		List<Domini> domini = em.createQuery("select d from Domini d", Domini.class).getResultList();
		Domini d = new Domini();
		d.setDominio(url);
	
	
		
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
	}
	public void salva(PageResponse pr) {
		
	
//		EntityManagerFactory emf =Persistence.createEntityManagerFactory("WordCrawler");
//		
//		EntityManager em = emf.createEntityManager();	
//		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("WordCrawler");             		
		EntityManager em = emf.createEntityManager();
		List<Url> urls = em.createQuery("select u from Url u", Url.class).getResultList();
		List<Parole> parole = em.createQuery("select p from Parole p", Parole.class).getResultList();
		List<Domini> domini = em.createQuery("select d from Domini d", Domini.class).getResultList();
		
		em.getTransaction().begin();
		em.persist(pr);
		em.getTransaction().commit();
		
	}
}
