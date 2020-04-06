package suwop.w4.d16.assign;

import java.util.Scanner;

public class Ex11 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print(">> ");
		String print = sc.nextLine();
		
		while (true) {
			System.out.print("명령: ");
			String order = sc.nextLine();
			
			if(order.equals("그만")) {
				System.out.println("종료합니다");
				return;
			}
			String[] split=order.split("!");//기준으로 두동강낸다
			
//			System.out.println(split[0]);
//			System.out.println(split[1]);
			
			StringBuffer sb=new StringBuffer(print);
			
			if(split[0].length()!=0&&split[1].length()!=0&&print.contains(split[0])) {
				int start=print.indexOf(split[0].charAt(0), 0);
//				System.out.println(start);
				int end=print.indexOf(split[0].charAt(split[0].length()-1), 0);
//				System.out.println(end);
				
				
//				System.out.println(split[0]);
//				System.out.println(split[1]);
//				System.out.println(print.contains(split[0]));
				
				sb.replace(start, end+1, split[1]);
				System.out.println(sb);
			} else
			
			System.out.println("잘못된 명령입니다!");
		}
		
		
	}
}
