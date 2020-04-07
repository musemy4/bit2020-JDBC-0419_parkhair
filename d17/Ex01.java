package suwop.w4.d17;

import java.util.*;

public class Ex01 {
	private StringBuffer buffer;
	
	Scanner sc=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	private String word;
	private StringTokenizer token;//선언만했음
	private String key, value;
	
	public Ex01() {
		play();	
	}
	
	public void play() {
		System.out.print(">> ");
		String str=sc.nextLine();//문장을 담아주고
		
		//스트링버퍼: 저장된 문자열의 수정이 가능하다. 문자열의 크기가 늘어나면 내부 버퍼 크기를 자동 조절
		
		
		buffer = new StringBuffer(str);//스트링 버퍼를 생성하고
		System.out.println(buffer);
		
		while(true) {
			System.out.println("명령:");
			word=sc2.next();
			
			if(word.equals("그만")) {
				System.out.println("종료합니다");
				System.exit(0);
			}
			token = new StringTokenizer(word,"!");//받은 명령을 !로 짜름
			if(token.countTokens()!=2) {//토큰의 수를 세기도함 오~
				System.out.println("잘못된 명령입니다");
			} else {
				key=token.nextToken();//!를 중심으로하나씩 키값
				value=token.nextToken();//value값으로 담고
				
				int start=buffer.indexOf(key);
				if(start ==-1) {
					System.out.println("찾을 수 없습니다");
				} else {
					StringTokenizer st = new StringTokenizer(new String(buffer)," ");
					boolean flag = false;
					while(st.hasMoreTokens()) {
						if(key.equals(st.nextToken())){
							flag=true;
							break;
						}
					}
					if(flag) {
						int end=start+key.length();
						buffer.replace(start, end, value);
						System.out.println(buffer);
					} else {
						System.out.println("찾을 수 없습니다!");
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
	
	
}
