package suwop.w4.d17;

import java.io.*;

public class Ex02_stream {

	public static void main(String[] args) throws IOException {
		int data=0;
		FileInputStream fis =new FileInputStream("E:\\test.data");
		OutputStream os = System.out;
	
		while((data=fis.read())!=-1) {
			os.write(data);
		}
	
	}
	
	
	public static void test3(String[] args) throws IOException {
		int dat=0;
		InputStream is = System.in;
		FileOutputStream fos = new FileOutputStream("E:\\test.data");
		
		System.out.println("�����͸� �Է��ϼ���(������� Ctrl+z) >>>");//ctrl+z=end of file�̶�¶�
	
		while((dat=is.read())!=-1) {
			fos.write(dat);
		}
	}
	
	
	public static void test2(String[] args) throws IOException {
		InputStream in =System.in;
		OutputStream out =System.out;
		
		System.out.print("�Է�(�������� ctrl+z)");
		
		int data=0;
		while((data=in.read())!=-1) {
			out.write(data);
			
		}
	}
	
	
	
	public static void test(String[] args) throws IOException {
		int data=0;
		System.out.println("�����͸� �Է� �ϼ���.(���� ctrl+z) >> ");
		while((data=System.in.read())!=-1) {
			System.out.print((char)data); //�������·� �����״� 
		}
	}
}
