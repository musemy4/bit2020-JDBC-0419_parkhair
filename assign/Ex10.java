package suwop.w4.d16.assign;

import java.util.*;

class Person{
	String name;
	int[] gets=new int[3];
	public Person(String name) {
		this.name=name;
	}
}

public class Ex10 {
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	public static void main(String[] args) {
		Person[] parr=new Person[2];
		
		for(int i=0;i<parr.length;i++) {
			System.out.print((i+1)+"��° ���� �̸�>>");
			parr[i]=new Person(sc.nextLine());
		}
		
		while(true) {
			for(int i=0;i<parr.length;i++) {
				System.out.print("["+parr[i].name+"]:<Enter> ");
				String str=sc.nextLine();
				if(str.isEmpty()) {//����ġ��
					System.out.print("\t");
					for(int j=0;j<3;j++) {
						parr[i].gets[j]=rand.nextInt(3)+1;
						System.out.print(parr[i].gets[j]+" ");
					}
					if(parr[i].gets[0]==parr[i].gets[1]&&parr[i].gets[1]==parr[i].gets[2]) {
						System.out.println(parr[i].name+"���� �̰���ϴ�!");
						return;
					} else 
						System.out.println("�ƽ�����!");
					
				}
			}//for��
		}
	}

}
