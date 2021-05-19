package co.edu.unbosque.view;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

public class VentanaAdminTop extends JFrame{

	private PanelAdminTop pinicioSesion;
	
	public VentanaAdminTop() {
		
		setTitle("Top 10");
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
		
		pinicioSesion = new PanelAdminTop();
		pinicioSesion.setBounds(5, 5, 525,350);
		add(pinicioSesion,BorderLayout.NORTH);
		
	}

	public PanelAdminTop getPinicioSesion() {
		return pinicioSesion;
	}

	public void setPinicioSesion(PanelAdminTop pinicioSesion) {
		this.pinicioSesion = pinicioSesion;
	}
	
}