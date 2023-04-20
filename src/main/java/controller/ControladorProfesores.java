package controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Estudiante;
import model.Profesor;

public class ControladorProfesores {
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("centroeducativo");
	
	
	
	
	public static List<Profesor> findAll(){
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createNativeQuery("Select * from profesor; ", Profesor.class);
		
		
		
		List<Profesor> es = q.getResultList();
		
		
		return es;
	}
}
