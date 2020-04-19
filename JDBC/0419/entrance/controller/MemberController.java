package miniProj_0417.entrance.controller;

import javax.swing.JOptionPane;

import miniProj_0417.db.view.MainView;
import miniProj_0417.entrance.model.DTO;

public class MemberController implements Controller {

	@Override
	public void service() {
		String name = tf_name.getText();
		String pw = tf_pw.getText();
		
		DTO dto = new DTO(name,pw);
		String idx=dao.login(dto);
		if(idx!=null) {
			JOptionPane.showMessageDialog(null, name+ "님, 환영합니다");
			new MainView(idx).setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "로그인정보를 확인해주세요");
		}
	
	}

}
