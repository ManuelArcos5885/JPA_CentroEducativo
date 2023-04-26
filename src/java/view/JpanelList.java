package view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import controllers.ControladorAlumno;
import model.Estudiante;

import java.awt.Insets;
import java.util.Iterator;
import java.util.List;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JpanelList extends JPanel {
	private JList jlistEstudiante1;
	private JList jlistEstudiante2;
	private List<Estudiante> listEstudiantes = ControladorAlumno.findAll();
	private DefaultListModel<Estudiante> listModelEstudiantesSeleccionados = new DefaultListModel<Estudiante>();
	private DefaultListModel<Estudiante> listModelEstudiantesNoSeleccionados = null;
	
	/**
	 * Create the panel.
	 */
	public JpanelList() {
		GridBagLayout gridBagLayout = new GridBagLayout();
//		gridBagLayout.columnWidths = new int[]{174, 216, 154, 0};
//		gridBagLayout.rowHeights = new int[]{15, 280, 0};
//		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
//		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblAlumnoNoSeleccionado = new JLabel("Alumno no seleccionado:");
		GridBagConstraints gbc_lblAlumnoNoSeleccionado = new GridBagConstraints();
		gbc_lblAlumnoNoSeleccionado.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlumnoNoSeleccionado.gridx = 0;
		gbc_lblAlumnoNoSeleccionado.gridy = 0;
		add(lblAlumnoNoSeleccionado, gbc_lblAlumnoNoSeleccionado);
		
		JLabel lblAlumnoSeleccionado = new JLabel("Alumno seleccionado:");
		GridBagConstraints gbc_lblAlumnoSeleccionado = new GridBagConstraints();
		gbc_lblAlumnoSeleccionado.insets = new Insets(0, 0, 5, 0);
		gbc_lblAlumnoSeleccionado.gridx = 2;
		gbc_lblAlumnoSeleccionado.gridy = 0;
		add(lblAlumnoSeleccionado, gbc_lblAlumnoSeleccionado);
		
		
		jlistEstudiante1 = new JList(this.getDefaultListModelSelec());
		this.jlistEstudiante1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Valor por defecto
		
		
		
		JScrollPane scrollPane = new JScrollPane(jlistEstudiante1);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.weightx = 1.0;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{54, 44, 44, 54, 0};
		gbl_panel.rowHeights = new int[]{25, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton button = new JButton("<<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarTodosEstudiantes();
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.gridwidth = 2;
		gbc_button.weightx = 1.0;
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 1;
		gbc_button.gridy = 0;
		panel.add(button, gbc_button);
		
		JButton button_1 = new JButton(">");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < jlistEstudiante1.getSelectedIndices().length; i++) {
					listModelEstudiantesSeleccionados.removeElementAt(jlistEstudiante1.getSelectedIndices()[i]);
					
				}
				
			}
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.gridwidth = 2;
		gbc_button_1.weightx = 1.0;
		gbc_button_1.anchor = GridBagConstraints.NORTH;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 1;
		panel.add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton("<");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.gridwidth = 2;
		gbc_button_2.weightx = 1.0;
		gbc_button_2.anchor = GridBagConstraints.NORTH;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 1;
		gbc_button_2.gridy = 2;
		panel.add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton(">>");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarTodosEstudiantes2();
			}
		});
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.gridwidth = 2;
		gbc_button_3.weightx = 1.0;
		gbc_button_3.insets = new Insets(0, 0, 0, 5);
		gbc_button_3.anchor = GridBagConstraints.NORTH;
		gbc_button_3.gridx = 1;
		gbc_button_3.gridy = 3;
		panel.add(button_3, gbc_button_3);
		
		
		
		jlistEstudiante2 = new JList(this.getDefaultListModelNoSelec());
		this.jlistEstudiante2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Valor por defecto
		
		
		
		JScrollPane scrollPane_1 = new JScrollPane(jlistEstudiante2);
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.weightx = 1.0;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 2;
		gbc_scrollPane_1.gridy = 1;
		add(scrollPane_1, gbc_scrollPane_1);
		
		
		
		
		agregarTodosEstudiantes();
		
	}
	/**
	 * 
	 * 
	 */
	
	private void agregarTodosEstudiantes2() {
		for (int i = 0; i <listEstudiantes.size(); i++) {
			this.listModelEstudiantesNoSeleccionados.addElement(this.listEstudiantes.get(i));
			
		}
		listModelEstudiantesSeleccionados.removeAllElements();
		
	}
	
	private void agregarTodosEstudiantes() {
		for (int i = 0; i <listEstudiantes.size(); i++) {
			this.listModelEstudiantesSeleccionados.addElement(this.listEstudiantes.get(i));
			
		}
		listModelEstudiantesNoSeleccionados.removeAllElements();
	}
	
	//Enlaza el jlist con el listModelEstudiantesSeleccionados
	private DefaultListModel getDefaultListModelSelec () {
		this.listModelEstudiantesSeleccionados = new DefaultListModel<Estudiante>();
		return this.listModelEstudiantesSeleccionados;
	}
	
	//Enlaza el jlist con el getDefaultListModelNoSelec
		private DefaultListModel getDefaultListModelNoSelec () {
			this.listModelEstudiantesNoSeleccionados = new DefaultListModel<Estudiante>();
			return this.listModelEstudiantesNoSeleccionados;
		}

}
