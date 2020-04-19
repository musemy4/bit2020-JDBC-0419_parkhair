package miniProj_0417.entrance.model;

public class DTO {
	private String name;
	private String phone;
	
	
	public DTO(String name, String pw) {
		this.name=name;
		this.phone=pw;
	}

	//게터세터
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
	
	
	
	
	
}
