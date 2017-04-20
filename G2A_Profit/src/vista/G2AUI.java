package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class G2AUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtCompra;
	private JTextField txtVenta;

	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the frame.
	 */

	public G2AUI() {
		System.out.println("hola soy un siso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCompra = new JLabel("Compra");
		lblCompra.setBounds(65, 11, 46, 14);
		contentPane.add(lblCompra);
		
		txtCompra = new JTextField();
		txtCompra.setBounds(43, 36, 86, 20);
		contentPane.add(txtCompra);
		txtCompra.setColumns(10);
		
		JLabel lblVenta = new JLabel("Venta");
		lblVenta.setBounds(263, 11, 46, 14);
		contentPane.add(lblVenta);
		
		txtVenta = new JTextField();
		txtVenta.setBounds(242, 36, 86, 20);
		contentPane.add(txtVenta);
		txtVenta.setColumns(10);
		
		JButton btnProfis = new JButton("PROFIT");
		btnProfis.setBounds(31, 91, 89, 23);
		contentPane.add(btnProfis);
	}
}
