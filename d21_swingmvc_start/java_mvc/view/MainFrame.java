package java_mvc.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java_mvc.resource.R;

public class MainFrame extends JFrame implements R {
	JPanel mainPane = null;
	
	
	public MainFrame() {
		mainPane = (JPanel)getContentPane();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		add(BorderLayout.NORTH, new TitleView());
		add(BorderLayout.WEST, listView);
		add(BorderLayout.CENTER,new InputView());
		add(BorderLayout.SOUTH, new ButtonView());
		
		
		
		setSize(750,550);
		setVisible(true);
	}
	
	
	
}
