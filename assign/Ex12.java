package suwop.w4.d16.assign;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex12 {
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	public static void main(String[] args) {
		System.out.print("겜블링 게임에 참여할 선수 숫자>> ");
		int playerNum=Integer.parseInt(sc.nextLine());
		Person[] parr=new Person[playerNum];
		
				
		//이름받기
		for(int i=0;i<parr.length;i++) {
			System.out.print((i+1)+"번째 선수 이름>>");
			parr[i]=new Person(sc.nextLine());
		}
		
		while(true) {
			for(int i=0;i<parr.length;i++) {
				System.out.print("["+parr[i].getName()+"]:<Enter> ");
				String str=sc.nextLine();
				if(str.isEmpty()) {//엔터치면
					System.out.print("\t");
					for(int j=0;j<3;j++) {
						parr[i].gets[j]=rand.nextInt(3)+1;
						System.out.print(parr[i].gets[j]+" ");
					}
					if(parr[i].gets[0]==parr[i].gets[1]&&parr[i].gets[1]==parr[i].gets[2]) {
						System.out.println(parr[i].getName()+"님이 이겼습니다!");
						return;
					} else 
						System.out.println("아쉽군요!");
					
				}
			}//for문
		}
	}

}
