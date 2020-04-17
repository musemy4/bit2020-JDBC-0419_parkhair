package main.view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.*;

public class WelcomeView extends JFrame {
	JPanel content=null;
	public WelcomeView() {
		
		content=(JPanel)getContentPane();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		content.setLayout(new GridLayout(5,1));
		
		add(new JPanel());
		
		add(new TitleView());
		add(new InputView());
		
		add(new ButtonView());
		
		setSize(400, 400);
		setResizable(false);
		
		//°¡¿îµ¥¼­ ¶ä
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x=screen.width/2-this.getWidth()/2;
		int y=screen.width/6;
		setLocation(x,y);
	
	}


}
