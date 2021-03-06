package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class PanelAdminEliminar extends JPanel {

	private JLabel e_mostrar;
	private JButton b_mostrar, b_eliminar, b_volveradmin;
	private JTextArea jresultado; 
	

	public PanelAdminEliminar() {

		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		setBackground(new Color(222, 222, 222));
		setBorder(new LineBorder(new Color(190, 255, 237)));

//		e_mostrar = new JLabel("");
//		e_mostrar.setForeground(Color.cyan);
//		e_mostrar.setFont(new Font("Algerian", 20, 40));
//		e_mostrar.setBounds(180, 110, 264, 45);
//		add(e_mostrar);

		b_mostrar = new JButton("Estadisticas");
		b_mostrar.setActionCommand("ESTADISTICAS");
		b_mostrar.setBounds(160, 210, 155, 30);
		b_mostrar.setBackground(Color.lightGray);
		add(b_mostrar);

		b_eliminar = new JButton("Eliminar");
		b_eliminar.setActionCommand("ELIMINAR");
		b_eliminar.setBounds(160, 170, 155, 30);
		b_eliminar.setBackground(Color.lightGray);
		add(b_eliminar);

		b_volveradmin = new JButton("Mirar top 10");
		b_volveradmin.setActionCommand("TOP");
		b_volveradmin.setBounds(160, 250, 155, 30);
		b_volveradmin.setBackground(Color.lightGray);
		add(b_volveradmin);
		
		jresultado = new JTextArea("");
		jresultado.setBounds(10,60, 510, 250);
		jresultado.setBorder(new LineBorder(null));
		jresultado.setEditable(false);
		add(jresultado);
		


	}

	public JLabel getE_mostrar() {
		return e_mostrar;
	}

	public void setE_mostrar(JLabel e_mostrar) {
		this.e_mostrar = e_mostrar;
	}

	public JButton getB_mostrar() {
		return b_mostrar;
	}

	public void setB_mostrar(JButton b_mostrar) {
		this.b_mostrar = b_mostrar;
	}

	public JButton getB_eliminar() {
		return b_eliminar;
	}

	public void setB_eliminar(JButton b_eliminar) {
		this.b_eliminar = b_eliminar;
	}

	public JButton getB_volveradmin() {
		return b_volveradmin;
	}

	public void setB_volveradmin(JButton b_volveradmin) {
		this.b_volveradmin = b_volveradmin;
	}

	public JTextArea getJresultado() {
		return jresultado;
	}

	public void setJresultado(JTextArea jresultado) {
		this.jresultado = jresultado;
	}

	

}
