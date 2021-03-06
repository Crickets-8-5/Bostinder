package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class VentanaInscripcionMujer extends JFrame {

	private PanelMujeres pmujeres;

	
	public VentanaInscripcionMujer() {
		
		setTitle("Inscripción Mujeres");
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
		pmujeres = new PanelMujeres();
		pmujeres.setBounds(10,10,765,540);
		pmujeres.setOpaque(false);
		getContentPane().add(pmujeres);
	}

	public PanelMujeres getPmujeres() {
		return pmujeres;
	}

	public void setPmujeres(PanelMujeres pmujeres) {
		this.pmujeres = pmujeres;
	}

	
	
}
