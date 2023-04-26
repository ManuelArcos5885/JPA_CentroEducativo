package controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Materia;

public class ControladorMateria {
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("centroeducativo");
	
	
	
	
	public static List<Materia> findAll(){
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createNativeQuery("Select * from materia; ", Materia.class);
		
		
		
		List<Materia> es = q.getResultList();
		
		
		return es;
	}
}
