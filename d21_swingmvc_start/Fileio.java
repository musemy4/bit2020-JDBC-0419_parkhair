package io.examples;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Fileio {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		File f = new File("E:/");
		File[] subfiles = f.listFiles();
		File[] isfile = new File[10];
		
		System.out.println("E:/ 의 파일들은 총 "+subfiles.length+"개 입니다");
		int cnt=0;
		int j=0;
		
		for(int i=0;i<subfiles.length;i++) {
			if(!subfiles[i].isFile()) {
				subfiles[i]=null;
				cnt++;
				continue;
			}
			isfile[j]=subfiles[i];
			j++;
			
		}
		
		
		
		long max=0;
		int idx=0;
		
		for(int i=0;i<isfile.length;i++) {
				System.out.println(isfile[i].getName());
				System.out.println("파일크기: "+isfile[i].length());
				System.out.println("-------------------");
				if(max<isfile[i].length()) {
					max=isfile[i].length();
					idx=i;
				}
			}
		
		
		File maxf =isfile[idx];
		System.out.println("E:/ 에서 가장큰 파일은"+maxf.getName()+" "+maxf.length()+"바이트 짜리 입니다");
		
	
	}
	
	
	
	
	
	
	
	public static void file1(String[] args) {
		File file = new File("E:/test.txt");//1kb
		//File file = new File("E:/","test.txt");
		System.out.println("파일의 크기: "+file.length());
		System.out.println("파일의 이름: "+file.getName());
		System.out.println("파일의 가장 상위 폴더? >>"+file.getParent());
		System.out.println("파일의 전체 패쓰 >> "+ file.getPath());
		
		if(file.isFile()) {
			System.out.println(file.getPath()+"는 파일입니다");
		} else if(file.isDirectory()) {
			System.out.println(file.getPath()+"는 디렉터리입니다");
		}
		
		
	}
	
	
	public static void picCopy(String[] args) throws IOException {
		File copy=new File("E:/a.jpg");
		File paste=new File("E:/b.jpg");
		
		int c;
		FileInputStream fi =new FileInputStream(copy);
		FileOutputStream fo =new FileOutputStream(paste);
		
		System.out.println("a.jpg를 b.jpg로 복사합니다");
		System.out.println("10%마다 *를 출력합니다.");
		
		byte[] buf = new byte[30*279];
		
		while(true) {
			int p=fi.read(buf);
			fo.write(buf,0,p);
			System.out.print("*");
			if(p<buf.length) {
				break;
			}
		}
		
		fi.close();
		fo.close();
		
	}
	
	public static void hap(String[] args) throws IOException {
		FileReader reader;
		File file = new File("E:/hap.txt");
		FileWriter fw = new FileWriter(file);
		
		System.out.println("경로명부터 파일까지를 입력해주세요");
		System.out.print("첫번째 파일명 입력 >> ");
		String one = sc.nextLine();
		System.out.print("두번째 파일명 입력 >> ");
		String two = sc.nextLine();
		reader=new FileReader(one);
		
		int c;
		while((c=reader.read())!=-1) {//파일을 읽어드리는데 -1이 나올때까지
			fw.write((char)c);//문자로 한자한자쓴다
		}
		reader.close();
		
		reader=new FileReader(two);
		while((c=reader.read())!=-1) {//파일을 읽어드리는데 -1이 나올때까지
			fw.write((char)c);
		}
		reader.close();
		fw.close();
		
		System.out.println("E:/hap.txt에 저장하였습니다");
	
	}
	
	public static void fileReader3(String[] args) throws IOException {
		sc=new Scanner(new FileReader("E:/newtext.txt"));
		int idx=1;
		while(sc.hasNext()) {
			String line=sc.nextLine();
			System.out.println(idx+": "+line);
			idx++;
		}
		
	}
	
	public static void fileReader2(String[] args) throws IOException {
		sc=new Scanner(new FileReader("E:/newtext.txt"));
		while(sc.hasNext()) {
			String line=sc.nextLine();
			line=line.toUpperCase();
			System.out.println(line);
		}
	}
	
	public static void fileReader(String[] args) throws IOException {
		sc= new Scanner(new FileReader("E:/newtext.txt"));
		System.out.println("E:/newtext.txt의 글을 가져옵니다");
		while(sc.hasNext()) {
			String line=sc.nextLine();
			System.out.println(line);
		}
		
	
	}
	
	public static void fileWriter(String[] args) throws IOException {
		FileWriter fw = null;
		fw= new FileWriter("E:/newtext.txt");//경로를 넣는다
		System.out.println("시 구절을 써보자");
		while(true) {
			System.out.print(">>  ");
			String line = sc.nextLine();
			if(line.equals("그만")) {
				System.out.println("E:/newtext.txt에 저장하였습니다");
				break;
			}
			
			//시작지점, 길이
			fw.write(line, 0, line.length());
			fw.write("\r\n",0,2);
			
		}
		fw.close();
	
	}

}
