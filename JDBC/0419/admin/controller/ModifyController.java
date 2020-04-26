package miniProj_0417.admin.controller;

public class ModifyController implements Controller {

	@Override
	public void service() {
		String idx=(String)JOptionPane.showInputDialog(null, "수정할 회원의 회원번호를 입력해주세요");
		DTO dto = new DTO(idx);
		int rn=dao.isthere(dto);	
		if(rn>0) {
			int option = JOptionPane.showConfirmDialog(null, message, "modify", JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
			   DTO dto2 = new DTO(idx,tf_phone.getText());
			    
			    dao.modifyphone(dto2);
			} else {
			    System.out.println("modify canceled");
			}
			mlistController.service();
		} else {
			JOptionPane.showMessageDialog(null, "해당 idx의 회원이 없습니다");
		}
	}

}
