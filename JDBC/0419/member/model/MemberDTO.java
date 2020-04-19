package miniProj_0417.member.model;

import miniProj_0417.member.resource.R;

public class MemberDTO implements R{
	
	private String idx="JK11";//이게 primarykey
	
	private String name;
	private String gender;
	private String phone;//비밀번호가됨
	private String birth;//생일날 포인트받음
	
	private int accumPoint;//1원단위까지
	private int Point;
	private String membership;
	private String joinDate;
	
	
	//생성할때
	public MemberDTO(String name, String gender, String phone, String birthcal, String joincal) {
		this.idx=idx+memberSize;
		this.name=name;
		this.gender=gender;
		this.phone=phone;
		this.accumPoint=3000;//회원가입포인트
		this.Point=3000;
		this.membership="손님"; //손님:5%적립, 단골님:10%적립 누적포인트2만점이상, 붙박이님:15%적립 5만점이상
		
		this.birth=birthcal;
		this.joinDate=joincal;
	}


	
	//게터세터
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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public int getAccumPoint() {
		return accumPoint;
	}


	public void setAccumPoint(int accumPoint) {
		this.accumPoint = accumPoint;
	}


	public int getPoint() {
		return Point;
	}


	public void setPoint(int point) {
		Point = point;
	}


	public String getMembership() {
		return membership;
	}


	public void setMembership(String membership) {
		this.membership = membership;
	}


	public String getJoinDate() {
		return joinDate;
	}


	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	

	
	
	

}
