package com.insurance.quote.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
	public static EntityManager getEntityManager() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
	    EntityManager manager=factory.createEntityManager();
		return manager;
		}
}
