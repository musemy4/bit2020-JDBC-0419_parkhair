package nam.test;




//Q1-8:Point를 상속받은 Point3D
class Point3D extends Point{
	int z;
	
	public Point3D() {}
	
	//Q1-9
	public Point3D(int x,int y, int z) {
		//super(x,y);
		this.x=x;
		this.y=y;
		this.z=z;
	}

	//Q1-10
	@Override
	public String toString() {
		return "Point3D [x=" + x + ", y=" + y + ", z= "+ z + "]";
	}

}



//Q1-1
class Point{
	int x;
	int y;
	public Point() {}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=x;
	}
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	

	
	//Q1-7
	@Override
	public boolean equals(Object obj) {
		
		if (getClass() != obj.getClass()){
			System.out.print("1."+getClass()+"클래스가 아님 : ");
			return false;
		}
		
		Point other = (Point) obj;
		if (x != other.x){
			System.out.print("2.x가 같지않음 : ");
			return false;
		}
		if (y != other.y){
			System.out.print("3.y가 같지않음 : ");
			return false;
		}
		System.out.print("0.클래스가 같은것이 들어와 비교를 했더니 x,y가 동일한 점이다 : ");
		return true;
	}

	
	
	
	
	//Q1-5
	static double getDistacne(Point p, Point p2) {
		double x2=(p.x-p2.x)*(p.x-p2.x);
		double y2=(p.y-p2.y)*(p.y-p2.y);
		
		double distance=Math.pow(x2+y2, 0.5);
		
		return distance;
	}
	
	
	
	//Q1-6
	
	//this와 넣어진 값 Point p와 사이의 거리
	public double getDistacne(Point p) {
//		double x2=(x-p.x)*(x-p.x);
//		double y2=(y-p.y)*(y-p.y);
//		
//		double distance=Math.pow(x2+y2, 0.5);
		
		double distance =getDistacne(this,p);
		
		return distance;
	}
	
}



public class PointTest {
	
	public static void main(String[] args) {
	
		//Q1-2: Point 객체를 생성하는 코드
		Point p = new Point();
		//Q1-3:toString() 오버라이딩
		p.x=3;
		p.y=4;
		
		System.out.println(p.toString());//toString() 생략가능
	
		//Q1-4:매개변수가 있는 생성자
		Point p2 = new Point(1,1);
		System.out.println(p2);
		
		Point p3 = new Point(1,1);
		Point p4 = new Point(2,1);
		
		//Q1-5 static메서드 사용
		System.out.println("static 메서드 사용 : "+Point.getDistacne(p,p2));
		
		//Q1-6 메서드사용
		System.out.println(p.getDistacne(p2));
	
		//Q1-7(1):equals() 오버라이딩. 객체가 같고, x,y값이 같아야만 true 반환
		System.out.println(p2.equals(1));
		
		
		//Q1-7(2):equals() 오버라이딩. 객체가 같고, x,y값이 같아야만 true 반환
		System.out.println(p2.equals(p3));
		System.out.println(p2.equals(p4));
				
		
		
		//Q1-9:매개변수가 있는 생성자
		Point3D p10=new Point3D(1, 1, 1);
		System.out.println(p10); //Q1-10: toString()
	}

	

}
