package suwop.w4.d16.assign;

import java.util.Scanner;
import java.util.StringTokenizer;
//7(1)
public class Ex07 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		StringTokenizer st;
		String str=" ";
		int words=0;
		
		while(true) {
			words=0;
			System.out.print(">> ");
			str=sc.nextLine();
			if(str.equals("그만"))break;
			
			st=new StringTokenizer(str," ");
			
			while(st.hasMoreTokens()) {
				st.nextToken();
				words++;
			}
			System.out.println("어절 개수는 "+words);
		
		}//while end
		System.out.println("종료합니다...");
	}

}
