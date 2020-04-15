package json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class Json_write {

	//1.JSONObject, 2.JSONArray, JSONTokener
	//1. {key:value, key:value,...} Map과같은
	//2.[{...},{...},...] listArray와 같은
	
	public static void main(String[] args) throws IOException {
		
		JSONObject member = new JSONObject();
		member.put("no", 1);
		member.put("name", "홍길동");
		member.put("phone", "010-1111-1111");
		member.put("email", "hong@naver.com");
		
		
		JSONArray memberArr = new JSONArray();
	
		memberArr.put(member);
		
		member = new JSONObject();
		member.put("no", 2);
		member.put("name", "이소림");
		member.put("phone", "010-2222-2222");
		member.put("email", "me@naver.com");
		
		memberArr.put(member);
		
		member = new JSONObject();
		member.put("no", 3);
		member.put("name", "이당");
		member.put("phone", "010-3333-3333");
		member.put("email", "sis@naver.com");
		
		memberArr.put(member);
		
		member = new JSONObject();
		member.put("no", 4);
		member.put("name", "이훙");
		member.put("phone", "010-4444-4444");
		member.put("email", "bro@naver.com");
		
		memberArr.put(member);
		
		member = new JSONObject();
		member.put("no", 5);
		member.put("name", "준");
		member.put("phone", "010-5555-5555");
		member.put("email", "fa@naver.com");
		
		memberArr.put(member);
		
		member = new JSONObject();
		member.put("no", 6);
		member.put("name", "순");
		member.put("phone", "010-6666-6666");
		member.put("email", "ma@naver.com");
		
		memberArr.put(member);
		
		//멤버들을 포함할 가장 큰 오브젝트
		JSONObject wangjsonObj = new JSONObject();
		wangjsonObj.put("memberArr", memberArr);//위에있었던 arr도 넣고
		
		wangjsonObj.put("seq", 7);//다음올차례
		
		
		
		
		//파일입출력
		File file = new File("C:/JSP/0414swing_mvc/json/member.json");
		
		if(!file.exists()) {
			if(file.createNewFile()) {
				System.out.println("새파일이 생성되었습니다.");
			}
		}
		
		FileWriter fw = new FileWriter(file);
		fw.write(wangjsonObj.toString(2));
		System.out.println("파일 쓰기 완료!");
		
		//**항상 닫아줘야한다
		if(fw!=null) {
			fw.close();
		}
		
		
	}

}
