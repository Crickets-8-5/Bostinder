package co.edu.unbosque.view;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

public class VentanaInicioSesion extends JFrame{

	private PanelInicioSesion pinicioSesion;
	
	public VentanaInicioSesion() {
		
		setTitle("INICIAR SESION");
		setSize(550, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.lightGray);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void inicializarComponentes() {
		
		pinicioSesion = new PanelInicioSesion();
		pinicioSesion.setBounds(5, 5, 525,350);
		
	add(pinicioSesion,BorderLayout.NORTH);
		
	}

	public PanelInicioSesion getPinicioSesion() {
		return pinicioSesion;
	}

	public void setPinicioSesion(PanelInicioSesion pinicioSesion) {
		this.pinicioSesion = pinicioSesion;
	}
	
}