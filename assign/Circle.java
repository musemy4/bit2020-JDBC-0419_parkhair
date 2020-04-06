package suwop.w4.d16.assign;

//2
public class Circle {
	int x,y,radius;
	
	public Circle(int x, int y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	
	
	@Override
	public String toString() {
		return "Circle(" + x + "," + y + ")������" + radius;
	}



	@Override
	public boolean equals(Object obj) {
		Circle c=(Circle)obj;
		if(c.x==x&&c.y==y) return true;	
		
		return false;
	}
	
	
	
	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("�� a: "+a);
		System.out.println("�� b: "+b);
		
		if(a.equals(b))System.out.println("���� ��");
		else System.out.println("�ٸ� ��");
	}

}
