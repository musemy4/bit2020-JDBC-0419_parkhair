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
		
		System.out.println("E:/ �� ���ϵ��� �� "+subfiles.length+"�� �Դϴ�");
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
				System.out.println("����ũ��: "+isfile[i].length());
				System.out.println("-------------------");
				if(max<isfile[i].length()) {
					max=isfile[i].length();
					idx=i;
				}
			}
		
		
		File maxf =isfile[idx];
		System.out.println("E:/ ���� ����ū ������"+maxf.getName()+" "+maxf.length()+"����Ʈ ¥�� �Դϴ�");
		
	
	}
	
	
	
	
	
	
	
	public static void file1(String[] args) {
		File file = new File("E:/test.txt");//1kb
		//File file = new File("E:/","test.txt");
		System.out.println("������ ũ��: "+file.length());
		System.out.println("������ �̸�: "+file.getName());
		System.out.println("������ ���� ���� ����? >>"+file.getParent());
		System.out.println("������ ��ü �о� >> "+ file.getPath());
		
		if(file.isFile()) {
			System.out.println(file.getPath()+"�� �����Դϴ�");
		} else if(file.isDirectory()) {
			System.out.println(file.getPath()+"�� ���͸��Դϴ�");
		}
		
		
	}
	
	
	public static void picCopy(String[] args) throws IOException {
		File copy=new File("E:/a.jpg");
		File paste=new File("E:/b.jpg");
		
		int c;
		FileInputStream fi =new FileInputStream(copy);
		FileOutputStream fo =new FileOutputStream(paste);
		
		System.out.println("a.jpg�� b.jpg�� �����մϴ�");
		System.out.println("10%���� *�� ����մϴ�.");
		
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
		
		System.out.println("��θ���� ���ϱ����� �Է����ּ���");
		System.out.print("ù��° ���ϸ� �Է� >> ");
		String one = sc.nextLine();
		System.out.print("�ι�° ���ϸ� �Է� >> ");
		String two = sc.nextLine();
		reader=new FileReader(one);
		
		int c;
		while((c=reader.read())!=-1) {//������ �о�帮�µ� -1�� ���ö�����
			fw.write((char)c);//���ڷ� �������ھ���
		}
		reader.close();
		
		reader=new FileReader(two);
		while((c=reader.read())!=-1) {//������ �о�帮�µ� -1�� ���ö�����
			fw.write((char)c);
		}
		reader.close();
		fw.close();
		
		System.out.println("E:/hap.txt�� �����Ͽ����ϴ�");
	
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
		System.out.println("E:/newtext.txt�� ���� �����ɴϴ�");
		while(sc.hasNext()) {
			String line=sc.nextLine();
			System.out.println(line);
		}
		
	
	}
	
	public static void fileWriter(String[] args) throws IOException {
		FileWriter fw = null;
		fw= new FileWriter("E:/newtext.txt");//��θ� �ִ´�
		System.out.println("�� ������ �Ẹ��");
		while(true) {
			System.out.print(">>  ");
			String line = sc.nextLine();
			if(line.equals("�׸�")) {
				System.out.println("E:/newtext.txt�� �����Ͽ����ϴ�");
				break;
			}
			
			//��������, ����
			fw.write(line, 0, line.length());
			fw.write("\r\n",0,2);
			
		}
		fw.close();
	
	}

}
