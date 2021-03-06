package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;


public class VentanaOpciones extends JFrame {

	private PanelOpciones popciones;
	
	

	public VentanaOpciones() {
		
		
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.lightGray);

		inicializarComponentes();
	
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public void inicializarComponentes() {
		
		popciones = new PanelOpciones();
		popciones.setBounds(5, 5, 573, 550);
		popciones.setOpaque(true);
		getContentPane().add(popciones);
			
	}

	public PanelOpciones getPopciones() {
		return popciones;
	}

	public void setPopciones(PanelOpciones popciones) {
		this.popciones = popciones;
	}

	

}