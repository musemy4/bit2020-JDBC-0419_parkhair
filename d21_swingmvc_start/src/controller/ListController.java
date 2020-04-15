package controller;

import java.util.Vector;

public class ListController implements Controller {

	public ListController() {}
	
	@Override
	public void service() {
		Vector<Vector> dataList = dao.selectAll(); 
	
		if(dataList!=null) {
			//이미 있는게 있으면 지우고 새 테이블로
			while(model.getRowCount()>0) {
				model.removeRow(0);
			}
			
			for(Vector rowData: dataList) {
				model.addRow(rowData);
			}
		} else {
			System.out.println("출력할 데이터가 없습니다.");
		}
	
	}

}
