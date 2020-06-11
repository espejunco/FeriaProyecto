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
import javax.swing.ImageIcon;

public class Mapa extends JFrame {

	private JPanel contentPane;

	public Mapa() {
		this(new User());
		setResizable(false);
	}

	public Mapa(User user) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 384);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JButton button = new JButton("97");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(98, 96, 51, 23);
		panel.add(button);

		JButton button_1 = new JButton("85");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setBounds(184, 40, 51, 23);
		panel.add(button_1);

		JButton button_2 = new JButton("215");
		button_2.setBounds(355, 40, 62, 23);
		panel.add(button_2);

		JButton button_3 = new JButton("153");
		button_3.setBounds(259, 40, 62, 23);
		panel.add(button_3);

		JButton button_4 = new JButton("82");
		button_4.setBounds(518, 52, 58, 23);
		panel.add(button_4);

		JButton button_5 = new JButton("22");
		button_5.setBounds(487, 146, 51, 23);
		panel.add(button_5);

		JButton button_6 = new JButton("77");
		button_6.setBounds(487, 82, 51, 23);
		panel.add(button_6);

		JButton button_7 = new JButton("13");
		button_7.setBounds(487, 206, 51, 23);
		panel.add(button_7);

		JButton button_9 = new JButton("225");
		button_9.setBounds(446, 40, 62, 23);
		panel.add(button_9);

		JButton button_10 = new JButton("61");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
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

	}
}