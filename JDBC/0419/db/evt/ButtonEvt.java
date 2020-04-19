package miniProj_0417.db.evt;

import java.awt.event.*;
import javax.swing.JButton;
import miniProj_0417.db.resource.R;
import miniProj_0417.db.view.InputView;

public class ButtonEvt implements ActionListener,R {
	InputView target;
	
	public ButtonEvt(InputView target) {
		this.target=target;
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			if(btn==target.pointBtn) {
				System.out.println("포인트적용 눌렸다!");
				pointController.service();
			}
			if(btn==target.payBtn) {
				System.out.println("결제버튼 눌렸다!");
				payController.service();
			}
			if(btn==target.resetBtn) {
				System.out.println("리셋버튼 눌렸다!");
				resetController.service();
			}
			if(btn==target.listBtn) {
				System.out.println("리스트출력버튼 눌렸다!");
				listController.service();
			}
			
			
			
		}
	}

}
