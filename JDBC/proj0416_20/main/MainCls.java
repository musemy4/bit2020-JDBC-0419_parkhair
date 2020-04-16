package swingMvc_h2.proj0416_20.main;

import java.awt.EventQueue;

import reference.Mon;
import swingMvc_h2.proj0416_20.view.MainFrame;

public class MainCls {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
		});
	}
}