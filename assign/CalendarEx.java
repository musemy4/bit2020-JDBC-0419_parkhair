package suwop.w4.d16.assign;

import java.util.Calendar;

//5
public class CalendarEx {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int hour=now.get(Calendar.HOUR_OF_DAY);
		int minuate=now.get(Calendar.MINUTE);
		
		System.out.println("���� �ð��� "+hour+"�� "+minuate+"���Դϴ�");
		if(hour>=4&&hour<12)System.out.println("Good Morning");
		else if(hour<18)System.out.println("Good Afternoon");
		else if(hour<22)System.out.println("Good Evening");
		else System.out.println("Good Night");
	}

}
