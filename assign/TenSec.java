package suwop.w4.d16.assign;

import java.util.Calendar;
import java.util.Scanner;
//6
public class TenSec {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Calendar now;
		int seconds=0;
		
		
		String[] player=new String[] {"Ȳ����","���繮"};
		int[] diff=new int[2];
		int p_s=0;
		int p_e=0;
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�");
		
		for(int i=0;i<player.length;i++) {
			System.out.print(player[i]+" ���� 'Enter'Ű >> ");
			String enter=sc.nextLine();
			if(enter.isEmpty()) {
				now=Calendar.getInstance();
				seconds=now.get(Calendar.SECOND);
				System.out.println("	���� �� �ð�: "+ seconds);
				p_s=seconds;
			}	
			
			
			System.out.print("10�� ���� �� 'Enter'Ű >> ");
			enter=sc.nextLine();
			if(enter.isEmpty()) {
				now=Calendar.getInstance();
				seconds=now.get(Calendar.SECOND);
				System.out.println("	���� �� �ð�: "+ seconds);
				p_e=seconds;
			}
			
			int sub=0;
			if(p_s>p_e) {
				sub=p_e+60-p_s;
			}else sub=p_e-p_s;	
			
			diff[i]=sub;			
			
		}
		
		//�����ǥ
		for(int i=0;i<2;i++) {
			System.out.print(player[i]+"�� ��� "+diff[i]+", " );
		}

		System.out.print("���ڴ� ");
		//10�ϰ��� ���̰� �����ְ� ����
		Math.abs(10-diff[0]);
		System.out.println(Math.abs(10-diff[0])<Math.abs(10-diff[1])?player[0]
				:Math.abs(10-diff[0])==Math.abs(10-diff[1])?"�Ѵ�~":player[1]);
	}

}
