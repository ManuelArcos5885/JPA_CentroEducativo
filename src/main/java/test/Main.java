package test;

import java.util.List;

import controller.ControladorCurso;
import controller.ControladorEstudiante;
import controller.ControladorProfesores;
import model.Curso;
import model.Estudiante;
import model.Profesor;

public class Main {

	public static void main(String[] args) {
		
		List<Estudiante> es = ControladorEstudiante.findAllEstudiante();
		
		for (Estudiante e : es) {
			System.out.println(e.getNombre() +" "+ e.getApellido1());
		}
		System.out.println("\n\n\n");
		List<Curso> cs = ControladorCurso.findAllCurso();
		
		for (Curso c : cs) {
			System.out.println(c.getId() +" "+ c.getDescripcion());
		}
		
		
		System.out.println("\n\n\n\n");
		List<Profesor> ps = ControladorProfesores.findAllProfesor();
		
		for (Profesor p : ps) {
			System.out.println(p.getNombre() +" "+ p.getApellido1());
		}
		
		

	}

}
