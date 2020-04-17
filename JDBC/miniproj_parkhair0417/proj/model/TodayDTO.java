package proj.model;

import proj.resourse.R;

public class TodayDTO implements R{

	private int today;
	private String idx="JK10";
	private String name;
	
	private String designer;
	private int pay;
	
	
	//새 정보를 입력할때
	public TodayDTO(String name,String designer,int pay) {
		int todaynum=listController.getTodaysNum();
		this.idx=idx+todaynum;
		this.name=name;
		this.designer=designer;
		this.pay=pay;
	}
	
	//리스트에 올릴때
	public TodayDTO(int today, String idx, String name, String designer, int pay) {
		this.today=today;
		this.idx=idx;
		this.name=name;
		this.designer=designer;
		this.pay=pay;
	}

	//게터세터
	public int getToday() {
		return today;
	}
	public void setToday(int today) {
		this.today = today;
	}
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesigner() {
		return designer;
	}
	public void setDesigner(String designer) {
		this.designer = designer;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "TodayDTO [today:" + today + ", idx:" + idx 
				+ ", name:" + name + ", designer:" + designer 
				+ ", pay:"	+ pay ;
	}
	
	
}
