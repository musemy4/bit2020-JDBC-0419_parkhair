package w4.day17;

import java.util.*;

class Word{
	private String eng,kor;
	
	public Word(String eng, String kor) {
		this.eng=eng;
		this.kor=kor;
	}

	//게터
	public String getEng() {
		return eng;
	}

	public String getKor() {
		return kor;
	}
	
	
	
}




public class EngTest {
	static Scanner sc = new Scanner(System.in);
	static Random rand=new Random();
	public static void main(String[] args) {
		Vector<Word> p=new Vector<Word>();
		p.add(new Word("painting","그림"));
		p.add(new Word("emotion","감정"));
		p.add(new Word("baby","아기"));
		p.add(new Word("error","오류"));
		p.add(new Word("eye","눈"));
		p.add(new Word("society","사회"));
		p.add(new Word("doll","인형"));
		p.add(new Word("bear","곰"));
		p.add(new Word("picture","사진"));
		p.add(new Word("human","인간"));
		p.add(new Word("sculpture","조각상"));
		p.add(new Word("deal","거래"));
		p.add(new Word("see","보기"));
		p.add(new Word("computer","컴퓨터"));
		p.add(new Word("rice","쌀"));


		System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 "+p.size()+"개의 단어가 들어 있습니다");
		while(true) {
			Set<Word> gets=new HashSet();
			
			//4개 뽑기
			while(gets.size()!=4) {
				gets.add(p.get(rand.nextInt(14)+1));
				//System.out.println(gets);
			}
			
			Iterator<Word> it = gets.iterator();
			Vector<Word> quiz=new Vector<Word>();
			int i=0;
			while(it.hasNext()) {
				Word n=it.next();
				quiz.add(n);
				System.out.print("("+(i+1)+")"+n.getKor());
				i++;
			}
			
			
			//질문
			int dap=rand.nextInt(3)+1;
			System.out.println("\n"+quiz.get(dap).getEng()+"?");//영어질문
			System.out.print(">> ");
			//우리는 숫자로 답한다..
			int answer=Integer.parseInt(sc.nextLine());//입력한다
			//System.out.println(dap);			
			
			if(answer==-1) {
				System.out.println("\"명품영어\"를 종료합니다...");
				return;
			}
			
			if(answer-1==dap) {
				System.out.println("Exellent!");
			} else {
				System.out.println("No.........!!!!!!");
			}
			 
		}
		
	}

}
