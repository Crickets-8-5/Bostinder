package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class VentanaInscripcionHombres extends JFrame {

	private PanelHombres phombres;

	
	public VentanaInscripcionHombres() {
		
		setTitle("Inscripición Hombres");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.lightGray);
		
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void inicializarComponentes() {
		phombres = new PanelHombres();
		phombres.setBounds(10,10,765,540);
		phombres.setOpaque(false);
		getContentPane().add(phombres);
	}

	public PanelHombres getPhombres() {
		return phombres;
	}

	public void setPhombres(PanelHombres phombres) {
		this.phombres = phombres;
	}

	
}
