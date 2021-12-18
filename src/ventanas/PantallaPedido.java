package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.GestorDB;
import clases.PedidoPlato;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class PantallaPedido extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;



	/**
	 * Create the frame.
	 */
	public PantallaPedido(ArrayList<PedidoPlato> platosPedido, double valorPedido) {
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
		
		JButton btnNewButton = new JButton("Realizar Pedido"); //insert en pedido
		btnNewButton.setBounds(289, 223, 156, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("DATOS DEL PEDIDO");
		lblNewLabel_3.setBounds(274, 16, 176, 26);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(280, 103, 165, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(278, 150, 167, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("precio");
		lblNewLabel_4.setBounds(289, 57, 61, 16);
		lblNewLabel_4.setText(valorPedido + "");
		contentPane.add(lblNewLabel_4);
		
		
		btnNewButton.addActionListener(e->{
			
			String direccion = textField.getText();
			String fecha = textField_1.getText();
			
			//aqui la insert
			GestorDB.insertPedido(platosPedido.get(0).getIdPedido(), 1 ,direccion, fecha);
			
			
		});
		
	}
}
