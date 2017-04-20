package control;

import java.awt.EventQueue;

import vista.G2AUI;

public class principal {
	public static void main(String[] args) {
		System.out.println("o que");
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
