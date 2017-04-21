package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class G2AUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtCompra;
	private JTextField txtVenta;
	private JLabel lblAnomalia;

	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the frame.
	 */

	public G2AUI() {
		setResizable(false);
		System.out.println("hola soy un siso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCompra = new JLabel("Compra");
		lblCompra.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompra.setBounds(65, 11, 66, 27);
		contentPane.add(lblCompra);
		
		txtCompra = new JTextField();
		txtCompra.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtCompra.setHorizontalAlignment(SwingConstants.CENTER);
		txtCompra.setBounds(43, 49, 105, 44);
		contentPane.add(txtCompra);
		txtCompra.setColumns(10);
		
		JLabel lblVenta = new JLabel("Venta");
		lblVenta.setHorizontalAlignment(SwingConstants.CENTER);
		lblVenta.setBounds(240, 11, 66, 27);
		contentPane.add(lblVenta);
		
		JButton btnProfis = new JButton("Calcular\r\n Profit");
		btnProfis.setBounds(43, 111, 146, 70);
		contentPane.add(btnProfis);
		
		txtVenta = new JTextField();
		txtVenta.setHorizontalAlignment(SwingConstants.CENTER);
		txtVenta.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtVenta.setColumns(10);
		txtVenta.setBounds(222, 49, 105, 44);
		contentPane.add(txtVenta);
		
		JLabel Anomalia = new JLabel("Anomalias:");
		Anomalia.setBounds(24, 223, 84, 14);
		contentPane.add(Anomalia);
		
		lblAnomalia = new JLabel("");
		lblAnomalia.setHorizontalAlignment(SwingConstants.LEFT);
		lblAnomalia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnomalia.setBounds(93, 212, 317, 25);
		contentPane.add(lblAnomalia);
		
		JLabel Profit = new JLabel("Profit:");
		Profit.setBounds(220, 122, 43, 14);
		contentPane.add(Profit);
		
		JLabel lblProfit = new JLabel("");
		lblProfit.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblProfit.setBounds(222, 119, 105, 42);
		contentPane.add(lblProfit);
		
		JButton btnHistrial = new JButton("Historial");
		btnHistrial.setMargin(new Insets(2, 2, 2, 2));
		btnHistrial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("pene");
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							HistorialUI frame = new HistorialUI();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnHistrial.setAlignmentY(Component.TOP_ALIGNMENT);
		btnHistrial.setHorizontalAlignment(SwingConstants.LEFT);
		btnHistrial.setBounds(368, 233, 66, 27);
		contentPane.add(btnHistrial);
	}
}
