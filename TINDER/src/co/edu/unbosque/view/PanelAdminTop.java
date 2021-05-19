package co.edu.unbosque.view;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;


public class PanelAdminTop extends JPanel {

	private JTextArea jusuario;
	private JLabel e_titulo,e_usuario,e_contraseņa;
	private JButton b_iniciar;
	private JComboBox<String> jcfiltro;

	public PanelAdminTop() {

		setLayout(null);
		
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		
//		e_titulo = new JLabel("Inicio sesion");
//		e_titulo.setForeground(Color.cyan);
//		e_titulo.setFont(new Font("Algerian", 20, 40));
//		e_titulo.setBounds(180, 110, 264, 45);
//		add(e_titulo);
		
		jusuario = new JTextArea("");
		jusuario.setBounds(5, 60, 515, 250);
		jusuario.setBorder(new LineBorder(null));
		jusuario.setEditable(false);
		add(jusuario);
		

		b_iniciar = new JButton("VOLVER");
		b_iniciar.setBounds(410, 5, 100, 20);
		b_iniciar.setActionCommand("VOLVER");
		add(b_iniciar);
		
		

	}


}
