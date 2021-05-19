package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class VentanaAdminPrincipal extends JFrame {

	private PanelAdminPrincipal adminprincipal;
	

	public VentanaAdminPrincipal() {

		setTitle("aaaaaaa");
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

		adminprincipal = new PanelAdminPrincipal();
		adminprincipal.setBounds(5, 5, 475, 350);
		adminprincipal.setOpaque(false);
		getContentPane().add(adminprincipal);

		
	}

	public PanelAdminPrincipal getAdminprincipal() {
		return adminprincipal;
	}

	public void setAdminprincipal(PanelAdminPrincipal adminprincipal) {
		this.adminprincipal = adminprincipal;
	}

}
