package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.PedidoPlato;

import javax.swing.JLabel;
import javax.swing.JButton;

public class PantallaPedido extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public PantallaPedido(ArrayList<PedidoPlato> platosPedido) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pedido Total:");
		lblNewLabel.setBounds(48, 53, 115, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Direccion de entrega:");
		lblNewLabel_1.setBounds(48, 108, 169, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha pedido:");
		lblNewLabel_2.setBounds(48, 160, 156, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Realizar Pedido");
		btnNewButton.setBounds(289, 223, 156, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("DATOS DEL PEDIDO");
		lblNewLabel_3.setBounds(274, 16, 176, 26);
		contentPane.add(lblNewLabel_3);
	}
}
