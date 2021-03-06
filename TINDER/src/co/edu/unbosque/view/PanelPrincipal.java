package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelPrincipal extends JPanel {

	private JLabel e_titulo;
	private JButton b_inicio, b_inscribirse, b_admin;

	public PanelPrincipal() {

		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		setBackground(new Color(222, 222, 222));
		setBorder(new LineBorder(new Color(190, 255, 237)));

		e_titulo = new JLabel("SIMON");
		e_titulo.setForeground(Color.cyan);
		e_titulo.setFont(new Font("Algerian", 20, 40));
		e_titulo.setBounds(180, 110, 264, 45);
		add(e_titulo);

		b_inicio = new JButton("Iniciar Sesion");
		b_inicio.setActionCommand("INICIO");
		b_inicio.setBounds(160, 210, 155, 30);
		b_inicio.setBackground(Color.lightGray);
		add(b_inicio);

		b_inscribirse = new JButton("Inscribirse");
		b_inscribirse.setActionCommand("INSCRIBIRSE");
		b_inscribirse.setBounds(160, 170, 155, 30);
		b_inscribirse.setBackground(Color.lightGray);
		add(b_inscribirse);

		b_admin = new JButton("ADMIN :)");
		b_admin.setActionCommand("ADMIN");
		b_admin.setBounds(160, 250, 155, 30);
		b_admin.setBackground(Color.lightGray);
		add(b_admin);


	}

	public JLabel getE_titulo() {
		return e_titulo;
	}

	public void setE_titulo(JLabel e_titulo) {
		this.e_titulo = e_titulo;
	}

	public JButton getB_inicio() {
		return b_inicio;
	}

	public void setB_inicio(JButton b_inicio) {
		this.b_inicio = b_inicio;
	}

	public JButton getB_inscribirse() {
		return b_inscribirse;
	}

	public void setB_inscribirse(JButton b_inscribirse) {
		this.b_inscribirse = b_inscribirse;
	}

	public JButton getB_admin() {
		return b_admin;
	}

	public void setB_admin(JButton b_admin) {
		this.b_admin = b_admin;
	}



}
