package miniProj_0417.admin.controller;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import miniProj_0417.admin.resource.R;
import miniProj_0417.admin.view.MListView;

public class MListController implements Controller,R {

	@Override
	public void service() {
		Vector<Object> members = dao.memberlist();
		
		if(members!=null) {
			new MListView(mdm);
			
			while(mdm.getRowCount()>0) {
				mdm.removeRow(0);
			}
			
			for(Object dto:members) {
				mdm.addRow((Vector)dto);
			}
		} else {
			System.out.println("출력할데이터가 없습니다!");
		}
	}

}
