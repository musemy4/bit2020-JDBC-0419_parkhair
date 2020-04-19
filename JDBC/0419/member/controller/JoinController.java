package miniProj_0417.member.controller;

import java.util.Date;

import javax.swing.JOptionPane;

import miniProj_0417.member.model.MemberDTO;

public class JoinController implements Controller {

	public JoinController() {}
	
	
	@Override
	public void service() {
		//System.out.println("서비스시작");
		String name = tf_name.getText();
		String gender=null;
		if(rb_m.isSelected())gender="남성";
		else gender="여성";
		String phone =tf_phone.getText();
		
		
		String birthcal=df.format((Date)model.getValue());
		String joincal=df.format((Date)model2.getValue());
		
		MemberDTO dto = new MemberDTO(name,gender,phone,birthcal,joincal);
		dao.joinMember(dto);
		JOptionPane.showMessageDialog(null, "가입되었습니다!");
		
		resetController.service();
	}
	
	

}
