package json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Json_read {

	public static void main(String[] args) throws IOException {
		String filepath="src/member.json";
		
		File file = new File(filepath);
		
		if(file.exists()) {
			FileReader reader =new FileReader(file);
			
			//읽어온 json파일을 짜른다 큰단위로 우선
			JSONTokener token = new JSONTokener(reader);
			JSONObject JsonObj = new JSONObject(token);
		
			JSONArray jsonArray = JsonObj.getJSONArray("memberArr");
			
			for(int i=0;i<jsonArray.length();i++) {
				JSONObject obj = jsonArray.getJSONObject(i);
				System.out.println("no: "+obj.get("no"));
				System.out.println("name: "+obj.get("name"));
				System.out.println("phone: "+obj.get("phone"));
				System.out.println("email: "+obj.get("email"));
				System.out.println("----------------------------");
			}
		
		}
		
	}

}
