package suwop.w4.d17;

import java.util.*;

class Student2{
	private String name;
	private String major;
	private int idx;
	private double avg;
	
	public Student2(String name, String major, int idx, double avg) {
		this.name=name;
		this.major=major;
		this.idx=idx;
		this.avg=avg;
	}

	//게터
	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public int getIdx() {
		return idx;
	}

	public double getAvg() {
		return avg;
	}

	@Override
	public String toString() {
		return name+", " + major + ", " + idx + ", " + avg;
	}
}

class Location{
	private String name;
	private int k;
	private int w;
	
	public Location(String name, int k, int w) {
		this.name=name;
		this.k=k;
		this.w=w;
	}

	//게터스
	public String getName() {
		return name;
	}

	public int getK() {
		return k;
	}

	public int getW() {
		return w;
	}

	@Override
	public String toString() {
		return name + " " + k + " " + w;
	}

}

interface IStack<T>{
	T pop();
	boolean push(T ob);
}

class myStack<T> implements IStack<T>{
	int top;
	Object[] stck;
	
	public myStack() {
		top=0;
		stck= new Object[10];
	}
	//push 삽입
	@Override
	public boolean push(T ob) {
		if(top==10) {
			System.out.println("더 이상 push 할수 없습니다!");
			return false;
		}
		
		stck[top]=ob;
		top++;
		return true;
	}
	
	//pop 뒤에서부터 꺼내기
	@Override
	public T pop() {
		if(top==0) {
			System.out.println("더 이상 꺼낼 것이 없네요");
			return null;
		} else top--;

		return (T)stck[top];
	}

	
}

class Nation{
	private String country;
	private String capital;
	
	//생성자
	public Nation(String c, String a) {
		this.country=c;
		this.capital=a;
	}

	//게터
	public String getCountry() {
		return country;
	}

	public String getCapital() {
		return capital;
	}
}

interface Shape{
	public void draw();
}

class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class Line implements Shape{
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect implements Shape{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}


public class Assign {
	static Scanner sc= new Scanner(System.in);
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
		p.add(new Word("kimbab","김밥"));
		p.add(new Word("jjajangmyeon","짜장면"));
		p.add(new Word("juice","주스"));

		
		System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
		outer: while (true) {
			int choose=0;
			System.out.print("1.단어 테스트 2.단어 삽입 3.종료 >> ");
			choose = Integer.parseInt(sc.nextLine());
			if (choose == 1) {
				System.out.println("현재 " + p.size() + "개의 단어가 들어 있습니다.-1을 입력하면 종료합니다");
				while (true) {
					Set<Word> gets = new HashSet();

					//4개 뽑기
					while (gets.size() != 4) {
						gets.add(p.get(rand.nextInt(p.size())));
						//System.out.println(gets);
					}

					Iterator<Word> it = gets.iterator();
					Vector<Word> quiz = new Vector<Word>();
					int i = 0;
					//뽑힌 4개를 벡터에 넣어서 다루기 쉽게함
					while (it.hasNext()) {
						Word n = it.next();
						quiz.add(n);
						System.out.print("(" + (i + 1) + ")" + n.getKor());
						i++;
					}

					//질문
					int dap = rand.nextInt(3) + 1;
					//우리는 숫자로 답한다..
					int answer = 0;
					try {
						System.out.println("\n" + quiz.get(dap).getEng() + "?");//영어질문
						System.out.print(">> ");
						answer = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
						System.out.println("숫자로 답하세요!!!!");
						continue;
					}

					if (answer == -1) {
						System.out.println();
						break;
					}

					if (answer - 1 == dap) {
						System.out.println("Exellent!");
						for (int m = 0; m < p.size(); m++) {
							if (quiz.get(dap).getEng().equals(p.get(m).getEng()))
								p.remove(m);
						}
					} else {
						System.out.println("No.........!!!!!!");
					}
				}
			} else if (choose == 2) {
				System.out.println("영어단어에 그만을 입력하면 입력을 종료합니다.");
				String eng = null;
				String kor = null;
				while (true) {
					boolean flag = true;
					System.out.print("영어 한글 입력 >> ");
					eng = sc.next();
					kor = sc.next();
					sc.nextLine();

					if (eng.equals("그만")) break outer;//**
					
					for (int i = 0; i < p.size(); i++) {
						if (p.get(i).getEng().equals(eng)) {
							System.out.println(eng + "은 이미 있는 단어입니다!");
							flag = false;
							break;
						}
					}
					if (flag) {
						p.add(new Word(eng, kor));
					}
					
				}
				
							
			} else if (choose == 3) {
				System.out.println("\"명품영어\"를 종료합니다");
				return;
			} 
			
			
			//else들 다 빠져나온곳
			
		}//젤큰 while문
		
		
	}
	
