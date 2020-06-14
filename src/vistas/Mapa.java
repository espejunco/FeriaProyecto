package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Caseta;
import beans.User;
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
import javax.swing.JSeparator;

public class Mapa extends JFrame {

	private JPanel contentPane;

	public Mapa() {
		this( new User() );
		setResizable(false);
	}

	public Mapa(User user) {
		
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
		
		Caseta caseta1 = new controlador.Casetas().obtenerCasetaPorNumero2(97);
		JButton button = new JButton("97");
		if(caseta1.getEstado() == 1) {
			button.setBackground(new Color(50, 205, 50));
		}else {
			button.setBackground(Color.RED);
		}
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(98, 96, 51, 23);
		panel.add(button);

		Caseta caseta2 = new controlador.Casetas().obtenerCasetaPorNumero2(85);
		JButton button_1 = new JButton("85");
		if(caseta2.getEstado() == 1) {
			button_1.setBackground(new Color(50, 205, 50));
		}else {
			button_1.setBackground(Color.RED);
		}
		button_1.setBounds(184, 40, 51, 23);
		panel.add(button_1);

		Caseta caseta18 = new controlador.Casetas().obtenerCasetaPorNumero2(215);
		JButton button_2 = new JButton("215");
		if(caseta18.getEstado() == 1) {
			button_2.setBackground(new Color(50, 205, 50));
		}else {
			button_2.setBackground(Color.RED);
		}
		button_2.setBounds(355, 40, 62, 23);
		panel.add(button_2);

		Caseta caseta3 = new controlador.Casetas().obtenerCasetaPorNumero2(153);
		JButton button_3 = new JButton("153");
		if(caseta3.getEstado() == 1) {
			button_3.setBackground(new Color(50, 205, 50));
		}else {
			button_3.setBackground(Color.RED);
		}
		button_3.setBounds(259, 40, 62, 23);
		panel.add(button_3);

		Caseta caseta4 = new controlador.Casetas().obtenerCasetaPorNumero2(82);
		JButton button_4 = new JButton("82");
		if(caseta4.getEstado() == 1) {
			button_4.setBackground(new Color(50, 205, 50));
		}else {
			button_4.setBackground(Color.RED);
		}
		button_4.setBounds(518, 52, 58, 23);
		panel.add(button_4);

		Caseta caseta5 = new controlador.Casetas().obtenerCasetaPorNumero2(22);
		JButton button_5 = new JButton("22");
		if(caseta5.getEstado() == 1) {
			button_5.setBackground(new Color(50, 205, 50));
		}else {
			button_5.setBackground(Color.RED);
		}
		button_5.setBounds(487, 146, 51, 23);
		panel.add(button_5);

		Caseta caseta6 = new controlador.Casetas().obtenerCasetaPorNumero2(77);
		JButton button_6 = new JButton("77");
		if(caseta6.getEstado() == 1) {
			button_6.setBackground(new Color(50, 205, 50));
		}else {
			button_6.setBackground(Color.RED);
		}
		button_6.setBounds(487, 82, 51, 23);
		panel.add(button_6);

		Caseta caseta7 = new controlador.Casetas().obtenerCasetaPorNumero2(13);
		JButton button_7 = new JButton("13");
		if(caseta7.getEstado() == 1) {
			button_7.setBackground(new Color(50, 205, 50));
		}else {
			button_7.setBackground(Color.RED);
		}
		button_7.setBounds(487, 206, 51, 23);
		panel.add(button_7);

		Caseta caseta8 = new controlador.Casetas().obtenerCasetaPorNumero2(225);
		JButton button_9 = new JButton("225");
		if(caseta8.getEstado() == 1) {
			button_9.setBackground(new Color(50, 205, 50));
		}else {
			button_9.setBackground(Color.RED);
		}
		button_9.setBounds(446, 40, 62, 23);
		panel.add(button_9);

		Caseta caseta10 = new controlador.Casetas().obtenerCasetaPorNumero2(61);
		JButton button_10 = new JButton("61");
		if(caseta10.getEstado() == 1) {
			button_10.setBackground(new Color(50, 205, 50));
		}else {
			button_10.setBackground(Color.RED);
		}
		button_10.setBounds(32, 171, 51, 23);
		panel.add(button_10);

		JButton goBackButton = new JButton("< Volver");
		goBackButton.setFont(new Font("Arial", Font.BOLD, 14));
		goBackButton.setBackground(Color.LIGHT_GRAY);
		goBackButton.setBounds(467, 294, 109, 43);
		panel.add(goBackButton);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Mapa.class.getResource("/imagenes/mapa.jpg")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 576, 337);
		panel.add(label);

		// Acciones

		goBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Principal principal = new vistas.Principal();
				principal.setVisible(true);
			}
		});
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(97, "mapa", user);
			}
		});
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(85, "mapa", user);
			}
		});
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(215, "mapa", user);
			}
		});
		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(153, "mapa", user);
			}
		});
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(82, "mapa", user);
			}
		});
		
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(22, "mapa", user);
			}
		});
		
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(77, "mapa", user);
			}
		});
		
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(13, "mapa", user);
			}
		});
		
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(225, "mapa", user);
			}
		});
		
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new controlador.Casetas().obtenerCasetaPorNumero(61, "mapa", user);
			}
		});

	}
}