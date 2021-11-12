package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PantallaFinal extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public PantallaFinal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Su pedido se ha realizado correctamente.");
		lblNewLabel.setBounds(71, 73, 263, 29);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.setBounds(123, 184, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("En breves momentos se realizará el envio.");
		lblNewLabel_1.setBounds(71, 101, 277, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Muchas gracias");
		lblNewLabel_2.setBounds(137, 137, 125, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Confirmación de pedido");
		lblNewLabel_3.setBounds(114, 31, 190, 16);
		contentPane.add(lblNewLabel_3);
	}

}
