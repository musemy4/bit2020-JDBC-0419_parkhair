package miniProj_0417.db.view;

import java.awt.*;

import javax.swing.*;

public class ListView extends View {
	
	public ListView() {
		display();
	}
	
	@Override
	void display() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		text.setBackground(Color.white);
		text.setBounds(10, 10, 250, 400);
		text.setEditable(false);
		panel.add(text);
		
		
		add(panel);
	
	}

	@Override
	void evt() {}

}