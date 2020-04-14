package java_mvc.view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InputView extends View {
	JPanel inputPane=new JPanel(new GridLayout(4,1));
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	
	
	public InputView() {
		display();
	}
	
	
	@Override
	public void display() {
		
		p1.add(new JLabel("I D X : "));
		p1.add(idxF);
		p2.add(new JLabel("N A M E : "));
		p2.add(nameF);
		p3.add(new JLabel("P H O N E : "));
		p3.add(phoneF);
		p4.add(new JLabel("E M A I L : "));
		p4.add(emailF);
		
		inputPane.add(p1);
		inputPane.add(p2);
		inputPane.add(p3);
		inputPane.add(p4);
		
		add(inputPane);
	}

	@Override
	public void evt() {
		// TODO Auto-generated method stub

	}

}
