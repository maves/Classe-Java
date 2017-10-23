package controller;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Domini;
import model.Parole;
import model.Url;

public class Controller {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("WordCrawler");             		
		EntityManager em = emf.createEntityManager();
//		List<Url> urls = em.createQuery("select u from Url u", Url.class).getResultList();
//		List<Parole> parole = em.createQuery("select p from Parole p", Parole.class).getResultList();
//		List<Domini> domini = em.createQuery("select d from Domini d", Domini.class).getResultList();
//		//ho creato le liste di oggetti corrispondenti alle nostre necessità
		Domini d = new Domini();
		d.setDominio("Maschio");
		
		d.addUrl(new Url());
		
		em.getTransaction().begin();
	//	domini.add(d);
		em.persist(d);
		em.getTransaction().commit();
		
		
	
	}
}
