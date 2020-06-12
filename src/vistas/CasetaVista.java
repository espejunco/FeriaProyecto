package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import beans.User;
import beans.Caseta;

public class CasetaVista extends JFrame {

	private JPanel contentPane;

	public CasetaVista() {
		this(new User(), new Caseta(), "vista");
	}

	public CasetaVista(User user, Caseta caseta, String vista) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 384);
		setVisible(true);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel(""+caseta.getNumero());
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 99));
		label.setBounds(190, 65, 206, 174);
		panel.add(label);
		
		JButton goBackButton = new JButton("< Volver");
		goBackButton.setFont(new Font("Arial", Font.BOLD, 14));
		goBackButton.setBackground(Color.LIGHT_GRAY);
		goBackButton.setBounds(467, 294, 109, 43);
		panel.add(goBackButton);
		
		JButton btnEstado = new JButton("ESTADO");
		btnEstado.setBackground(Color.LIGHT_GRAY);
		btnEstado.setBounds(477, 11, 89, 23);
		panel.add(btnEstado);

		// Acciones
		
		btnEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new controlador.Casetas().cambiarEstado(caseta.getNumero(), caseta.getEstado());
			}
		});

		goBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (vista.equals("mapa")) {
					Mapa mapa = new vistas.Mapa();
					mapa.setVisible(true);
				} else {
					Listado listado = new vistas.Listado();
					listado.setVisible(true);
				}
				setVisible(false);
			}
		});
		
		

	}
}