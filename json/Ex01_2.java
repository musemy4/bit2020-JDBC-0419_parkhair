package java_suwop_d21.test.json;

import java.io.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
//파일 읽어오기
public class Ex01_2 {

	public static void main(String[] args) throws IOException {
		String filepath = "students.json";
//		InputStream inputStream = Ex01_2.class.getResourceAsStream(filepath);
//		if(inputStream == null) {
//			System.out.println("파일을 읽을수 없습니다!");
//			return;
//		}
		
//		JSONTokener tokener = new JSONTokener(inputStream);
	
		File file = new File(filepath);
		if(file.exists()) {
			
			FileReader fileReader;
			
			
			fileReader= new FileReader(file);
			
			JSONTokener tokener = new JSONTokener(fileReader);//무엇을 기준으로 자르나	
			JSONObject peopleObj = new JSONObject(tokener);
			
			
			
			
		}
	
	}

}
