package miniProj_0417.entrance.controller;



import java.util.Vector;

import javax.swing.JOptionPane;

import miniProj_0417.admin.view.AdminMemberView;
import miniProj_0417.entrance.resource.R;


public class AdminController implements Controller,R {

	public AdminController() {}
	
	@Override
	public void service() {
		Vector admins=dao.getadmins(tf_name.getText());
		
		if(admincheck.isSelected()&&admins!=null) {
			if(tf_pw.getText().equals(admins.get(1))){
				System.out.println("관리자로그인 성공!");
				new AdminMemberView().setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "관리자 정보에 오류가있습니다");
				return;
			}
			
			
			
		} else {
			JOptionPane.showMessageDialog(null, "관리자가 아닙니다.");
			return;
		}
	}

}
