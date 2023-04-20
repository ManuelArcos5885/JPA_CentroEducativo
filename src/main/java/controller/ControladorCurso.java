package controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Curso;

public class ControladorCurso {
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("centroeducativo");
	
	
	
	
	public static List<Curso> findAllCurso(){
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createNativeQuery("Select * from curso; ", Curso.class);
		
		
		
		List<Curso> es = q.getResultList();
		
		
		return es;
	}
}
