package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Cliente;
import clases.GestorDB;
import clases.Restaurante;
import clases.TipoRestaurante;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
		
		JButton btnVerRestaurante = new JButton("Ver restaurante");
		btnVerRestaurante.addActionListener(e -> {
			Restaurante restaurante = (Restaurante) list_1.getSelectedValue();
			PantallaPlatos ventanaRestaurante = new PantallaPlatos(this, restaurante);
			ventanaRestaurante.setVisible(true);
			this.setVisible(false);
			
		});
		btnVerRestaurante.setEnabled(false);
		btnVerRestaurante.setBounds(661, 118, 151, 29);
		contentPane.add(btnVerRestaurante);
		
		list.addListSelectionListener(e -> {
			TipoRestaurante tipoRestaurante = (TipoRestaurante) list.getSelectedValue();
			ArrayList<Restaurante> restaurantes = GestorDB.getRestaurantesPorTipo(tipoRestaurante.getIdTipoRestaurante());
			DefaultListModel<Restaurante> model = new DefaultListModel<>();
			for(Restaurante r : restaurantes) {
				model.addElement(r);
			}	         
			list_1.setModel(model);
		});
		
		list_1.addListSelectionListener(e -> {
			btnVerRestaurante.setEnabled(true);
		});
	}
}
