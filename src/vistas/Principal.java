package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.User;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class Principal extends JFrame {

	private JPanel contentPane;

	public Principal() {
		this(new User());
	}

	public Principal(User user) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Bienvenido " + user.getNombre());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 66, 424, 21);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(lblNewLabel);

		JButton ajustesButton = new JButton("Ajustes");
		ajustesButton.setBackground(SystemColor.activeCaptionBorder);
		ajustesButton.setBounds(332, 8, 82, 23);
		panel.add(ajustesButton);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesion.setBounds(10, 8, 123, 23);
		panel.add(btnCerrarSesion);
		btnCerrarSesion.setToolTipText("");
		btnCerrarSesion.setBackground(SystemColor.activeCaptionBorder);
		btnCerrarSesion.setForeground(SystemColor.desktop);
		
		JButton btnExplorar = new JButton("EXPLORAR");
		btnExplorar.setBackground(SystemColor.info);
		btnExplorar.setBounds(153, 115, 116, 79);
		panel.add(btnExplorar);

		// Acciones
		
		btnExplorar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new vistas.Mapa(user);
			}
		});

		ajustesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new vistas.Ajustes(user);
			}
		});
		
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Login loginNuevo = new vistas.Login();
				loginNuevo.setVisible(true);
			}
		});
	}

}