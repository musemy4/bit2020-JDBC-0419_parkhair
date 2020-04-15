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
			
			//한명씩 받을 벡터
			Vector<Vector> member = new Vector<>();
			for(int i=0;i<jsonArray.length();i++) {
				JSONObject obj = jsonArray.getJSONObject(i);
				Vector v = new Vector<>();
				v.add(obj.get("no"));
				v.add(obj.get("name"));
				v.add(obj.get("phone"));
				v.add(obj.get("email"));
				member.add(v);
			}
			
			if(member!=null) {
				for(int i=0;i<member.size();i++) {
					System.out.println("no: "+member.get(i).get(0));
					System.out.println("name: "+member.get(i).get(1));
					System.out.println("phone: "+member.get(i).get(2));
					System.out.println("email: "+member.get(i).get(3));
					
					System.out.println("-------------------------");
				}
			}
			
			
		}
		
	}

}
