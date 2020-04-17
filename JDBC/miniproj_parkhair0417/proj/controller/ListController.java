package proj.controller;

import java.util.Vector;

import proj.model.TodayDTO;

public class ListController implements Controller {

	public ListController() {}
	
	@Override
	public void service() {
		Vector<Object> todays = dao.todayList();
	
		if(todays!=null) {
			//�����ִ� ������ ����� �ٽÿø���
			while(dm.getRowCount()>0) {
				dm.removeRow(0);
			}
			
			for(Object dto:todays) {
				dm.addRow((Vector)dto);
			}
		} else {
			System.out.println("����� �����Ͱ� �����ϴ�!");
		}
	
	}
	
	public int getTodaysNum() {
		Vector<Object> todays =dao.todayList();
		int getTodaysNum = todays.size();
		
		return getTodaysNum;
	}


}
