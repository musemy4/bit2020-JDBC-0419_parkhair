package java_suwop_d21.test.json;

import java.io.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
//���� �о����
public class Ex01_2 {

	public static void main(String[] args) throws IOException {
		String filepath = "students.json";
//		InputStream inputStream = Ex01_2.class.getResourceAsStream(filepath);
//		if(inputStream == null) {
//			System.out.println("������ ������ �����ϴ�!");
//			return;
//		}
		
//		JSONTokener tokener = new JSONTokener(inputStream);
	
		File file = new File(filepath);
		if(file.exists()) {
			
			FileReader fileReader;
			
			
			fileReader= new FileReader(file);
			
			JSONTokener tokener = new JSONTokener(fileReader);//������ �������� �ڸ���	
			JSONObject peopleObj = new JSONObject(tokener);
			
			
			
			
		}
	
	}

}
