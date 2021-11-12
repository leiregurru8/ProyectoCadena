package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class PantallaPlatos extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public PantallaPlatos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTusPlatos = new JLabel("Tus platos:");
		lblTusPlatos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTusPlatos.setBounds(36, 76, 136, 28);
		contentPane.add(lblTusPlatos);
	}

}
