package suwop.w4.d16.assign;
import java.util.Random;
import java.util.Scanner;

class Trans{

	static String trans(int i) {
		
		switch(i) {
			case 1: return"����"; 
			case 2: return"����"; 
			case 3: return"��"; 
			default:System.out.println("�߸��� �Է��Դϴ�");
					
			
		}
		return null;
	}
}




public class Ex09 {
	static Scanner sc= new Scanner(System.in);
	static Random rand = new Random();
	public static void main(String[] args) {
		//����1 ����2 ��3
		while(true) {
			System.out.print("ö��[����(1), ����(2), ��(3), ������(4)]>> ");
			int chul=sc.nextInt();
			if(chul==4)break;
			int com=rand.nextInt(3)+1;
			
			System.out.println("ö��("+Trans.trans(chul)+") : ��ǻ��("+Trans.trans(com)+")");
			
			if(chul==com) {
				System.out.println("�����ϴ�");
			} else if(chul-com==1||chul-com==-2) {
					System.out.println("ö���� �̰���ϴ�");
			} else if(chul-com==-1||chul-com==2)
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
		}
	}
}
