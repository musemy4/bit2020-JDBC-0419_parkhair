package proj.controller;

import java.util.Vector;

import proj.model.TodayDTO;

public class ListController implements Controller {

	public ListController() {}
	
	@Override
	public void service() {
		Vector<Object> todays = dao.todayList();
	
		if(todays!=null) {
			//원래있던 정보를 지우고 다시올리기
			while(dm.getRowCount()>0) {
				dm.removeRow(0);
			}
			
			for(Object dto:todays) {
				dm.addRow((Vector)dto);
			}
		} else {
			System.out.println("출력할 데이터가 없습니다!");
		}
	
	}
	
	public int getTodaysNum() {
		Vector<Object> todays =dao.todayList();
		int getTodaysNum = todays.size();
		
		return getTodaysNum;
	}


}
