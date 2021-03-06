package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class VentanaAdminEstadisticas extends JFrame {

	private PanelAdminEstadisticas estadisticas;
	

	public VentanaAdminEstadisticas() {

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

		estadisticas = new PanelAdminEstadisticas();
		estadisticas.setBounds(5, 5, 475, 350);
		estadisticas.setOpaque(false);
		getContentPane().add(estadisticas);

		
	}

	public PanelAdminEstadisticas getEstadisticas() {
		return estadisticas;
	}

	public void setEstadisticas(PanelAdminEstadisticas estadisticas) {
		this.estadisticas = estadisticas;
	}

	

}
