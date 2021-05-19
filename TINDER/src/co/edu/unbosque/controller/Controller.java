package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import co.edu.unbosque.view.VentanaPerfil;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.model.Operaciones;
import co.edu.unbosque.persistence.OperacionArchivo;
import co.edu.unbosque.view.VentanaAdminEliminar;
import co.edu.unbosque.view.VentanaAdminEstadisticas;
import co.edu.unbosque.view.VentanaAdminPrincipal;
import co.edu.unbosque.view.VentanaInicioSesion;
import co.edu.unbosque.view.VentanaAdminTop;
import co.edu.unbosque.view.VentanaInscripcionHombres;
import co.edu.unbosque.view.VentanaInscripcionMujer;
import co.edu.unbosque.view.VentanaOpciones;

public class Controller implements ActionListener {
	
	private VentanaAdminPrincipal vadprincipal ;
	private VentanaAdminEliminar vadeliminar;
	private VentanaAdminEstadisticas vadestadisticas;
	private VentanaInicioSesion vadtop;
	private VentanaAdminTop viniciosesion;
	private VentanaInscripcionHombres vinscripsionhombres;
	private VentanaInscripcionMujer vinscripsionmujer;
	private VentanaPerfil vperfil;
	private VentanaPrincipal vprincipal;
	private VentanaOpciones vopciones;
	

	public Controller() {
		vadprincipal = new VentanaAdminPrincipal();
		vadeliminar = new VentanaAdminEliminar();
		vadestadisticas = new VentanaAdminEstadisticas();
		vadtop = new VentanaInicioSesion();
		viniciosesion = new VentanaAdminTop();
		vinscripsionhombres = new VentanaInscripcionHombres();
		vinscripsionmujer = new VentanaInscripcionMujer() ;
		vperfil = new VentanaPerfil();
		vprincipal = new VentanaPrincipal();
		vopciones = new VentanaOpciones();
		
		asignarOyentes();
	}
	
	public void asignarOyentes() {

		vprincipal.getPrincipal().getB_admin().addActionListener(this);
		vprincipal.getPrincipal().getB_inscribirse().addActionListener(this);
		vprincipal.getPrincipal().getB_inicio().addActionListener(this);
		
		vadprincipal.getAdminprincipal().getB_eliminar().addActionListener(this);
		vadprincipal.getAdminprincipal().getB_estadisticas().addActionListener(this);
		vadprincipal.getAdminprincipal().getB_top().addActionListener(this);
		
		vadeliminar.getVadeliminar().getB_eliminar().addActionListener(this);
		vadeliminar.getVadeliminar().getB_mostrar().addActionListener(this);
		vadeliminar.getVadeliminar().getB_volveradmin().addActionListener(this);
		
		vadestadisticas.getEstadisticas().getB_buscar().addActionListener(this);
		vadestadisticas.getEstadisticas().getB_generar() .addActionListener(this);
		
		//vadtop.getAdmintop().getB_vertop().addActionListener(this);
		//vadtop.getAdmintop().getB_volveradmin().addActionListener(this);
		
		//viniciosesion.getPinicioSesion().getB_iniciar().addActionListener(this);
		
		vinscripsionhombres.getPhombres().getB_verificar().addActionListener(this);
		vinscripsionhombres.getPhombres().getBr_Disponible().addActionListener(this);
		
		vinscripsionmujer.getPmujeres().getB_verificar().addActionListener(this);
		vinscripsionmujer.getPmujeres().getBr_Disponible().addActionListener(this);
		
		vopciones.getPopciones().getBr_hombre().addActionListener(this);
		vopciones.getPopciones().getBr_mujer().addActionListener(this);
		vopciones.getPopciones().getB_continuar().addActionListener(this);
		
		vperfil.getPperfil().getB_cerrarsesion().addActionListener(this);
		vperfil.getPperfil().getB_megusta().addActionListener(this);
		vperfil.getPperfil().getB_siguiente().addActionListener(this);
		vperfil.getPperfil().getJcescoger().addActionListener(this);
		
	}

	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if (arg0.getActionCommand().equals("CREDITOS")) {
			
		} else

		if (arg0.getActionCommand().equals("VOLVER")) {
//			vJuego.setVisible(false);
//			vInstrucciones.setVisible(false);
//			vPrincipal.setVisible(true);
//
//			numerobotones.clear();
//			op.numAleatorios(contador).clear();

		}

	}

}
