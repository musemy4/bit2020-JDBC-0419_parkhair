package miniProj_0417.admin.controller;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class SListController implements Controller {

	@Override
	public void service() {
		Vector<Object> services = dao.servicelist();
		
		if(services!=null) {
			while(sdm.getRowCount()>0) {
				sdm.removeRow(0);
			}
			
			for(Object dto:services) {
				sdm.addRow((Vector)dto);
			}
		} else {
			System.out.println("출력할데이터가 없습니다!");
		}
	}

}
