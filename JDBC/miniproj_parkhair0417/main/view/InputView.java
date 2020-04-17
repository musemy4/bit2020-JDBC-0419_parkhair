package main.view;

import java.awt.GridLayout;

import javax.swing.*;

public class InputView extends View {
	JPanel inputPane=new JPanel();

	JLabel name =new JLabel("이름 : ");
	JLabel phone4 =new JLabel("번호 뒷자리 : ");
	
	
	
	
	public InputView() {
		display();
	}
	
	@Override
	void display() {
		inputPane.setLayout(new GridLayout(2,1));
		inputPane.add(name);
		inputPane.add(tf_name);
		inputPane.add(phone4);
		inputPane.add(tf_phone4);
		
		add(inputPane);
		
	}

	
	@Override
	void evt() {}

}
