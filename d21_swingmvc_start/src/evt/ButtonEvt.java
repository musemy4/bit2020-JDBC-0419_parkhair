package evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import controller.ListController;
import resource.R;
import view.ButtonView;

public class ButtonEvt implements ActionListener,R {
	ButtonView target;
	
	public ButtonEvt() {
		this.target=target;
	}

	public ButtonEvt(ButtonView target) {
		this.target=target;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			if(btn==target.allBtn) {
				System.out.println("전체보기..");
				listController.service();
			}
			if(btn==target.addBtn) {
				System.out.println("추가..");
				inputController.service();
				listController.service();
			}
			if(btn==target.searchBtn) {
				System.out.println("찾기..");
				searchController.service();
			}
			if(btn==target.deleteBtn) {
				System.out.println("삭제..");
				deleteController.service();
				listController.service();
			}
			if(btn==target.modifyBtn) {
				System.out.println("수정..");
				modifyController.service();
				listController.service();
			}
			if(btn==target.cancelBtn) {
				System.out.println("취소..");
				cancelController.service();
				
			}
		}
	}
	
	
	
}
