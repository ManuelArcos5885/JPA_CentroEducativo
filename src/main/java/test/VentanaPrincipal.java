package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControladorEstudiante;
import controller.ControladorMateria;
import controller.ControladorProfesores;
import model.Estudiante;
import model.Materia;
import model.Profesor;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private static JComboBox comboBox_Materia;
	private static JComboBox comboBox_Profesor;
	private static JPanel panel_6;
	private static JPanel panel;
	private static JPanel panel_Alumnos;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Materia:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		comboBox_Materia = new JComboBox();
		GridBagConstraints gbc_comboBox_Materia = new GridBagConstraints();
		gbc_comboBox_Materia.gridwidth = 4;
		gbc_comboBox_Materia.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_Materia.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_Materia.gridx = 1;
		gbc_comboBox_Materia.gridy = 0;
		panel.add(comboBox_Materia, gbc_comboBox_Materia);
		
		JLabel lblNewLabel_1 = new JLabel("Profesor");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		comboBox_Profesor = new JComboBox();
		GridBagConstraints gbc_comboBox_Profesor = new GridBagConstraints();
		gbc_comboBox_Profesor.gridwidth = 4;
		gbc_comboBox_Profesor.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox_Profesor.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_Profesor.gridx = 1;
		gbc_comboBox_Profesor.gridy = 1;
		panel.add(comboBox_Profesor, gbc_comboBox_Profesor);
		
		JButton btnNewButton = new JButton("botom refrescar alumno");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarTodosEstudiantes();
				panel.repaint();
				
				panel.revalidate();	
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.gridx = 9;
		gbc_btnNewButton.gridy = 1;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		panel_6 = new JPanel();
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.gridheight = 6;
		gbc_panel_6.insets = new Insets(0, 0, 5, 0);
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.gridx = 0;
		gbc_panel_6.gridy = 1;
		contentPane.add(panel_6, gbc_panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_6.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		JLabel lblNewLabel_2 = new JLabel("A continuacion deben aparecer todos llos alumnos con un elemento");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridwidth = 7;
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 0;
		panel_6.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Para que puedas introducir su nota, para el profesor y la materia determinada");
		GridBagConstraints gbc_lblNewLabel_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1.gridwidth = 7;
		gbc_lblNewLabel_2_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2_1.gridx = 0;
		gbc_lblNewLabel_2_1.gridy = 1;
		panel_6.add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);
		
		JButton btnNewButton_1 = new JButton("Guardar las notas de todos los alumnos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarTodosEstudiantes();
			}
		});
		
		panel_Alumnos = new JPanel();
		GridBagConstraints gbc_panel_Alumnos = new GridBagConstraints();
		gbc_panel_Alumnos.gridheight = 7;
		gbc_panel_Alumnos.gridwidth = 7;
		gbc_panel_Alumnos.insets = new Insets(0, 0, 5, 5);
		gbc_panel_Alumnos.fill = GridBagConstraints.BOTH;
		gbc_panel_Alumnos.gridx = 0;
		gbc_panel_Alumnos.gridy = 2;
		panel_6.add(panel_Alumnos, gbc_panel_Alumnos);
		
		
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 4;
		gbc_btnNewButton_1.gridy = 9;
		panel_6.add(btnNewButton_1, gbc_btnNewButton_1);
		
		cargarTodasMateria();
		cargarTodosProfesores();
	}
	
	
	/**
	 * 
	 * 
	 * 
	 */
	
	public static void cargarTodasMateria() {
		List<Materia> ps = ControladorMateria.findAll();
		
		for (Materia p : ps) {
			comboBox_Materia.addItem(p);
		}
	}
	/**
	 * 
	 * 
	 * 
	 */
	
	public static void cargarTodosProfesores() {
		List<Profesor> ps = ControladorProfesores.findAll();
		
		for (Profesor p : ps) {
			comboBox_Profesor.addItem(p);
		}
	}
	
	
	/**
	 * 
	 * 
	 * 
	 */
	
	public static void cargarTodosEstudiantes() {
		Materia m = (Materia) comboBox_Materia.getSelectedItem();
		Profesor p = (Profesor) comboBox_Profesor.getSelectedItem();
		
		List<Estudiante> es = ControladorEstudiante.findAll();
		
		
		for (Estudiante estudiante : es) {
			System.out.println(estudiante.getNombre());
		}
		

		for (Estudiante e : es) {
			
			PanelAlumnos panel_Alumnos = new PanelAlumnos(e.getId(),p.getId(),m.getId(),"hola",e.getValoracionmaterias());
			
			
			System.out.println(panel_Alumnos.getIdEstu());
			
			GridBagConstraints gbc_panel_Alumnos = new GridBagConstraints();
			gbc_panel_Alumnos.gridheight = 6;
			gbc_panel_Alumnos.insets = new Insets(0, 0, 5, 5);
			gbc_panel_Alumnos.fill = GridBagConstraints.BOTH;
			gbc_panel_Alumnos.gridx = 4;
			gbc_panel_Alumnos.gridy = 2;
			panel_6.add(panel_Alumnos, gbc_panel_Alumnos);
			
		}
			
		panel_6.repaint();
		
		panel_6.revalidate();	
		
		
	}
	
	

}
