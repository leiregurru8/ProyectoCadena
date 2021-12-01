package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.GestorDB;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class PantallaRegistrarse extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;


	/**
	 * Create the frame.
	 */
	public PantallaRegistrarse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistrarse = new JLabel("REGISTRARSE");
		lblRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblRegistrarse.setBounds(163, 72, 171, 45);
		contentPane.add(lblRegistrarse);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(67, 148, 91, 20);
		contentPane.add(lblNombre);
		
		JLabel lblNewLabel = new JLabel("Apellido");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(67, 203, 106, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(78, 257, 69, 20);
		contentPane.add(lblEmail);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContrasea.setBounds(48, 307, 125, 20);
		contentPane.add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(188, 147, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 202, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(188, 256, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(188, 306, 146, 26);
		contentPane.add(passwordField);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(e -> {
			String nombre = textField.getText();
			String apellidos = textField_1.getText();
			String email = textField_2.getText();
			String contrasenya = new String(passwordField.getPassword());
			
			try {
				if(GestorDB.crearCliente(nombre, apellidos, email, contrasenya)) {
					//Registro correcto
					JFrame pantallaPrincipal = new PantallaPrincipal();
					pantallaPrincipal.setVisible(true);
					dispose();
				} else {
					//Registro fallido
					JOptionPane.showMessageDialog(contentPane, "Error al registrarse, pruebe otra vez");
				}
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(contentPane, "Error al registrarse, pruebe otra vez");
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAceptar.setBounds(263, 350, 115, 29);
		contentPane.add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalir.setBounds(124, 350, 115, 29);
		contentPane.add(btnSalir);
		
	}

}
