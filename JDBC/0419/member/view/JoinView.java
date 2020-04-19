package miniProj_0417.member.view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import miniProj_0417.member.resource.R;

public class JoinView extends JFrame implements R  {
	JPanel content =null;
	
	
	public JoinView() {
		content=(JPanel)getContentPane();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		content.setLayout(new GridLayout(5,1));
		add(new JPanel());
		add(new TitleView());
		add(new InputView());
		add(new CalView());
		add(new ButtonView());
		
		setSize(400,600);
		setResizable(false);
	}	
	


}
