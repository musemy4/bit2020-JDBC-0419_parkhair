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
		scoreMap.put("�輺��", 97);
		scoreMap.put("Ȳ����", 88);
		scoreMap.put("�賲��", 98);
		scoreMap.put("���繮", 70);
		scoreMap.put("�ѿ���", 99);
		
	
	}
	
	
	public static void test7_5(String[] args) {
		HashMap<String, String> dic = new HashMap<String,String>();
		//var dic=new HashMap<String,String>();�� ������ �ᵵ��
	
		//put���
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		while(true) {
			System.out.print("ã�� ���� �ܾ��? :");
			String eng= sc.next();
			if(eng.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
				
			String kor=dic.get(eng);
			if(kor==null)System.out.println(eng+"�� ���� �ܾ��Դϴ�");
			else System.out.println("> "+kor);
			
		}//while end
		
	}
	
	public static void test7_4(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		Iterator<Integer> it = v.iterator();//���� ���� ���ͷ����ʹ�~
		int sum=0;
		while(it.hasNext()) {
			int n=it.next();
			System.out.println(n);
			sum+=n;
		}
		
		System.out.println("���Ϳ� �ִ� ������ ����: "+sum);
		
	}
	
	
	
	
	
	public static void test7_3(String[] args) {
	ArrayList<String> a =new ArrayList<String>();	
	
	//add���
	for(int i=0;i<4;i++) {
		System.out.print("�̸��� �Է��ϼ���>>");
		String s=sc.next();
		a.add(s);
	}
	
	//get���
	for(int i=0;i<a.size();i++) {
		String name=a.get(i);
		System.out.println(name+" ");
	}
	
	//���� �� �̸� ��� 
	int longestIndex=0;//0���� �����س�
	for(int i=1;i<a.size();i++) {
		if(a.get(longestIndex).length()<a.get(i).length())
			longestIndex=i;
	}
		System.out.println("\n���� �� �̸���: "+a.get(longestIndex));
		
	}
	
	
	public static void test7_2(String[] args) {
		Vector<Point> v = new Vector<Point>();
		
		//3���� ��ü ����
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		v.remove(1);
		
		//���Ϳ� �ִ� Point ��ü ��� �˻��Ͽ� ���
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
		
		//���� �߰��� ����
		v.add(2,100);
		
		System.out.println("���ͳ��� ��� �� ��: "+ v.size());
		System.out.println("������ ���� �뷮: "+v.capacity());//**������ �뷮�� �⺻������ 10
		
		//��� ��� ���� ����ϱ�, sum���ϱ�
		int sum=0;
		for(int i=0;i<v.size();i++) {
			int n=v.get(i);//get���� i��°�ε������� �̾Ƴ�
			System.out.println(n);
			sum+=n;
		}
		
		System.out.println("sum :"+sum);
		
		
	}//main end

}
