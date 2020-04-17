package proj.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import proj.resourse.R;

public class MainView extends JFrame implements R {
	JPanel content = null;
	
	public MainView() {
		content=(JPanel)getContentPane();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		content.setLayout(null);
		
		add(titleView);
		titleView.setBounds(600, 35, 290, 65);
		add(inputView);
		inputView.setBounds(570, 100, 350, 350);
		inputView.setBackground(new Color(255, 255, 255));
		
		add(buttonView);
		buttonView.setBounds(520, 470, 450, 100);
		
		add(listView);
		listView.setBounds(30, 50, 500, 500);
		
		
		setResizable(false);
		setSize(1000, 600);
		
	}
	
	
}
