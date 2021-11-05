package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

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
		btnRegistrarse.setBounds(15, 199, 115, 29);
		contentPane.add(btnRegistrarse);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(159, 199, 115, 29);
		contentPane.add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(298, 199, 115, 29);
		contentPane.add(btnSalir);
		
		JLabel lblInicioSesin = new JLabel("INICIO SESI\u00D3N");
		lblInicioSesin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblInicioSesin.setBounds(113, 60, 150, 20);
		contentPane.add(lblInicioSesin);
	}
}
