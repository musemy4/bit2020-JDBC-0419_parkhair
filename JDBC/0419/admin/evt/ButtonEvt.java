package miniProj_0417.admin.evt;

import java.awt.event.*;

import javax.swing.JButton;

import miniProj_0417.admin.resource.R;
import miniProj_0417.admin.view.ButtonView;

public class ButtonEvt implements ActionListener,R{
	ButtonView target;
	
	public ButtonEvt(ButtonView target) {
		this.target=target;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			System.out.println("여기옴?");
			JButton btn = (JButton)e.getSource();
			
			if(btn==target.memberlistBtn) {
				mlistController.service();
			}
			if(btn==target.servicelistBtn) {
				slistController.service();
			}
			if(btn==target.servicebackBtn) {
				sbackController.service();
			}
			if(btn==target.membersrchBtn) {
				searchController.service();
			}
			if(btn==target.membermodiBtn) {
				modifyController.service();
			}
			if(btn==target.memberdelBtn) {
				deleteController.service();
			}
		
		}
		
	}

}
