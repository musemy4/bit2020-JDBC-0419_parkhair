package suwop.w4.d16.assign;

import java.util.Scanner;
import java.util.StringTokenizer;
//7(1)
public class Ex7_2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String[] strs=new String[10];
		String str=" ";
		int words=0;
		
		while(true) {
			words=0;
			System.out.print(">> ");
			str=sc.nextLine();
			if(str.equals("그만"))break;
			strs=str.split(" ");
			
			for(int i=0;i<strs.length;i++) {
				if(strs[i]==null)break;
					
				words++;
			}
			System.out.println("어절 개수는 "+words);
		
		}//while end
		System.out.println("종료합니다...");
	}

}
