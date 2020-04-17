package proj.view;

import javax.swing.*;

import proj.evt.ButtonEvt;

public class ButtonView extends View {
	JPanel buttonPane = new JPanel();
	public JButton listBtn=new JButton("��κ���");
	public JButton searchBtn = new JButton("ȸ���˻�");
	public JButton modifyBtn= new JButton("���񽺼���");
	public JButton deleteBtn = new JButton("���񽺻���");
	
	public ButtonView() {
		display();
		evt();
	}	
	
	@Override
	void display() {
		
		buttonPane.add(listBtn);
		buttonPane.add(searchBtn);
		buttonPane.add(modifyBtn);
		buttonPane.add(deleteBtn);
		
		add(buttonPane);
		
	}

	@Override
	void evt() {
		ButtonEvt handler = new ButtonEvt(this);
		listBtn.addActionListener(handler);
		searchBtn.addActionListener(handler);
		modifyBtn.addActionListener(handler);
		deleteBtn.addActionListener(handler);
		
	}

}
