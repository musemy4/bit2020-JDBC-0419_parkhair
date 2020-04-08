package suwop.w4.d17;

import java.io.*;
import java.util.*;

public class Hangman {
	static Scanner sc= new Scanner(System.in);
	static Random rand = new Random();
	public static void main(String[] args) throws IOException {
		Vector<String> wordV = new Vector<String>();
		
		String fileName="E:/words.txt";
		String line="";
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		while(true) {
			while((line=br.readLine())!=null) {
				//System.out.println(line);
				wordV.add(line);
			}
			
			int seedLine=rand.nextInt(wordV.size());
			String que=wordV.get(seedLine);//정해진 단어**
			StringBuffer queB = new StringBuffer(que.toLowerCase());//대문자빼그냥
			//System.out.println(queB);
			
			Set<Integer> seeds = new HashSet<Integer>();
			//두개가 될때까지 받는다
			int seed[]=new int[2];
			int i=0;
			while(seeds.size()!=2) {
				seed[i]=rand.nextInt(que.length());
				seeds.add(seed[i]);
				i++;
			}
			//System.out.println(seeds); 이게 당첨된 랜덤 idx두개
			
			System.out.println("지금부터 행맨 게임을 시작합니다");
			int cnt=0;
			boolean flag0=true, flag1=true;
			while(true) {
				if(cnt==5) {
					System.out.println("5번 실패 하였습니다.");
					System.out.println(que);
					break;
				}
				if(flag0==false&&flag1==false)break;
				for(int j=0;j<queB.length();j++) {
					if(flag0==true&&j==seed[0]) {
						System.out.print("-");
						continue;
					}
					if(flag1==true&&j==seed[1]) {
						System.out.print("-");
						continue;
					}
					System.out.print(queB.charAt(j));//얘가 다 찍어냄
				}
				
				System.out.println();
				System.out.print(">> ");
				String dap = sc.nextLine().trim();
		 		
				if(queB.charAt(seed[0])==dap.charAt(0)) {
					System.out.println("맞혔습니다!");
					queB.replace(seed[0], seed[0]+1,dap);
					flag0=false;
				}
				if(queB.charAt(seed[1])==dap.charAt(0)) {
					System.out.println("맞혔습니다!");
					queB.replace(seed[1], seed[1]+1,dap);
					flag1=false;
				}
				
				cnt++;
			}
			i=0;
			System.out.print("@ Next 문제?(y/n) :");
			String sayno=sc.nextLine();
			
			if(sayno.toLowerCase().equals("y"))continue;
			else System.out.println("안녕~");break;
		}	
		
		
	}//main end
	
	
}
