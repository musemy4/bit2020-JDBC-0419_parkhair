package suwop.w4.d16.assign;
import java.util.Random;
import java.util.Scanner;

class Trans{

	static String trans(int i) {
		
		switch(i) {
			case 1: return"가위"; 
			case 2: return"바위"; 
			case 3: return"보"; 
			default:System.out.println("잘못된 입력입니다");
					
			
		}
		return null;
	}
}




public class Ex09 {
	static Scanner sc= new Scanner(System.in);
	static Random rand = new Random();
	public static void main(String[] args) {
		//가위1 바위2 보3
		while(true) {
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>> ");
			int chul=sc.nextInt();
			if(chul==4)break;
			int com=rand.nextInt(3)+1;
			
			System.out.println("철수("+Trans.trans(chul)+") : 컴퓨터("+Trans.trans(com)+")");
			
			if(chul==com) {
				System.out.println("비겼습니다");
			} else if(chul-com==1||chul-com==-2) {
					System.out.println("철수가 이겼습니다");
			} else if(chul-com==-1||chul-com==2)
				System.out.println("컴퓨터가 이겼습니다");
		}
	}
}
