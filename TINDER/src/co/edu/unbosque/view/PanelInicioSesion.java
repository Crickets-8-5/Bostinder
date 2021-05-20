package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PanelInicioSesion extends JPanel {

	private JLabel e_titulo, e_usuario, e_contra;
	private JButton b_ingresar, b_volver;
	private JTextField jusuario;
	private JPasswordField jcontra;

	public PanelInicioSesion() {
		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		setBackground(new Color(222, 222, 222));
		setBorder(new LineBorder(new Color(190, 255, 237)));

		e_titulo = new JLabel("Iniciar Sesion");
		e_titulo.setForeground(Color.WHITE);
		e_titulo.setFont(new Font("Algerian", 20, 35));
		e_titulo.setBounds(120, 60, 264, 45);
		add(e_titulo);
		
		e_usuario = new JLabel("Usuario:");
		e_usuario.setForeground(Color.WHITE);
		e_usuario.setBounds(150, 130, 50, 25);
		add(e_usuario);
		
		e_contra = new JLabel("Contraseña:");
		e_contra.setForeground(Color.WHITE);
		e_contra.setBounds(130, 170, 80, 25);
		add(e_contra);
		
		jusuario = new JTextField();
		jusuario.setBounds(220, 130, 180, 25);
		add(jusuario);
		
		jcontra = new JPasswordField();
		jcontra.setBounds(220, 170, 180, 25);
		add(jcontra);

		b_ingresar = new JButton("Iniciar Sesion");
		buttons(b_ingresar, "INISESION", 160, 230, 155, 30);
		
		b_volver = new JButton("Volver");
		buttons(b_volver, "VOLVER", 400, 325, 70, 20);
		
	}
	
	private void buttons(JButton button, String action,int x, int y, int w, int h) {
		button.setActionCommand(action);
		button.setBounds(x, y, w, h);
		button.setBackground(Color.lightGray);
		add(button);
	}
	
	

	public JLabel getE_titulo() {
		return e_titulo;
	}

	public void setE_titulo(JLabel e_titulo) {
		this.e_titulo = e_titulo;
	}

	public JButton getB_admin() {
		return b_ingresar;
	}

	public void setB_admin(JButton b_admin) {
		this.b_ingresar = b_admin;
	}

	public JButton getB_registrar() {
		return b_volver;
	}

	public void setB_registrar(JButton b_registrar) {
		this.b_volver = b_registrar;
	}

}
