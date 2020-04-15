package view;

import javax.swing.JButton;
import javax.swing.JPanel;

import evt.ButtonEvt;

public class ButtonView extends View {
	JPanel buttonPane = new JPanel();
	public JButton allBtn = new JButton("list");
	public JButton addBtn = new JButton("add");
	public JButton searchBtn = new JButton("search");
	public JButton deleteBtn = new JButton("delete");
	public JButton modifyBtn = new JButton("delete");
	public JButton cancelBtn = new JButton("reset");
	
	public ButtonView() {
		display();
		evt();
	}
	
	@Override
	void display() {
		buttonPane.add(allBtn);
		buttonPane.add(addBtn);
		buttonPane.add(searchBtn);
		buttonPane.add(deleteBtn);
		buttonPane.add(modifyBtn);
		buttonPane.add(cancelBtn);
		
		add(buttonPane);
	}

	@Override
	void evt() {
		ButtonEvt handler = new ButtonEvt(this);
		allBtn.addActionListener(handler);
		addBtn.addActionListener(handler);
		searchBtn.addActionListener(handler);
		deleteBtn.addActionListener(handler);
		modifyBtn.addActionListener(handler);
		cancelBtn.addActionListener(handler);
		
	}

}
