package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelInicioSesion extends JPanel {

	private JLabel e_titulo;
	private JButton b_admin, b_registrar, b_inisesion;
	

	public PanelInicioSesion() {
		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		setBackground(new Color(222, 222, 222));
		setBorder(new LineBorder(new Color(190, 255, 237)));

		e_titulo = new JLabel("Iniciar Sesion");
		e_titulo.setForeground(Color.WHITE);
		e_titulo.setFont(new Font("Algerian", 20, 35));
		e_titulo.setBounds(120, 60, 264, 45);
		add(e_titulo);

		b_inisesion = new JButton("Iniciar Sesion");
		buttons(b_inisesion, "INISESION", 160, 130, 155, 30);
		
		b_registrar = new JButton("Registrarse");
		buttons(b_registrar, "REGISTRAR", 160, 170, 155, 30);
		
		b_admin = new JButton("Admin");
		buttons(b_admin, "INIADMIN", 160, 210, 155, 30);
	}
	
	private void buttons(JButton button, String action,int x, int y, int w, int h) {
		button.setActionCommand(action);
		button.setBounds(x, y, w, h);
		button.setBackground(Color.lightGray);
		add(button);
	}

	public JLabel getE_titulo() {
		return e_titulo;
	}

	public void setE_titulo(JLabel e_titulo) {
		this.e_titulo = e_titulo;
	}

	public JButton getB_admin() {
		return b_admin;
	}

	public void setB_admin(JButton b_admin) {
		this.b_admin = b_admin;
	}

	public JButton getB_registrar() {
		return b_registrar;
	}

	public void setB_registrar(JButton b_registrar) {
		this.b_registrar = b_registrar;
	}

	public JButton getB_inisesion() {
		return b_inisesion;
	}

	public void setB_inisesion(JButton b_inisesion) {
		this.b_inisesion = b_inisesion;
	}
	
}
