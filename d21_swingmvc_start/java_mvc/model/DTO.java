package java_mvc.model;

public class DTO {
	private int idx;
	private String name;
	private String phone;
	private String email;
	
	//생성자
	public DTO(int idx, String name, String phone, String email) {
		super();
		this.idx = idx;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	//게터세터
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
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
		return "DTO [idx=" + idx + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	
	
}
