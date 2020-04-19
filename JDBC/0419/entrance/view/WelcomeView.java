package miniProj_0417.entrance.view;


import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.*;

public class WelcomeView extends JFrame {
	JPanel content=null;
	public WelcomeView() {
		
		content=(JPanel)getContentPane();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		content.setLayout(new GridLayout(4,1));
		
		add(new JPanel());
		add(new TitleView());
		
		add(new InputView());
		
		add(new ButtonView());
		
		setSize(400, 500);
		setResizable(false);
		
		//중간에 뜨도록
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x=screen.width/2-this.getWidth()/2;
		int y=screen.width/10;
		setLocation(x,y);
	
	}


}