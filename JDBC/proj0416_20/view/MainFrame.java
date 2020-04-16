package swingMvc_h2.proj0416_20.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import swingMvc_h2.proj0416_20.resource.R;

public class MainFrame extends JFrame implements R{
		public JFrame frame = new JFrame();

	public MainFrame() {
	
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(245, 255, 250));
		frame.setBounds(100, 100, 774, 641);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel main =(JPanel) frame.getContentPane();
		main.setLayout(null);
		
		
		main.add(titleView);
		titleView.setBounds(400, 35, 296, 64);
		titleView.setBackground(new Color(245, 255, 250));
		
		main.add(inputView);
		inputView.setBounds(411, 93, 296, 399);
		
	}
	
	
}
