package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class PanelOpciones extends JPanel {

	
	
	private JRadioButton br_hombre, br_mujer;
	private JButton b_continuar;
	private JTextArea jedad;
	


	public PanelOpciones() {
		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		setBorder(new LineBorder(Color.darkGray));
		
		jedad = new JTextArea("");
		jedad.setBounds(170, 20, 160, 60);
		jedad.setBorder(new LineBorder(null));
		jedad.setFont(jedad.getFont().deriveFont(35f));
		jedad.setEditable(false);
		add(jedad);

		br_hombre = new JRadioButton();
		br_hombre.setBackground(Color.GREEN);
		br_hombre.setActionCommand("UNO");
		br_hombre.setBounds(100, 100, 160, 160);
		add(br_hombre);

		br_mujer= new JRadioButton();
		br_mujer.setBackground(Color.RED);
		br_mujer.setActionCommand("DOS");
		br_mujer.setBounds(262, 100, 160, 160);
		add(br_mujer);
		
		b_continuar = new JButton();
		b_continuar.setBackground(Color.GREEN);
		b_continuar.setActionCommand("UNO");
		b_continuar.setBounds(100, 100, 160, 160);
		add(b_continuar);

	}

	public JRadioButton getBr_hombre() {
		return br_hombre;
	}

	public void setBr_hombre(JRadioButton br_hombre) {
		this.br_hombre = br_hombre;
	}

	public JRadioButton getBr_mujer() {
		return br_mujer;
	}

	public void setBr_mujer(JRadioButton br_mujer) {
		this.br_mujer = br_mujer;
	}

	public JButton getB_continuar() {
		return b_continuar;
	}

	public void setB_continuar(JButton b_continuar) {
		this.b_continuar = b_continuar;
	}

	public JTextArea getJedad() {
		return jedad;
	}

	public void setJedad(JTextArea jedad) {
		this.jedad = jedad;
	}



}
