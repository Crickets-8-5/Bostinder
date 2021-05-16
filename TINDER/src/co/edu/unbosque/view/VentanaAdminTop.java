package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class VentanaAdminTop extends JFrame {

	private PanelAdminTop admintop;


	public VentanaAdminTop() {

		setTitle("Menú Principal");
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

		admintop = new PanelAdminTop();
		admintop.setBounds(5, 5, 475, 350);
		admintop.setOpaque(false);
		getContentPane().add(admintop);	
	}

	public PanelAdminTop getAdmintop() {
		return admintop;
	}

	public void setAdmintop(PanelAdminTop admintop) {
		this.admintop = admintop;
	}

	
}
