package miniProj_0417.entrance.view;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;

import miniProj_0417.entrance.evt.ButtonEvt;

public class ButtonView extends View {
	JPanel buttonPane = new JPanel();
	
	public ButtonView() {
		display();
		evt();
	}
	
	@Override
	void display() {
		buttonPane.setLayout(new GridBagLayout());
		buttonPane.add(newB);
		buttonPane.add(memberB);
		buttonPane.add(resetB);
		buttonPane.add(adminB);
		
		add(buttonPane);
	}

	@Override
	void evt() {
		ButtonEvt handler = new ButtonEvt(this);
		
		newB.addActionListener(handler);
		memberB.addActionListener(handler);
		resetB.addActionListener(handler);
		adminB.addActionListener(handler);
		
	}

}
