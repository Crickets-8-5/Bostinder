package co.edu.unbosque.view;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;


public class PanelPerfil extends JPanel {

	private JTextArea jmostrarperfil;
	private JLabel jlaias;
	private JComboBox<String> jcescoger; 
	private JButton b_megusta,b_cerrarsesion,b_siguiente;

	public PanelPerfil() {

		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		
		jlaias = new JLabel();
		jlaias.setForeground(Color.cyan);
		jlaias.setFont(new Font("Algerian", 20, 40));
		jlaias.setBounds(180, 110, 264, 45);
		add(jlaias);
		
		jmostrarperfil= new JTextArea("");
		jmostrarperfil.setBounds(10, 60, 510, 250);
		jmostrarperfil.setBorder(new LineBorder(null));
		jmostrarperfil.setEditable(false);
		add(jmostrarperfil);
		
		jcescoger = new JComboBox<String>();
		jcescoger.setBounds(10, 60, 510, 250);
		jcescoger.setBorder(new LineBorder(null));
		jcescoger.addItem("Hombres");
		jcescoger.addItem("Mujeres");
		jcescoger.addItem("Todo lo que se mueva");
		jcescoger.setEditable(false);
		add(jcescoger);
		
		b_megusta = new JButton("HOLA BB");
		b_megusta.setBounds(443, 5, 120, 30);
		b_megusta.setActionCommand("MEGUSTA");
		add(b_megusta);
		
		b_cerrarsesion = new JButton("Cerrar sesion");
		b_cerrarsesion.setBounds(443, 5, 120, 30);
		b_cerrarsesion.setActionCommand("CERRAR");
		add(b_megusta);
		
		b_siguiente= new JButton("Siguente usuario");
		b_siguiente.setBounds(443, 5, 120, 30);
		b_siguiente.setActionCommand("SIGUIENTE");
		add(b_megusta);

	}

	public JTextArea getJmostrarperfil() {
		return jmostrarperfil;
	}

	public void setJmostrarperfil(JTextArea jmostrarperfil) {
		this.jmostrarperfil = jmostrarperfil;
	}

	public JLabel getJlaias() {
		return jlaias;
	}

	public void setJlaias(JLabel jlaias) {
		this.jlaias = jlaias;
	}

	public JComboBox<String> getJcescoger() {
		return jcescoger;
	}

	public void setJcescoger(JComboBox<String> jcescoger) {
		this.jcescoger = jcescoger;
	}

	public JButton getB_megusta() {
		return b_megusta;
	}

	public void setB_megusta(JButton b_megusta) {
		this.b_megusta = b_megusta;
	}

	public JButton getB_cerrarsesion() {
		return b_cerrarsesion;
	}

	public void setB_cerrarsesion(JButton b_cerrarsesion) {
		this.b_cerrarsesion = b_cerrarsesion;
	}

	public JButton getB_siguiente() {
		return b_siguiente;
	}

	public void setB_siguiente(JButton b_siguiente) {
		this.b_siguiente = b_siguiente;
	}
	
	

}
