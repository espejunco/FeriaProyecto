package controlador;

import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import bbdd.Conexion;
import beans.Caseta;
import beans.Opinion;

public class OpinionesControl {

	public ArrayList<Opinion> obtenerOpiniones(int idCaseta) {
		ArrayList<Opinion> opiniones = new modelo.Opiniones().getAllOpinionesByNumero(idCaseta);
		return opiniones;
	}
	
	public void crearOpinion(int id_caseta, int id_usuario, String txt) {
		if(txt.length() == 0) {
			JOptionPane.showMessageDialog(null, "Texto vacío. INCORRECTO");
		}else if(txt.length() > 250) {
			JOptionPane.showMessageDialog(null, "Texto demasiado largo. INCORRECTO");
		} else {
			new modelo.Opiniones().crearOpinion(id_caseta, id_usuario, txt);
			JOptionPane.showMessageDialog(null, "Opinión publicada");
		}
		
	}
}
