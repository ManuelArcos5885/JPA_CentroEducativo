package controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Estudiante;

public class ControladorEstudiante {
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("centroeducativo");
	
	
	
	
	public static List<Estudiante> findAllEstudiante(){
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createNativeQuery("Select * from estudiante; ", Estudiante.class);
		
		
		
		List<Estudiante> es = q.getResultList();
		
		
		return es;
	}
}
