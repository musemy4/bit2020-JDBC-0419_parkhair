package java_mvc.view;

import javax.swing.JButton;

import java_mvc.evt_handler.BtnEvtHandler;

public class ButtonView extends View {
	public JButton allBtn = new JButton("List");
	public JButton inputBtn = new JButton("Input");
	public JButton deleteBtn = new JButton("Delete");
	public JButton searchBtn = new JButton("Search");
	public JButton cancelBtn = new JButton("Cancel");
	
	public ButtonView() {
		display();
		evt();
	}
	
	@Override
	public void display() {
		add(allBtn);
		add(inputBtn);
		add(deleteBtn);
		add(searchBtn);
		add(cancelBtn);

	}

	@Override
	public void evt() {
		BtnEvtHandler handler = new BtnEvtHandler(this);
		
		allBtn.addActionListener(handler);
		inputBtn.addActionListener(handler);
		deleteBtn.addActionListener(handler);
		searchBtn.addActionListener(handler);
		cancelBtn.addActionListener(handler);
		
	}

}
