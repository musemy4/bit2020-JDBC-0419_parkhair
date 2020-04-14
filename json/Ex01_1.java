package java_suwop_d21.test.json;

import java.io.*;

import org.json.*;
//파일 출력하기
public class Ex01_1 {
	//JSON-in(org.json)
	//GSON-google
	//JSON 관련 라이브러리는 많다.
	
	public static void main(String[] args) throws IOException {
		  // JSONObject, JSONArray, JSONTokener ...
		  // {key:value, key:value ...}
		  // [{...}, {...} ...]
		JSONObject people = new JSONObject();
		people.put("name", "홍길동");
		people.put("email", "hong@naver.com");
		people.put("phone", "010-3333-3333");
		
		JSONArray peopleArr = new JSONArray();
		peopleArr.put(people);//하나넣고
		
		System.out.println(peopleArr.toString(2));
		System.out.println("---------------------");
		
		people = new JSONObject();
		people.put("name", "콩쥐");
		people.put("email", "kong@naver.com");
		people.put("phone", "010-2222-2222");
		people.put("gender", "male");
		peopleArr.put(people);//둘째넣고
		
		System.out.println(peopleArr.toString(2));
		System.out.println("---------------------");
		
		people = new JSONObject();
		people.put("name", "팥쥐");
		people.put("email", "pot@naver.com");
		people.put("phone", "010-3333-3333");
		peopleArr.put(people);//셋째넣고
		
		System.out.println(peopleArr.toString(2));
		System.out.println("---------------------");
		
		
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("peopleArr",peopleArr);
		
		jsonObj.put("cnt",2);
		System.out.println(jsonObj.toString(2));
		
		
		//파일입출력
		File file = new File("E:/peoples.json");
		
		if(!file.exists()) {
			if(file.createNewFile()) {
				System.out.println("새 파일이 생성 되었습니다!");
			}
		}
		
		FileWriter fw = new FileWriter(file);
		fw.write(jsonObj.toString(2));
		System.out.println("파일 쓰기 완료!");
		if(fw!=null) {
			fw.close();
		}
		
		
	}
	
}
