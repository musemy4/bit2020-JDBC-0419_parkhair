package suwop.w4.d16.assign;

import java.util.Calendar;
import java.util.Scanner;
//6
public class TenSec {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Calendar now;
		int seconds=0;
		
		
		String[] player=new String[] {"황기태","이재문"};
		int[] diff=new int[2];
		int p_s=0;
		int p_e=0;
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다");
		
		for(int i=0;i<player.length;i++) {
			System.out.print(player[i]+" 시작 'Enter'키 >> ");
			String enter=sc.nextLine();
			if(enter.isEmpty()) {
				now=Calendar.getInstance();
				seconds=now.get(Calendar.SECOND);
				System.out.println("	현재 초 시간: "+ seconds);
				p_s=seconds;
			}	
			
			
			System.out.print("10초 예상 후 'Enter'키 >> ");
			enter=sc.nextLine();
			if(enter.isEmpty()) {
				now=Calendar.getInstance();
				seconds=now.get(Calendar.SECOND);
				System.out.println("	현재 초 시간: "+ seconds);
				p_e=seconds;
			}
			
			int sub=0;
			if(p_s>p_e) {
				sub=p_e+60-p_s;
			}else sub=p_e-p_s;	
			
			diff[i]=sub;			
			
		}
		
		//결과발표
		for(int i=0;i<2;i++) {
			System.out.print(player[i]+"의 결과 "+diff[i]+", " );
		}

		System.out.print("승자는 ");
		//10하고의 차이가 적은애가 승자
		Math.abs(10-diff[0]);
		System.out.println(Math.abs(10-diff[0])<Math.abs(10-diff[1])?player[0]
				:Math.abs(10-diff[0])==Math.abs(10-diff[1])?"둘다~":player[1]);
	}

}
