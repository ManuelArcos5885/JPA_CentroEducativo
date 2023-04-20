package test;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;

import model.Valoracionmateria;

import java.awt.Insets;
import java.util.List;

public class PanelAlumnos extends JPanel {
	private JTextField textField_Nota;
	private int idEstu;
	private int idProf;
	private int idMateria;
	private JLabel lblNewLabel;
	private JTextField textField;
	private GridBagConstraints gbc_labelNombre;;
	
	/**
	 * Create the panel.
	 */
	public PanelAlumnos(int idEstu, int idProf, int idMateria,String nombre,List<Valoracionmateria> list) {
		
		
		this.idEstu = idEstu;
		this.idProf = idProf;
		this.idMateria = idMateria;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblNewLabel = new JLabel(nombre);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		

		
		textField_Nota = new JTextField();
		GridBagConstraints gbc_textField_Nota = new GridBagConstraints();
		gbc_textField_Nota.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_Nota.gridx = 1;
		gbc_textField_Nota.gridy = 0;
		add(textField_Nota, gbc_textField_Nota);
		textField_Nota.setColumns(10);

	}
	




	public int getIdEstu() {
		return idEstu;
	}

	public void setIdEstu(int idEstu) {
		this.idEstu = idEstu;
	}

	public int getIdProf() {
		return idProf;
	}

	public void setIdProf(int idProf) {
		this.idProf = idProf;
	}

	public int getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	public JTextField getTextField_Nota() {
		return textField_Nota;
	}

	public void setTextField_Nota(JTextField textField_Nota) {
		this.textField_Nota = textField_Nota;
	}
	
	
	
	
	
	

}
