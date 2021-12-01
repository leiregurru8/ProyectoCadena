package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Cliente;
import clases.GestorDB;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class PantallaInicio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorDB.conectar();
					PantallaInicio frame = new PantallaInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(181, 101, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(181, 143, 146, 26);
		contentPane.add(passwordField);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(50, 104, 90, 20);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContrasea.setBounds(50, 146, 116, 20);
		contentPane.add(lblContrasea);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaRegistrarse pantallaRegistrarse = new PantallaRegistrarse();
				pantallaRegistrarse.setVisible(true);
				dispose();
			}
		});
		btnRegistrarse.setBounds(15, 199, 115, 29);
		contentPane.add(btnRegistrarse);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(e -> {
			String email = textField.getText();
			String contrasenya = new String(passwordField.getPassword());
			try {
				ResultSet res = GestorDB.iniciarSesion(email, contrasenya);
				if (res.next()) {
					//Login valido
					Cliente.idCliente = res.getInt("idCliente");
					Cliente.nombre = res.getString("Nombre");
					Cliente.apellidos = res.getString("Apellidos");
					Cliente.email = res.getString("Email");
					JFrame pantallaPrincipal = new PantallaPrincipal();
					pantallaPrincipal.setVisible(true);
					dispose();
				} else {
					//Login invalido
					JOptionPane.showMessageDialog(contentPane, "Usuario o contrasena erroneos, pruebe otra vez");
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		btnAceptar.setBounds(159, 199, 115, 29);
		contentPane.add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(298, 199, 115, 29);
		contentPane.add(btnSalir);
		
		JLabel lblInicioSesin = new JLabel("INICIO SESI\u00D3N");
		lblInicioSesin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblInicioSesin.setBounds(113, 60, 150, 20);
		contentPane.add(lblInicioSesin);
	}
}
