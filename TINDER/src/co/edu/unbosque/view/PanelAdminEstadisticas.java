package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class PanelAdminEstadisticas extends JPanel {

	private JLabel e_titulo;
	private JButton b_buscar, b_generar;
	private JTextArea jperfil;
	

	public PanelAdminEstadisticas() {

		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		setBackground(new Color(222, 222, 222));
		setBorder(new LineBorder(new Color(190, 255, 237)));
//
//		e_titulo = new JLabel("Simon");
//		e_titulo.setForeground(Color.cyan);
//		e_titulo.setFont(new Font("Algerian", 20, 40));
//		e_titulo.setBounds(180, 110, 264, 45);
//		add(e_titulo);

		b_buscar = new JButton("Estadisticas");
		b_buscar.setActionCommand("ESTADISTICAS");
		b_buscar.setBounds(160, 210, 155, 30);
		b_buscar.setBackground(Color.lightGray);
		add(b_buscar);

		b_generar = new JButton("Eliminar");
		b_generar.setActionCommand("ELIMINAR");
		b_generar.setBounds(160, 170, 155, 30);
		b_generar.setBackground(Color.lightGray);
		add(b_generar);
		
		jperfil = new JTextArea("");
		jperfil.setBounds(10,60, 510, 250);
		jperfil.setBorder(new LineBorder(null));
		jperfil.setEditable(false);
		add(jperfil);
		


	}

	public JLabel getE_titulo() {
		return e_titulo;
	}

	public void setE_titulo(JLabel e_titulo) {
		this.e_titulo = e_titulo;
	}

	public JButton getB_buscar() {
		return b_buscar;
	}

	public void setB_buscar(JButton b_buscar) {
		this.b_buscar = b_buscar;
	}

	public JButton getB_generar() {
		return b_generar;
	}

	public void setB_generar(JButton b_generar) {
		this.b_generar = b_generar;
	}

	public JTextArea getJperfil() {
		return jperfil;
	}

	public void setJperfil(JTextArea jperfil) {
		this.jperfil = jperfil;
	}

	

}
