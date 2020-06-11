package main;

import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;

import bbdd.Conexion;
import vistas.Login;

public class Main {

	public static void main(String[] args) throws SQLException {
		/* Conecto con la base de datos */
		Conexion.Conectar();

		/* Arranco la interfaz gr�fica */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}