	public static void test11_2(String[] args) {
		HashMap<String, String> na2=new HashMap<String, String>();
		na2.put("우간다", "캄팔라");
		na2.put("이탈리아", "로마");
		na2.put("이라크", "바그다드");
		na2.put("가나", "아크라");
		na2.put("괌", "하갓냐");
		na2.put("그리스", "아테네");
		na2.put("네덜란드", "암스테르담");
		na2.put("네팔", "카드만두");
		na2.put("노르웨이", "오슬로");
		na2.put("덴마크", "코펜하겐");
		na2.put("라오스", "비엔티안");
		na2.put("몽골", "울란바토르");
		na2.put("베트남", "하노이");
		na2.put("브라질", "브라질리아");
		na2.put("스웨덴", "스톡홀름");
		na2.put("아르헨티나", "부에노스아이레스");
		
		System.out.println("**** 수도 맞추기 게임 ****");
		System.out.println("현재 "+na2.size()+"개의 나라와 수도가 입력되어 있습니다");
		while (true) {
			System.out.print("1.입력 2.퀴즈 3.종료>> ");
			int cho = sc.nextInt();
			if (cho == 1) {
				String country = null;
				String capital = null;
				while (true) {
					System.out.print("나라와 수도입력" + (na2.size()+1) + ">> ");
					country = sc.next();
					if(country.equals("그만"))break;

					capital = sc.next();
					boolean flag=true;
					for(int i=0;i<na2.size();i++) {
						if(na2.containsKey(country)) {
							System.out.println(country + "는 이미 있습니다!");
							flag=false; break;
						}
					}//for이 끝나고도 없으면 추가한다
					if(flag) {
						na2.put(country,capital);
						
					}	
				}//1번 반복
			} else if (cho == 2) {
				//해쉬맵은 차례가 없다 이터레이터로 뽑아주자
				
				String country2=null;
				String dap=null;
				while(true) {
					Set<String> keys=na2.keySet();
					Iterator<String> it=keys.iterator();
					country2=it.next();
					System.out.print(country2+ "의 수도는? : ");
					dap=sc.next();
					if(dap.equals("그만"))return;
					
					if(dap.equals(na2.get(country2))) {
						System.out.println("정다압~~~~~~!!!!");
						na2.remove(country2);
					
					} else {
						System.out.println("틀림!!!!!");
						na2.remove(country2); //요기쬐꿈 아쉬움***** continue하면 틀린답이 계속나옴
					}
				
				
				}
				
				
			} else if (cho == 3) {
				System.out.println("종료합니다");
				return;
			} else {
				System.out.println("잘못된 입력입니다");
			} 
			
			continue;
		}//큰 while끝
		
	}
		
	public static void test11_1(String[] args) {
		Vector<Nation> na=new Vector<Nation>();
		na.add(new Nation("가나","아크라"));
		na.add(new Nation("괌","하갓냐"));
		na.add(new Nation("그리스","아테네"));
		na.add(new Nation("네덜란드","암스테르담"));
		na.add(new Nation("네팔","카드만두"));
		na.add(new Nation("노르웨이","오슬로"));
		na.add(new Nation("덴마크","코펜하겐"));
		na.add(new Nation("라오스","비엔티안"));
		na.add(new Nation("몽골","울란바토르"));
		na.add(new Nation("베트남","하노이"));
		na.add(new Nation("브라질","브라질리아"));
		na.add(new Nation("스웨덴","스톡홀름"));
		
		System.out.println("**** 수도 맞추기 게임 ****");
		System.out.println("현재 "+na.size()+"개의 나라와 수도가 입력되어 있습니다");
		while (true) {
			System.out.print("1.입력 2.퀴즈 3.종료>> ");
			int cho = sc.nextInt();
			if (cho == 1) {
				String country = null;
				String capital = null;
				while (true) {
					System.out.print("나라와 수도입력" + (na.size()+1) + ">> ");
					country = sc.next();
					if(country.equals("그만"))break;

					capital = sc.next();
					boolean flag=true;
					for(int i=0;i<na.size();i++) {
						if(na.get(i).getCountry().equals(country)) {
							System.out.println(country + "는 이미 있습니다!");
							flag=false; break;
						}
					}//for이 끝나고도 없으면 추가한다
					if(flag) {
						na.add(new Nation(country,capital));
						
					}	
				}//1번 반복
			} else if (cho == 2) {
				while (true) {
					int seed = rand.nextInt(na.size());
					System.out.print(na.get(seed).getCountry() + "의 수도는? : ");
					String answer = sc.next();
					if(answer.equals("그만"))break;
					
					if(answer.equals(na.get(seed).getCapital())) {
						System.out.println("정답!!");
						na.remove(seed);
					} else {
						System.out.println("아닙니다!!!");
					} 
				}
			} else if (cho == 3) {
				return;
			} else {
				System.out.println("잘못된 입력입니다");
			} 
			
			continue;
		}//큰 while끝
		
	}
	
