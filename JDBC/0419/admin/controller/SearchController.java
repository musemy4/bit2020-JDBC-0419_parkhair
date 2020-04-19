package miniProj_0417.admin.controller;

import java.util.Vector;

import javax.swing.JOptionPane;

import miniProj_0417.admin.model.DTO;

public class SearchController implements Controller {

	@Override
	public void service() {
		String name=(String)JOptionPane.showInputDialog(null, "검색할 회원의 이름을 입력해주세요");
		
		DTO dto = new DTO(name);
		Vector<Object> searchmembers=dao.searchmem(dto);
		Vector<Object> searchmemserv=dao.searchmemserv(dto);

		if(searchmembers!=null) {
			while(mdm.getRowCount()>0) {
				mdm.removeRow(0);
			}
			
			for(Object member: searchmembers) {
				mdm.addRow((Vector) member);
			}
		} else {
			System.out.println("출력할데이터가 없습니다!");
		}
		
		if(searchmemserv!=null) {
			while(sdm.getRowCount()>0) {
				sdm.removeRow(0);
			}
			
			for(Object member: searchmemserv) {
				sdm.addRow((Vector) member);
			}
		} else {
			System.out.println("출력할데이터가 없습니다!");
		}
	}

}
