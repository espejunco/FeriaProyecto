package modelo;

import java.sql.ResultSet;
import java.util.ArrayList;

import bbdd.Conexion;
import beans.Opinion;

public class Opiniones {
	
	public ArrayList<Opinion> getAllOpinionesByNumero(int idCaseta) {
		ResultSet resultados = Conexion.EjecutarSentencia("SELECT opinion.txt, user.nombre FROM opinion, casetas, user  WHERE opinion.id_caseta = casetas.id AND opinion.id_usuario = user.id AND opinion.id_caseta =  '" + idCaseta + "';");
		ArrayList<Opinion> opiniones = new controlador.Helper().setOpinionArrayList(resultados);
		return opiniones;
	}
	
	public void crearOpinion(int id_caseta, int id_usuario, String txt) {
		Conexion.EjecutarUpdate("INSERT INTO opinion (id_caseta, id_usuario, txt) VALUES ('" + id_caseta + "', '" + id_usuario + "', '" + txt + "');");
	}
	
}
