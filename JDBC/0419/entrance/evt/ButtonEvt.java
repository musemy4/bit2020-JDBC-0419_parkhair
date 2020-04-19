package miniProj_0417.entrance.evt;

import java.awt.event.*;

import javax.swing.JButton;

import miniProj_0417.entrance.resource.R;
import miniProj_0417.entrance.controller.MemberController;
import miniProj_0417.entrance.controller.ResetController;
import miniProj_0417.entrance.view.ButtonView;


public class ButtonEvt implements ActionListener,R{
	ButtonView target;
	
	public ButtonEvt(ButtonView target) {
		this.target=target;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			
			if(btn==target.newB) {
				joinController.service();
			}
			if(btn==target.memberB) {
				memberController.service();
			}
			if(btn==target.resetB) {
				System.out.println("리셋버튼 눌렸다");
				resetController.service();
			}
			
			if(btn==target.adminB) {
				System.out.println("회원보기버튼 눌렸다");
				adminController.service();
			}
			
			
			
			
		}
	}

}