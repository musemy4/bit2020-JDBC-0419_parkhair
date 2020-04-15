package model;

public class DTO {
	private int no;
	private String name;
	private String phone;
	private String email;
	
	//생성자
	public DTO(int no, String name, String phone, String email) {
		super();
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	//게터세터
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "no." + no + " name: " + name + " phone: " + phone + " email: " + email;
	}
	
	
	
	
	
}
