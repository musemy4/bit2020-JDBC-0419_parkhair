package proj.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import proj.resourse.R;
import proj.view.*;

public class ButtonEvt implements ActionListener, R {
	View target;

	public ButtonEvt(InputView target) {
		// System.out.println("constructor1");
		this.target = target;

	}

	public ButtonEvt(ButtonView target) {
		// System.out.println("constructor2");
		this.target = target;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() instanceof JButton) {
			System.out.println("여기옴?");
			// 버튼이면 다 버튼처리해주고
			JButton btn = (JButton) e.getSource();

			if (target instanceof InputView) {

				System.out.println("inputView꺼");
				//InputView tar = new InputView();
				InputView tar = (InputView) target;

				if (btn == tar.inputBtn) {
					System.out.println("추가..");
					inputController.service();
					listController.service();
				}

				if (btn == tar.resetBtn) {
					System.out.println("리셋..");
					resetController.service();
				}

			}

			else if (target instanceof ButtonView) {
				System.out.println("ButtonView꺼");
				ButtonView tar = new ButtonView();
				tar = (ButtonView) target;

				if (btn == tar.listBtn) {
					System.out.println("전체보기..");
					listController.service();
				}

				if (btn == tar.searchBtn) {
					System.out.println("찾기..");
					searchController.service();
				}

				if (btn == tar.modifyBtn) {
					System.out.println("수정..");
					modifyController.service();
					listController.service();
				}

				if (btn == tar.deleteBtn) {
					System.out.println("삭제..");
					deleteController.service();
					listController.service();
				}
			}
		}
	}
}