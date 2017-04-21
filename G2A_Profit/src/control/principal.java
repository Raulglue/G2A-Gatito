package control;

import java.awt.EventQueue;

import vista.G2AUI;
import vista.HistorialUI;

public class principal {
	public static void main(String[] args) {
		System.out.println("soy feo");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					G2AUI frame = new G2AUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
}
