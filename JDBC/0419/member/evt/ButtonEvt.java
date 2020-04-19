package miniProj_0417.member.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import miniProj_0417.member.resource.R;
import miniProj_0417.member.view.ButtonView;

public class ButtonEvt implements R, ActionListener {
	ButtonView target;
	
	public ButtonEvt(ButtonView target) {
		this.target=target;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			
			if(btn==target.joinBtn) {
				//System.out.println("액션들어갔다!");
				joinController.service();
			}
			if(btn==target.resetBtn) {
				//System.out.println("리셋액션들어갔다!");
				resetController.service();
			}
			
			
			
		}
		
		
	}
	
	
	
}
