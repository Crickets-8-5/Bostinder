package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class VentanaPerfil extends JFrame {

	private PanelPerfil  pperfil;

	
	public VentanaPerfil() {
		
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
		
		pperfil = new PanelPerfil();
		pperfil.setBounds(10,10,765,540);
		pperfil.setOpaque(false);
		getContentPane().add(pperfil);
		


	}

	public PanelPerfil getPperfil() {
		return pperfil;
	}

	public void setPperfil(PanelPerfil pperfil) {
		this.pperfil = pperfil;
	}

	




	
}