	public static void test10(String[] args) {
		Vector<Shape> v = new Vector<Shape>();
		
		System.out.println("그래픽에디터 beauty를 실행합니다");
		while(true) {
			System.out.print("1.삽입 2.삭제 3.모두보기 4.종료 >> ");
			int choose=sc.nextInt();
			
			if(choose==1) {
				System.out.print("1)line 2)rect 3)circle :");
				switch(sc.nextInt()) {
					case 1: v.add(new Line());break;
					case 2: v.add(new Rect());break;
					case 3: v.add(new Circle());break;
					default: System.out.println("잘못된 입력입니다.");
				}
			} else if(choose==2) {
				System.out.print("삭제할 도형의 위치>> ");
				int idx=sc.nextInt();
				if(idx>=v.size())System.out.println("삭제할 수 없습니다");
				else v.remove(idx-1);//우리인간은 1부터 세니까..
			} else if(choose==3) {
				for(int i=0;i<v.size();i++) {
					v.get(i).draw();
				}
			} else if(choose==4) {
				System.out.println("beauty를 종료합니다.");
				return;
			} else {
				System.out.println("잘못 누르셨습니다.");
			}
			
		}//while end
	}
	
	public static void test9(String[] args) {
		//인터페이스방식으로 선언              구현한 클래스로 생성. 오버라이드한 메서드로 실행됨
		IStack<Integer> stack = new myStack<Integer>();
		for(int i=0;i<10;i++) stack.push(i);//넣는다
			while(true) {
				Integer n= stack.pop();
				if(n==null)break;//스택이 빈경우
				System.out.print(n+" ");
			}
	}
	
	public static void test8(String[] args) {
		HashMap<String, Integer> prg = new HashMap<String, Integer>();
		
		System.out.println("** 포인트 관리 프로그램입니다 **");
		while(true) {
			System.out.print("이름과 포인트 입력>>");
			String name=sc.next();
			if(name.equals("그만"))break;
			int point=sc.nextInt();
			if(prg.containsKey(name)) {
				prg.put(name,prg.get(name)+point);
			}else prg.put(name,point);//추가한다
		
			Set<String> keys = prg.keySet();
			Iterator<String> it = keys.iterator();
			while(it.hasNext()) {
				String key=it.next();
				System.out.print("("+key+","+prg.get(key)+")");
			}
			System.out.println();
		}
	}
	
	public static void test7(String[] args) {
		HashMap<Double, String> score=new HashMap<Double, String>();
		System.out.println("미래장학금관리시스템입니다");
		for(int i=0;i<5;i++) {
			System.out.print("이름과 학점>> ");
			String name=sc.next();
			double sco=sc.nextDouble();
			score.put(sco, name);
		}
		System.out.print("장학생 선발 학점 기준 입력>> ");
		double high = sc.nextDouble();
		Set<Double> keys=score.keySet();
		Iterator<Double> it = keys.iterator();

		System.out.print("장학생 명단 : ");
		while(it.hasNext()) {
			double sco=it.next();
			if(sco>=high) {
				System.out.print(score.get(sco)+" ");
			} else continue;
		}
		
		
	
	
	}
	
