package miniProj_0417.db.model;

import miniProj_0417.db.resource.R;

public class DTO implements R{
	private String idx;
	private String name;
	private String date;
	private String designer;
	private String menu;
	private String service;
	private String item;
	private double usepoint;
	private double totalpay;
	private double willpoint;
	public DTO(String idx, String name, String date, String designer, String menu, String service, String item,
			double usepoint, double totalpay, double willpoint) {
		super();
		this.idx = idx;
		this.name = name;
		this.date = date;
		this.designer = designer;
		this.menu = menu;
		this.service = service;
		this.item = item;
		this.usepoint = usepoint;
		this.totalpay = totalpay;
		this.willpoint = willpoint;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDesigner() {
		return designer;
	}
	public void setDesigner(String designer) {
		this.designer = designer;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getUsepoint() {
		return usepoint;
	}
	public void setUsepoint(double usepoint) {
		this.usepoint = usepoint;
	}
	public double getTotalpay() {
		return totalpay;
	}
	public void setTotalpay(double totalpay) {
		this.totalpay = totalpay;
	}
	public double getWillpoint() {
		return willpoint;
	}
	public void setWillpoint(double willpoint) {
		this.willpoint = willpoint;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
