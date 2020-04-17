package proj.model;

import proj.resourse.R;

//회원정보
public class MemberDTO implements R{
	
	private int no;//이건 DB에서 자동으로 처리
	private String idx="JK10";//회원고유번호
	private String name;
	private String gender;
	private String phone;
	private String membership;
	private int visits;
	private int point;
	private int accumPoint;//이걸로 등급이 매겨짐
	
	//회원이 생성될때 
	public MemberDTO(String name,String gender,String phone) {
		int todaynum=listController.getTodaysNum();
		this.idx=idx+todaynum;
		this.name=name;
		this.gender=gender;
		this.phone=phone;
		this.membership="Silver";
		this.visits=1;
		this.point=0;
		this.accumPoint=0;
		
	}

	//게터세터

	//투스트링 해야하나//
	
}
