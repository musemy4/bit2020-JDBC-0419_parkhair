package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import resource.R;

public class MainFrame extends JFrame implements R{
	JPanel content = null;
	
	public MainFrame() {
		content =(JPanel)getContentPane();//하나만 담을
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel east = new JPanel(new GridLayout(4,1));
		east.add(new TitleView());
		east.add(new InputView());
		east.add(new JPanel());
		east.add(new ButtonView());
		
		add(BorderLayout.NORTH,new JPanel());
		JPanel center = new JPanel(new GridLayout(1,2));
		center.add(listView);
		center.add(east);
		
		add(BorderLayout.CENTER, center);
				
		setResizable(false);
		setSize(1000,500);
		setVisible(true);
		
	}
	
	


}
