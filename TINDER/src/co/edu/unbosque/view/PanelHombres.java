package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

public class PanelHombres extends JPanel {

	private JTextArea jcorreo,jnombrecompleto,jalias,jestatura,jingreso;
	private JLabel jldisponible,jlcorreo,jlnombrecompleto,jlalias,jlestatura,jlingreso,h_titulo;
	private JRadioButton br_Disponible;
	private JScrollPane lista;
	private JButton b_verificar;
	

	public PanelHombres() {
		setLayout(null);
		inicializarComponentes();
		
		
	}

	public void inicializarComponentes() {

		h_titulo = new JLabel("Inscripción Hombre");
		h_titulo.setFont(new Font("Algerian", 20, 40));
		h_titulo.setBounds(160, 15, 250, 45);
		add(h_titulo);
		
		jcorreo = new JTextArea("");
		jcorreo.setBounds(10,60, 510, 250);
		jcorreo.setBorder(new LineBorder(null));
		jcorreo.setEditable(false);
		add(jcorreo);
		
		jnombrecompleto = new JTextArea("");
		jnombrecompleto.setBounds(10,60, 510, 250);
		jnombrecompleto.setBorder(new LineBorder(null));
		jnombrecompleto.setEditable(false);
		add(jnombrecompleto );
		
		jalias = new JTextArea("");
		jalias.setBounds(10,60, 510, 250);
		jalias.setBorder(new LineBorder(null));
		jalias.setEditable(false);
		add(jalias);
		
		jestatura= new JTextArea("");
		jestatura.setBounds(10,60, 510, 250);
		jestatura.setBorder(new LineBorder(null));
		jestatura.setEditable(false);
		add(jestatura);
		
		jingreso = new JTextArea("");
		jingreso.setBounds(10,60, 510, 250);
		jingreso.setBorder(new LineBorder(null));
		jingreso.setEditable(false);
		add(jingreso);

		b_verificar = new JButton("Verificar");
		b_verificar.setBounds(10,320, 100, 20);
		b_verificar.setActionCommand("VERIFICAR");
		b_verificar.setBackground(Color.lightGray);
		add(b_verificar);
		
		br_Disponible = new JRadioButton("Disponible");
		br_Disponible.setBounds(10,320, 100, 20);
		br_Disponible.setActionCommand("DISPONIBLE");
		br_Disponible.setBackground(Color.lightGray);
		add(br_Disponible);
		
		

		
	}

	public JTextArea getJcorreo() {
		return jcorreo;
	}

	public void setJcorreo(JTextArea jcorreo) {
		this.jcorreo = jcorreo;
	}

	public JTextArea getJnombrecompleto() {
		return jnombrecompleto;
	}

	public void setJnombrecompleto(JTextArea jnombrecompleto) {
		this.jnombrecompleto = jnombrecompleto;
	}

	public JTextArea getJalias() {
		return jalias;
	}

	public void setJalias(JTextArea jalias) {
		this.jalias = jalias;
	}

	public JTextArea getJestatura() {
		return jestatura;
	}

	public void setJestatura(JTextArea jestatura) {
		this.jestatura = jestatura;
	}

	public JTextArea getJingreso() {
		return jingreso;
	}

	public void setJingreso(JTextArea jingreso) {
		this.jingreso = jingreso;
	}

	public JLabel getJldisponible() {
		return jldisponible;
	}

	public void setJldisponible(JLabel jldisponible) {
		this.jldisponible = jldisponible;
	}

	public JLabel getJlcorreo() {
		return jlcorreo;
	}

	public void setJlcorreo(JLabel jlcorreo) {
		this.jlcorreo = jlcorreo;
	}

	public JLabel getJlnombrecompleto() {
		return jlnombrecompleto;
	}

	public void setJlnombrecompleto(JLabel jlnombrecompleto) {
		this.jlnombrecompleto = jlnombrecompleto;
	}

	public JLabel getJlalias() {
		return jlalias;
	}

	public void setJlalias(JLabel jlalias) {
		this.jlalias = jlalias;
	}

	public JLabel getJlestatura() {
		return jlestatura;
	}

	public void setJlestatura(JLabel jlestatura) {
		this.jlestatura = jlestatura;
	}

	public JLabel getJlingreso() {
		return jlingreso;
	}

	public void setJlingreso(JLabel jlingreso) {
		this.jlingreso = jlingreso;
	}

	public JLabel getH_titulo() {
		return h_titulo;
	}

	public void setH_titulo(JLabel h_titulo) {
		this.h_titulo = h_titulo;
	}

	public JRadioButton getBr_Disponible() {
		return br_Disponible;
	}

	public void setBr_Disponible(JRadioButton br_Disponible) {
		this.br_Disponible = br_Disponible;
	}

	public JScrollPane getLista() {
		return lista;
	}

	public void setLista(JScrollPane lista) {
		this.lista = lista;
	}

	public JButton getB_verificar() {
		return b_verificar;
	}

	public void setB_verificar(JButton b_verificar) {
		this.b_verificar = b_verificar;
	}

}