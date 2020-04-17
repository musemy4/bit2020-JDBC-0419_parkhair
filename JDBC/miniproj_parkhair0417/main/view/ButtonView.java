package main.view;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class ButtonView extends View {
	JPanel buttonPane = new JPanel();
	
	public ButtonView() {
		display();
	}
	
	@Override
	void display() {
		buttonPane.setLayout(new GridLayout(1,3));
		buttonPane.add(join);
		buttonPane.add(input);
		buttonPane.add(reset);
		add(buttonPane);
	}

	@Override
	void evt() {
		// TODO Auto-generated method stub

	}

}
