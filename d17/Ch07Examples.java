package suwop.w4.d17;

import java.util.*;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	
}	

public class Ch07Examples {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap =new HashMap<String, Integer>();
		
		//put
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 70);
		scoreMap.put("한원선", 99);
		
	
	}
	
	
	public static void test7_5(String[] args) {
		HashMap<String, String> dic = new HashMap<String,String>();
		//var dic=new HashMap<String,String>();로 간략히 써도됨
	
		//put기능
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		while(true) {
			System.out.print("찾고 싶은 단어는? :");
			String eng= sc.next();
			if(eng.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
				
			String kor=dic.get(eng);
			if(kor==null)System.out.println(eng+"는 없는 단어입니다");
			else System.out.println("> "+kor);
			
		}//while end
		
	}
	
	public static void test7_4(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		Iterator<Integer> it = v.iterator();//위의 값의 이터레이터다~
		int sum=0;
		while(it.hasNext()) {
			int n=it.next();
			System.out.println(n);
			sum+=n;
		}
		
		System.out.println("벡터에 있는 정수의 합은: "+sum);
		
	}
	
	
	
	
	
	public static void test7_3(String[] args) {
	ArrayList<String> a =new ArrayList<String>();	
	
	//add기능
	for(int i=0;i<4;i++) {
		System.out.print("이름을 입력하세요>>");
		String s=sc.next();
		a.add(s);
	}
	
	//get기능
	for(int i=0;i<a.size();i++) {
		String name=a.get(i);
		System.out.println(name+" ");
	}
	
	//가장 긴 이름 출력 
	int longestIndex=0;//0으로 설정해놈
	for(int i=1;i<a.size();i++) {
		if(a.get(longestIndex).length()<a.get(i).length())
			longestIndex=i;
	}
		System.out.println("\n가장 긴 이름은: "+a.get(longestIndex));
		
	}
	
	
	public static void test7_2(String[] args) {
		Vector<Point> v = new Vector<Point>();
		
		//3개의 객체 삽입
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		v.remove(1);
		
		//벡터에 있는 Point 객체 모두 검색하여 출력
		for(int i=0;i<v.size();i++) {
			Point p=v.get(i);
			System.out.println(p);
		}
	}
	
	
	public static void test7_1(String[] args) {
		Vector<Integer> v =new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		
		System.out.println(v);
		
		//벡터 중간에 삽입
		v.add(2,100);
		
		System.out.println("벡터내의 요소 의 수: "+ v.size());
		System.out.println("벡터의 현재 용량: "+v.capacity());//**벡터의 용량은 기본적으로 10
		
		//모든 요소 정수 출력하기, sum구하기
		int sum=0;
		for(int i=0;i<v.size();i++) {
			int n=v.get(i);//get으로 i번째인덱스값을 뽑아냄
			System.out.println(n);
			sum+=n;
		}
		
		System.out.println("sum :"+sum);
		
		
	}//main end

}
