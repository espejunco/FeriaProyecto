package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import beans.User;
import beans.Caseta;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Listado extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public Listado() {
		this( new User() );
	}

	public Listado(User user) {
		
		//Generar Casetas
		ArrayList<Caseta> casetas =  new controlador.Casetas().obtenerCasetas();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 384);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton goBackButton = new JButton("< Volver");
		goBackButton.setFont(new Font("Arial", Font.BOLD, 14));
		goBackButton.setBackground(Color.LIGHT_GRAY);
		goBackButton.setBounds(638, 292, 109, 43);
		panel.add(goBackButton);
		
		/* Crear la tabla con su modelo */
		DefaultTableModel dtm = new DefaultTableModel();
		table = new JTable(dtm);
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.setBounds(0, 60, 684, 285);
		panel.add(table);
		
		JButton btnNewButton = new JButton("22");
		btnNewButton.setBounds(682, 74, 65, 12);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("97");
		btnNewButton_1.setBounds(682, 91, 65, 12);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("153");
		btnNewButton_1_1.setBounds(682, 108, 65, 12);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("215");
		btnNewButton_1_2.setBounds(682, 124, 65, 12);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("82");
		btnNewButton_1_3.setBounds(682, 140, 65, 12);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("85");
		btnNewButton_1_4.setBounds(682, 156, 65, 12);
		panel.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("61");
		btnNewButton_1_5.setBounds(682, 172, 65, 12);
		panel.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("225");
		btnNewButton_1_6.setBounds(682, 188, 65, 12);
		panel.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("13");
		btnNewButton_1_7.setBounds(682, 204, 65, 12);
		panel.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("77");
		btnNewButton_1_8.setBounds(682, 220, 65, 12);
		panel.add(btnNewButton_1_8);
		
		JLabel lblListadoDeCasetas = new JLabel("LISTADO DE CASETAS");
		lblListadoDeCasetas.setFont(new Font("Arial", Font.BOLD, 15));
		lblListadoDeCasetas.setBounds(10, 11, 231, 26);
		panel.add(lblListadoDeCasetas);
		/* Crear las columnas */
		dtm.addColumn("Nombre");
		dtm.addColumn("Calle");
		dtm.addColumn("Numero");
		dtm.addColumn("Aforo");
		dtm.addColumn("Estado");
		
		Object[] filaInicial = new Object[5];
		filaInicial[0] = "NOMBRE";
		filaInicial[1] = "CALLE";
		filaInicial[2] = "NUMERO";
		filaInicial[3] = "AFORO";
		filaInicial[4] = "ESTADO";
		dtm.addRow(filaInicial);
		
		for(Caseta caseta : casetas) {
			Object[] fila = new Object[5];
			fila[0] = caseta.getNombre();
			fila[1] = caseta.getCalle();
			fila[2] = caseta.getNumero();
			fila[3] = caseta.getAforo();
			if (caseta.getEstado() == 1) {
				fila[4] = "Abierto";
			} else {
				fila[4] = "Cerrado";
			}
			dtm.addRow(fila);			
		}

		// Acciones

		goBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Principal principal = new vistas.Principal();
				principal.setVisible(true);
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(97, "listado", user);
			}
		});
		
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(85, "listado", user);
			}
		});
		
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(215, "listado", user);
			}
		});
		
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(153, "listado", user);
			}
		});
		
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(82, "listado", user);
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(22, "listado", user);
			}
		});
		
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(77, "listado", user);
			}
		});
		
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(13, "listado", user);
			}
		});
		
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(225, "listado", user);
			}
		});
		
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(61, "listado", user);
			}
		});

	}
}