package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Cliente;
import clases.GestorDB;
import clases.PedidoPlato;
import clases.Plato;
import clases.Restaurante;
import clases.TipoPlato;
import clases.TipoRestaurante;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class PantallaPlatos extends JFrame {

	private JPanel contentPane;
	private JFrame pantallaAnterior;
	private Restaurante restaurante;
	private DefaultListModel<Plato> platos;
	private int cantidad = 1;
	private ArrayList<PedidoPlato> platosPedido = new ArrayList<>();


	/**
	 * Create the frame.
	 */
	public PantallaPlatos(JFrame pantallaAnterior, Restaurante restaurante) {
		this.pantallaAnterior = pantallaAnterior;
		this.restaurante = restaurante;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 520);
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
		comboBox.setBounds(25, 119, 193, 26);
		contentPane.add(comboBox);
		
		JLabel lblPlatos = new JLabel("Platos");
		lblPlatos.setFont(new Font("Arial", Font.BOLD, 19));
		lblPlatos.setBounds(25, 193, 69, 20);
		contentPane.add(lblPlatos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 241, 193, 184);
		contentPane.add(scrollPane);
		
		this.platos = GestorDB.getPlatosPorRestauranteYTipo(this.restaurante.getIdRest(), 0);
		
		JList list = new JList(this.platos);
		
		scrollPane.setViewportView(list);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(434, 100, 349, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(434, 135, 349, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(434, 171, 349, 20);
		contentPane.add(lblNewLabel_2);
		
		JButton btnAadirAlPedido = new JButton("A\u00F1adir al pedido");
		
		btnAadirAlPedido.setBounds(619, 239, 164, 29);
		contentPane.add(btnAadirAlPedido);
		btnAadirAlPedido.setVisible(false);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(434, 212, 69, 20);
		contentPane.add(lblCantidad);
		lblCantidad.setVisible(false);
		
		JButton button = new JButton("-");
		
		button.setEnabled(false);
		button.setBounds(434, 239, 45, 29);
		button.setVisible(false);
		contentPane.add(button);
		
		JLabel label = new JLabel(this.cantidad + "");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(493, 243, 31, 20);
		contentPane.add(label);
		label.setVisible(false);
		
		JButton button_1 = new JButton("+");
		button.addActionListener(e -> {
			button_1.setEnabled(true);
			this.cantidad--;
			if (this.cantidad == 1) button.setEnabled(false);
			label.setText(this.cantidad + "");
		});
		button_1.addActionListener(e -> {
			button.setEnabled(true);
			this.cantidad++;
			if (this.cantidad == 10) button_1.setEnabled(false);
			label.setText(this.cantidad + "");
		});
		button_1.setBounds(540, 239, 45, 29);
		contentPane.add(button_1);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaPedido pantallaPedido = new PantallaPedido(platosPedido);
				pantallaPedido.setVisible(true);
				dispose();
			}
		});
		btnSiguiente.setBounds(668, 396, 115, 29);
		contentPane.add(btnSiguiente);
		button_1.setVisible(false);
		
		comboBox.addActionListener(e -> {
			TipoPlato tipoPlato = (TipoPlato) comboBox.getSelectedItem();
			this.platos = GestorDB.getPlatosPorRestauranteYTipo(this.restaurante.getIdRest(), tipoPlato.getIdTipoPlato());
			list.setModel(this.platos);
		});

		
		list.addListSelectionListener(e -> {
			lblNewLabel.setVisible(true);
			lblNewLabel_1.setVisible(true);
			lblNewLabel_2.setVisible(true);
			button.setVisible(true);
			button_1.setVisible(true);
			lblCantidad.setVisible(true);
			btnAadirAlPedido.setVisible(true);
			label.setVisible(true);
			Plato p = (Plato) list.getSelectedValue();
			if (p != null) {
				lblNewLabel.setText(p.getNombre());
				lblNewLabel_1.setText(p.getDescription());
				lblNewLabel_2.setText(p.getPrecio() + "€");
			}
			
		});
		
		btnAadirAlPedido.addActionListener(e -> {
			platosPedido.add(new PedidoPlato(((Plato) list.getSelectedValue()).getIdPlato(), this.cantidad));
			
			list.clearSelection();
			lblNewLabel.setVisible(false);
			lblNewLabel_1.setVisible(false);
			lblNewLabel_2.setVisible(false);
			button.setVisible(false);
			button.setEnabled(false);
			button_1.setVisible(false);
			button_1.setEnabled(true);
			lblCantidad.setVisible(false);
			btnAadirAlPedido.setVisible(false);
			label.setVisible(false);
			this.cantidad = 1;
			label.setText(this.cantidad + "");
		});
		
	}
}
