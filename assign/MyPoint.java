package suwop.w4.d16.assign;

//01
public class MyPoint {
	int x,y;
	
	public MyPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		return "Point (" + x + "," + y + ")";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		MyPoint p = (MyPoint)obj;
		if(p.x==x&&p.y==y)return true;
		
		return false;
	}
	
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3,50);
		MyPoint q = new MyPoint(4,50);
		System.out.println(p);
	
		if(p.equals(q))System.out.println("같은 점");
		else System.out.println("다른 점");
	
	}

}
