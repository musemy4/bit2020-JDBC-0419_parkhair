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
		File file = new File("./src/suwop/w4/d16");//.은 현재경로
		if(file.isDirectory()) {
			System.out.println("디렉토리 입니다");
			String[] fileNames = file.list();
			for(String fileName:fileNames) {
				System.out.println(fileName);
			}
		}
		if(file.canRead()) {
			System.out.println("읽을수있습니다");
			System.out.println(file.getAbsolutePath());		
		}	
	}
	
	public static void test(String[] args) throws IOException {
		File file = new File("test.txt");
		
		if(file.exists()) {
			System.out.println("파일이 존재 합니다.");
			if(file.delete()) {
				System.out.println("파일이 삭제 되었습니다");
			}
		} else {
			System.out.println("파일이 존재안합니다");
			if(file.createNewFile()) {
				System.out.println("새 파일이 생성 되었습니다");
			}
		}

	}
}
