package co.edu.unbosque.view;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;


public class PanelInicioSesion extends JPanel {

	private JTextArea jusuario;
	private JLabel e_titulo,e_usuario,e_contraseña;
	private JPasswordField jpcontrseña; 
	private JButton b_iniciar;

	public PanelInicioSesion() {

		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		
		e_titulo = new JLabel("	Inicio sesion");
		e_titulo.setForeground(Color.cyan);
		e_titulo.setFont(new Font("Algerian", 20, 40));
		e_titulo.setBounds(180, 110, 264, 45);
		add(e_titulo);
		
		jusuario = new JTextArea("");
		jusuario.setBounds(10, 60, 510, 250);
		jusuario.setBorder(new LineBorder(null));
		jusuario.setEditable(false);
		add(jusuario);
		
		jpcontrseña = new JPasswordField();
		jpcontrseña.setBounds(10, 60, 510, 250);
		jpcontrseña.setBorder(new LineBorder(null));
		jpcontrseña.setEditable(false);
		add(jpcontrseña);
		
		b_iniciar = new JButton("VOLVER");
		b_iniciar.setBounds(443, 5, 120, 30);
		b_iniciar.setActionCommand("VOLVER");
		add(b_iniciar);

	}

	public JTextArea getJusuario() {
		return jusuario;
	}

	public void setJusuario(JTextArea jusuario) {
		this.jusuario = jusuario;
	}

	public JLabel getE_titulo() {
		return e_titulo;
	}

	public void setE_titulo(JLabel e_titulo) {
		this.e_titulo = e_titulo;
	}

	public JLabel getE_usuario() {
		return e_usuario;
	}

	public void setE_usuario(JLabel e_usuario) {
		this.e_usuario = e_usuario;
	}

	public JLabel getE_contraseña() {
		return e_contraseña;
	}

	public void setE_contraseña(JLabel e_contraseña) {
		this.e_contraseña = e_contraseña;
	}

	public JPasswordField getJpcontrseña() {
		return jpcontrseña;
	}

	public void setJpcontrseña(JPasswordField jpcontrseña) {
		this.jpcontrseña = jpcontrseña;
	}

	public JButton getB_iniciar() {
		return b_iniciar;
	}

	public void setB_iniciar(JButton b_iniciar) {
		this.b_iniciar = b_iniciar;
	}

}
