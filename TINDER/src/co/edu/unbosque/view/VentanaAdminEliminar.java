package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class VentanaAdminEliminar extends JFrame {

	private PanelAdminEliminar vadeliminar;
	
	public VentanaAdminEliminar() {

		setTitle("Men? Principal");
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

		vadeliminar = new PanelAdminEliminar();
		vadeliminar.setBounds(5, 5, 475, 350);
		vadeliminar.setOpaque(false);
		getContentPane().add(vadeliminar);

		

	}

	public PanelAdminEliminar getVadeliminar() {
		return vadeliminar;
	}

	public void setVadeliminar(PanelAdminEliminar vadeliminar) {
		this.vadeliminar = vadeliminar;
	}

	

}
