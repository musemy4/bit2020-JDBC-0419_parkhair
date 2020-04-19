package miniProj_0417.admin.model;

public class DTO {
	private String idx;
	private String name;
	
	
	public DTO(String in) {
		if(in.charAt(0)=='J') {
			this.idx=in;
		} else this.name=in;
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
	
	
	
}
