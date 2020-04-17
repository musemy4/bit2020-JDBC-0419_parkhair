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
			System.out.println("�����?");
			// ��ư�̸� �� ��ưó�����ְ�
			JButton btn = (JButton) e.getSource();

			if (target instanceof InputView) {

				System.out.println("inputView��");
				//InputView tar = new InputView();
				InputView tar = (InputView) target;

				if (btn == tar.inputBtn) {
					System.out.println("�߰�..");
					inputController.service();
					listController.service();
				}

				if (btn == tar.resetBtn) {
					System.out.println("����..");
					resetController.service();
				}

			}

			else if (target instanceof ButtonView) {
				System.out.println("ButtonView��");
				ButtonView tar = new ButtonView();
				tar = (ButtonView) target;

				if (btn == tar.listBtn) {
					System.out.println("��ü����..");
					listController.service();
				}

				if (btn == tar.searchBtn) {
					System.out.println("ã��..");
					searchController.service();
				}

				if (btn == tar.modifyBtn) {
					System.out.println("����..");
					modifyController.service();
					listController.service();
				}

				if (btn == tar.deleteBtn) {
					System.out.println("����..");
					deleteController.service();
					listController.service();
				}
			}
		}
	}
}