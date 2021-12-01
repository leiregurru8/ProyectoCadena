package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Cliente;
import clases.GestorDB;
import clases.TipoRestaurante;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class PantallaPrincipal extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public PantallaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEligeTuComida = new JLabel("Elige tu tipo de comida:");
		lblEligeTuComida.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEligeTuComida.setBounds(25, 82, 226, 20);
		contentPane.add(lblEligeTuComida);
		
		JLabel lblHola = new JLabel("Hola, " + Cliente.nombre);
		lblHola.setFont(new Font("Arial", Font.BOLD, 32));
		lblHola.setBounds(25, 27, 326, 39);
		contentPane.add(lblHola);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 118, 262, 292);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		
		list.setFont(new Font("Arial", Font.PLAIN, 24));
		list.setModel(GestorDB.getTiposRestaurantes());
		scrollPane.setViewportView(list);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(349, 118, 262, 292);
		contentPane.add(scrollPane_1);
		
		JList list_1 = new JList();
		scrollPane_1.setViewportView(list_1);
		
		list.addListSelectionListener(e -> {
			TipoRestaurante tipoRestaurante = (TipoRestaurante) list.getSelectedValue();
			list_1.setModel(GestorDB.getRestaurantesPorTipo(tipoRestaurante.getIdTipoRestaurante()));
		});
	}
}
