package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class VentanaInicioSesion extends JFrame {

	private PanelInicioSesion admintop;


	public VentanaInicioSesion() {
		setTitle("Inicio Sesion");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.darkGray);
		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void inicializarComponentes() {
		admintop = new PanelInicioSesion();
		admintop.setBounds(5, 5, 475, 350);
		admintop.setOpaque(false);
		getContentPane().add(admintop);	
	}

	public PanelInicioSesion getAdmintop() {
		return admintop;
	}

	public void setAdmintop(PanelInicioSesion admintop) {
		this.admintop = admintop;
	}

	
}
