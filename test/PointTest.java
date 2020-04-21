package nam.test;




//Q1-8:Point�� ��ӹ��� Point3D
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
			System.out.print("1."+getClass()+"Ŭ������ �ƴ� : ");
			return false;
		}
		
		Point other = (Point) obj;
		if (x != other.x){
			System.out.print("2.x�� �������� : ");
			return false;
		}
		if (y != other.y){
			System.out.print("3.y�� �������� : ");
			return false;
		}
		System.out.print("0.Ŭ������ �������� ���� �񱳸� �ߴ��� x,y�� ������ ���̴� : ");
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
	
	//this�� �־��� �� Point p�� ������ �Ÿ�
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
	
		//Q1-2: Point ��ü�� �����ϴ� �ڵ�
		Point p = new Point();
		//Q1-3:toString() �������̵�
		p.x=3;
		p.y=4;
		
		System.out.println(p.toString());//toString() ��������
	
		//Q1-4:�Ű������� �ִ� ������
		Point p2 = new Point(1,1);
		System.out.println(p2);
		
		Point p3 = new Point(1,1);
		Point p4 = new Point(2,1);
		
		//Q1-5 static�޼��� ���
		System.out.println("static �޼��� ��� : "+Point.getDistacne(p,p2));
		
		//Q1-6 �޼�����
		System.out.println(p.getDistacne(p2));
	
		//Q1-7(1):equals() �������̵�. ��ü�� ����, x,y���� ���ƾ߸� true ��ȯ
		System.out.println(p2.equals(1));
		
		
		//Q1-7(2):equals() �������̵�. ��ü�� ����, x,y���� ���ƾ߸� true ��ȯ
		System.out.println(p2.equals(p3));
		System.out.println(p2.equals(p4));
				
		
		
		//Q1-9:�Ű������� �ִ� ������
		Point3D p10=new Point3D(1, 1, 1);
		System.out.println(p10); //Q1-10: toString()
	}

	

}
