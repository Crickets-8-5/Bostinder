package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelAdminTop extends JPanel {

	private JLabel e_titulo;
	private JButton b_vertop, b_volveradmin;
	

	public PanelAdminTop() {

		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		setBackground(new Color(222, 222, 222));
		setBorder(new LineBorder(new Color(190, 255, 237)));

//		e_titulo = new JLabel("SIMON");
//		e_titulo.setForeground(Color.cyan);
//		e_titulo.setFont(new Font("Algerian", 20, 40));
//		e_titulo.setBounds(180, 110, 264, 45);
//		add(e_titulo);

		b_vertop = new JButton("Estadisticas");
		b_vertop.setActionCommand("ESTADISTICAS");
		b_vertop.setBounds(160, 210, 155, 30);
		b_vertop.setBackground(Color.lightGray);
		add(b_vertop);

		b_volveradmin = new JButton("Eliminar");
		b_volveradmin.setActionCommand("ELIMINAR");
		b_volveradmin.setBounds(160, 170, 155, 30);
		b_volveradmin.setBackground(Color.lightGray);
		add(b_volveradmin);

	


	}

	public JLabel getE_titulo() {
		return e_titulo;
	}

	public void setE_titulo(JLabel e_titulo) {
		this.e_titulo = e_titulo;
	}

	public JButton getB_vertop() {
		return b_vertop;
	}

	public void setB_vertop(JButton b_vertop) {
		this.b_vertop = b_vertop;
	}

	public JButton getB_volveradmin() {
		return b_volveradmin;
	}

	public void setB_volveradmin(JButton b_volveradmin) {
		this.b_volveradmin = b_volveradmin;
	}

	
}