	public static void test6(String[] args) {
		HashMap<String, Location> city = new HashMap<String, Location>();
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for(int i=0;i<4;i++) {
			System.out.print(">> ");
			String name=sc.next();
			int k=sc.nextInt();
			int w=sc.nextInt();
			
			city.put(name, new Location(name,k,w));
		}
		
		System.out.println("-------------------------------");
		
		//출력부분
		Set<String> keys = city.keySet();
		Iterator<String> it =keys.iterator();
		
		while(it.hasNext()) {
			String name=it.next();
			System.out.println(city.get(name));
		}
		
		System.out.println("-------------------------------");
		
		while(true) {
			System.out.print("도시이름 >> ");
			String where=sc.next();
			if(where.equals("그만"))break;
			if(city.get(where)==null) {
				System.out.println("그런나라 없음..");
				continue;
			}
			System.out.println(city.get(where));
		}
		
	}
	
	
	public static void test5_2(String[] args) {
		//키는 학생이름
		HashMap<String, Student2> st = new HashMap<String, Student2>();
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요. ");
		String[] name=new String[4];
		for(int i=0;i<4;i++) {
			System.out.print(">> ");
			name[i]=sc.next();
			String major=sc.next();
			int idx= sc.nextInt();
			double avg=sc.nextDouble();
			st.put(name[i], new Student2(name[i],major,idx,avg));
		}
		System.out.println("-------------------------------");
		for(int i=0;i<st.size();i++) {
			System.out.println("이름:"+st.get(name[i]).getName());
			System.out.println("전공:"+st.get(name[i]).getMajor());
			System.out.println("학번:"+st.get(name[i]).getIdx());
			System.out.println("이름:"+st.get(name[i]).getAvg());
			System.out.println("-------------------------------");
		}
			
			
			while(true) {
				System.out.print("학생이름 >> ");
				String who=sc.next();
				if(who.equals("그만"))break;
				if(st.get(who)==null) {
					System.out.println("그런이름 없음..");
					continue;
				}
				System.out.println(st.get(who));
			}
			
	}
	
	
	
	public static void test5_1(String[] args) {
		ArrayList<Student2> st = new ArrayList<Student2>();
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요. ");
		for(int i=0;i<4;i++) {
			System.out.print(">> ");
			String name=sc.next();
			String major=sc.next();
			int idx= sc.nextInt();
			double avg=sc.nextDouble();
			st.add(new Student2(name,major,idx,avg));
		}
		System.out.println("-------------------------------");
		
		for(int i=0;i<st.size();i++) {
			System.out.println("이름: "+st.get(i).getName());
			System.out.println("학과: "+st.get(i).getMajor());
			System.out.println("학번: "+st.get(i).getIdx());
			System.out.println("평균: "+st.get(i).getAvg());
			System.out.println("-------------------------------");
		}
		
		while(true) {
			System.out.print("학생이름 >> ");
			String name=sc.next();
			if(name.equals("그만"))break;
			for(int i=0;i<st.size();i++) {
				if(st.get(i).getName().equals(name))System.out.println(st.get(i));
			}
		}	
	}
	
	public static void test4(String[] args) {
		Vector<Integer> rain = new Vector<Integer>();
		
		while(true) {
			double sum=0;
			System.out.print("강수량 입력(0입력시 종료) >> ");
			int rains=Integer.parseInt(sc.nextLine());
			if(rains==0)break;
			rain.add(rains);
			
			for(int i=0;i<rain.size();i++) {
				System.out.print(rain.get(i)+" ");
				sum+=rain.get(i);
			}
			System.out.println("현재 평균:"+sum/rain.size());
		
		}
	}
	
	public static void test3(String[] args) {
		HashMap<String, Integer> nations= new HashMap<String, Integer>();
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		while(true) {
			System.out.print("나라이름, 인구 >> ");
			String country=sc.next();
			if(country.equals("그만"))break;
			int pop=sc.nextInt();
			nations.put(country, pop);
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			String country=sc.next();
			if(country.equals("그만"))break;
			
			
			if(nations.get(country)==null) {
				System.out.println(country+" 나라는 없습니다");
				continue;
			}
			int pop = nations.get(country);
			System.out.println(country+"의 인구는 "+pop);
		
		}
	}
	
	
	public static void test2(String[] args) {
		ArrayList<String> input=new ArrayList<String>();
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		double sum=0;
		int count=1;
		while(count!=6) {
			String one=sc.next();
			input.add(one);
			if(one.equals("A"))sum+=4.0;
			else if(one.equals("B"))sum+=3.0;
			else if(one.equals("C"))sum+=2.0;
			else if(one.equals("D"))sum+=1.0;
			else if(one.equals("F"))continue;
			else System.out.println("학점을 잘못 입력한게 있습니다");
			count++;
		}
				
		System.out.println(sum/6);
	}
	
	
	
	public static void test1(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.print("정수(-1이 입력될 떄까지)>> ");
		int bigestidx=0;
		int i=-1;
		while(true) {
			int num=sc.nextInt();
			if(num==-1)break;
			v.add(num);
			i++;
			if(v.get(i)>=v.get(bigestidx))bigestidx=i;
		}
		System.out.println("가장 큰 수는 "+v.get(bigestidx));
	
	}
}
