package miniProj_0417.member.view;

import javax.swing.JButton;
import javax.swing.JPanel;

import miniProj_0417.member.evt.ButtonEvt;

public class ButtonView extends View {
	JPanel buttonView = new JPanel();
	public JButton resetBtn=new JButton("reset");
	public JButton joinBtn = new JButton("Join!");
	
	public ButtonView() {
		display();
		evt();
	}
	
	@Override
	void display() {
		buttonView.add(resetBtn);
		buttonView.add(joinBtn);
		
		add(buttonView);
	
	}

	@Override
	void evt() {
		ButtonEvt handler = new ButtonEvt(this);
		resetBtn.addActionListener(handler);
		joinBtn.addActionListener(handler);
		
		
	}

}
