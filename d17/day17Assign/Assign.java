package w4.day17;

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


public class Assign {
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
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
