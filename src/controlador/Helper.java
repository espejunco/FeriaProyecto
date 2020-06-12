package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.User;
import beans.Caseta;

public class Helper {

	public ArrayList<User> setUserArrayList(ResultSet resultados) {
		// Ya tengo los datos de la BBDD
		// Voy a transformarlos a objetos
		ArrayList<User> arraylist = new ArrayList<User>();
		try {
			while (resultados.next()) {
				int id = resultados.getInt("id");
				String nombre = resultados.getString("nombre");
				String password = resultados.getString("password");
				arraylist.add(new User(id, nombre, password));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de usuarios");
		}

		return arraylist;
	}

	public User setUserObject(ResultSet resultado) {
		try {
			if (resultado.next()) {
				int id = resultado.getInt("id");
				String nombre = resultado.getString("nombre");
				String password = resultado.getString("password");
				User user = new User(id, nombre, password);
				return user;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de usuarios");
		}
		return null;
	}
	
	public ArrayList<Caseta> setCasetaArrayList(ResultSet resultados) {
		// Ya tengo los datos de la BBDD
		// Voy a transformarlos a objetos
		ArrayList<Caseta> arraylist = new ArrayList<Caseta>();
		try {
			while (resultados.next()) {
				int id = resultados.getInt("id");
				String nombre = resultados.getString("nombre");
				String calle = resultados.getString("calle");
				int numero = resultados.getInt("numero");
				int aforo = resultados.getInt("aforo");
				int estado = resultados.getInt("estado");
				arraylist.add(new Caseta(id, nombre, calle, numero, aforo, estado));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de casetas");
		}

		return arraylist;
	}

	public Caseta setCasetaObject(ResultSet resultado) {
		try {
			if (resultado.next()) {
				int id = resultado.getInt("id");
				String nombre = resultado.getString("nombre");
				String calle = resultado.getString("calle");
				int numero = resultado.getInt("numero");
				int aforo = resultado.getInt("aforo");
				int estado = resultado.getInt("estado");
				Caseta caseta = new Caseta(id, nombre, calle, numero, aforo, estado);
				return caseta;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de casetas");
		}
		return null;
	}

}