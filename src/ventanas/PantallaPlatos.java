package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Cliente;
import clases.GestorDB;
import clases.Plato;
import clases.Restaurante;
import clases.TipoPlato;
import clases.TipoRestaurante;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaPlatos extends JFrame {

	private JPanel contentPane;
	private JFrame pantallaAnterior;
	private Restaurante restaurante;
	private ArrayList<Plato> platos;


	/**
	 * Create the frame.
	 */
	public PantallaPlatos(JFrame pantallaAnterior, Restaurante restaurante) {
		this.pantallaAnterior = pantallaAnterior;
		this.restaurante = restaurante;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHola = new JLabel(this.restaurante.getNombre());
		lblHola.setFont(new Font("Arial", Font.BOLD, 32));
		lblHola.setBounds(25, 27, 783, 39);
		contentPane.add(lblHola);
		
		JLabel lblTusPlatos = new JLabel("Tipos de platos");
		lblTusPlatos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTusPlatos.setBounds(25, 82, 136, 28);
		contentPane.add(lblTusPlatos);
		
		JComboBox comboBox = new JComboBox(GestorDB.getTipoPlatoPorRestaurante(this.restaurante.getIdRest()));
		comboBox.addActionListener(e -> {
			TipoPlato tipoPlato = (TipoPlato) comboBox.getSelectedItem();
			this.platos = GestorDB.getPlatosPorRestauranteYTipo(this.restaurante.getIdRest(), tipoPlato.getIdTipoPlato());
		});
		comboBox.setBounds(25, 119, 193, 26);
		contentPane.add(comboBox);
		
		JLabel lblPlatos = new JLabel("Platos");
		lblPlatos.setFont(new Font("Arial", Font.BOLD, 19));
		lblPlatos.setBounds(25, 193, 69, 20);
		contentPane.add(lblPlatos);

		
	}
}
