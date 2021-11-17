package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaPrincipal extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public PantallaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEligeTuComida = new JLabel("Elige tu tipo de comida:");
		lblEligeTuComida.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEligeTuComida.setBounds(25, 62, 226, 20);
		contentPane.add(lblEligeTuComida);
		
		JButton btnItaliano = new JButton("ITALIANO");
		btnItaliano.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnItaliano.setBounds(61, 112, 138, 75);
		contentPane.add(btnItaliano);
		
		JButton btnChino = new JButton("CHINO");
		btnChino.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChino.setBounds(234, 111, 138, 76);
		contentPane.add(btnChino);
		
		JButton btnMexicano = new JButton("MEXICANO");
		btnMexicano.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMexicano.setBounds(61, 215, 138, 75);
		contentPane.add(btnMexicano);
		
		JButton btnTurco = new JButton("TURCO");
		btnTurco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTurco.setBounds(234, 213, 138, 77);
		contentPane.add(btnTurco);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalir.setBounds(163, 315, 115, 29);
		contentPane.add(btnSalir);
	}

}
