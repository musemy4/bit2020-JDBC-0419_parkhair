package suwop.w4.d16.assign;

import java.util.Scanner;

public class Ex08 {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			System.out.print(str.substring(i+1));
			for(int j=0;j<=i;j++) {
			System.out.print(str.charAt(j));
			}System.out.println();
		}
	}
}
