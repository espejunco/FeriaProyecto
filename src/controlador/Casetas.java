package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.Caseta;
import beans.User;

import vistas.Listado;
import vistas.Mapa;

public class Casetas {
	
	public ArrayList<Caseta> obtenerCasetas() {
		ArrayList<Caseta> casetas = new modelo.Casetas().getAllCasetas();
		return casetas;
	}
	
	public void obtenerCasetaPorNumero(int numero, String vista, User user) {
		Caseta caseta = new modelo.Casetas().getCasetaByNumero(numero);
		new vistas.CasetaVista(user, caseta, vista);
	}
	
	public Caseta obtenerCasetaPorNumero2(int numero) {
		Caseta caseta = new modelo.Casetas().getCasetaByNumero(numero);
		return caseta;
	}
	
	public void cambiarEstado(int numero, int estado) {
		if(estado == 0) {
			JOptionPane.showMessageDialog(null, "Caseta Abierta");
			new modelo.Casetas().modificarEstado(numero, 1);
		} else {
			JOptionPane.showMessageDialog(null, "Caseta Cerrada");
			new modelo.Casetas().modificarEstado(numero, 0);
		}
	}

}
