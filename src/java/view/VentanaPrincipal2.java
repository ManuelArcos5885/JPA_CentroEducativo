package view;


import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.ControladorAlumno;
import controllers.ControladorMateria;
import controllers.controladorProfesor;
import model.Estudiante;
import model.Materia;
import model.Profesor;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class VentanaPrincipal2 extends JFrame {

	private JPanel contentPane;
	private static JComboBox comboBox_Materia;
	private static JComboBox comboBox_Profesor;
	private static JComboBox comboBox_Nota;
	private JpanelList panel_Est1;
	private static JpanelList panel_Est;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal2 frame = new VentanaPrincipal2();
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
	public VentanaPrincipal2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{66, 368, 0};
		gbl_panel.rowHeights = new int[]{24, 24, 24, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Materia:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		comboBox_Materia = new JComboBox();
		GridBagConstraints gbc_comboBox_Materia = new GridBagConstraints();
		gbc_comboBox_Materia.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_Materia.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_Materia.gridx = 1;
		gbc_comboBox_Materia.gridy = 0;
		panel.add(comboBox_Materia, gbc_comboBox_Materia);
		
		JLabel lblNewLabel_1 = new JLabel("Profesor:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		comboBox_Profesor = new JComboBox();
		GridBagConstraints gbc_comboBox_Profesor = new GridBagConstraints();
		gbc_comboBox_Profesor.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_Profesor.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_Profesor.gridx = 1;
		gbc_comboBox_Profesor.gridy = 1;
		panel.add(comboBox_Profesor, gbc_comboBox_Profesor);
		
		JLabel lblNewLabel_2 = new JLabel("Nota:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		comboBox_Nota = new JComboBox();
		GridBagConstraints gbc_comboBox_Nota = new GridBagConstraints();
		gbc_comboBox_Nota.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_Nota.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_Nota.gridx = 1;
		gbc_comboBox_Nota.gridy = 2;
		panel.add(comboBox_Nota, gbc_comboBox_Nota);
		
		JButton btnNewButton_1 = new JButton("botom actualizar alumnado");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 3;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		panel_Est = new JpanelList();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 4;
		panel.add(panel_Est, gbc_panel_1);
		

		
		panel_Est1 = new JpanelList();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 0, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 1;
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 1;
		contentPane.add(panel_5, gbc_panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JButton btnNewButton = new JButton("Guardar las notas de todos los alumnos seleccionados");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 9;
		gbc_btnNewButton.gridy = 2;
		panel_5.add(btnNewButton, gbc_btnNewButton);
		
		
		
		
		cargarTodasMateria();
		cargarTodosProfesores();
		cargarTodasNotas();
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
		List<Profesor> ps = controladorProfesor.findAll();
		
		for (Profesor p : ps) {
			comboBox_Profesor.addItem(p);
		}
	}
	
	/**
	 * 
	 * 
	 * 
	 */
	
	public static void cargarTodasNotas() {
		List<Integer> ps = new ArrayList();
		
		for (int i = 0; i < 11; i++) {
			ps.add(i);
		}
		
		for (Integer p : ps) {
			comboBox_Nota.addItem(p);
		}
	}
	
	/**
	 * 
	 * 
	 * 
	 */
	
	public static void cargarTodosAlumnos() {
		
		
		
		
		
	}
	

}
