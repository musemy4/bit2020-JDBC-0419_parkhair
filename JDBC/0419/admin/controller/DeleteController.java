package miniProj_0417.admin.controller;

import java.util.Vector;

import javax.swing.JOptionPane;

import miniProj_0417.admin.model.DTO;

public class DeleteController implements Controller {

	@Override
	public void service() {
		String idx=(String)JOptionPane.showInputDialog(null, "삭제할 회원의 회원번호를 입력해주세요");
		
		DTO dto = new DTO(idx);
		
		
		JOptionPane.showConfirmDialog(null,"진짜로"+idx+"님을 삭제합니까?","", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

		
		
		dao.delete(dto);

	}

}
