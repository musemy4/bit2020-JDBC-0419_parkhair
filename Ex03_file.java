package suwop.w4.d17;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class Ex03_file {

	public static void main(String[] args) throws IOException {
		String spec = "https://i.pinimg.com/236x/d9/82/f4/d982f4ec7d06f6910539472634e1f9b1.jpg";
		URL url = new URL(spec);
		
		InputStream is = url.openStream();
		FileOutputStream fos=null;
		
		File file = new File("test.jpg");
		if(!file.exists()) {
			if(file.createNewFile()) {
				fos = new FileOutputStream(file);
				int data=0;
				while((data=is.read())!=-1){
					fos.write(data);
				}
			fos.close();
			}
		}
		if(is!=null)is.close();
		if(fos!=null)fos.close();
	}
	
	public static void test2(String[] args) {
		File file = new File("./src/suwop/w4/d16");//.�� ������
		if(file.isDirectory()) {
			System.out.println("���丮 �Դϴ�");
			String[] fileNames = file.list();
			for(String fileName:fileNames) {
				System.out.println(fileName);
			}
		}
		if(file.canRead()) {
			System.out.println("�������ֽ��ϴ�");
			System.out.println(file.getAbsolutePath());		
		}	
	}
	
	public static void test(String[] args) throws IOException {
		File file = new File("test.txt");
		
		if(file.exists()) {
			System.out.println("������ ���� �մϴ�.");
			if(file.delete()) {
				System.out.println("������ ���� �Ǿ����ϴ�");
			}
		} else {
			System.out.println("������ ������մϴ�");
			if(file.createNewFile()) {
				System.out.println("�� ������ ���� �Ǿ����ϴ�");
			}
		}

	}
}
