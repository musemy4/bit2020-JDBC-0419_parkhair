package java_mvc.model;

import java.io.*;
import java.util.Vector;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class DAO {
	private String pathname = "src/Member.json";
	private FileReader reader;
	private FileWriter writer;
	
	
	//우리의 DAO는 JSON을 이용해서 정보를 저장할거다
	private JSONObject getJsonObject() {//전체를 가져온다?
		File dataFile = new File(pathname);
		
		try {
			reader = new FileReader(dataFile);
			JSONTokener token = new JSONTokener(reader);//얼만큼을 자르나
			return new JSONObject(token);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public Vector<Vector> selectAll(){
		JSONObject jsonObject = getJsonObject();
		if(jsonObject ==null) {
			System.out.println("처리할 데이터가 없습니다");
			return null;
		}
		
		JSONArray jsonArray = jsonObject.getJSONArray("memberArr");
		
		Vector<Vector> vector = new Vector<>();
		for(int i=0;i<jsonArray.length();i++) {
			JSONObject obj = jsonArray.getJSONObject(i);
			Vector v= new Vector<>();
			v.add(obj.get("no"));
			v.add(obj.get("name"));
			v.add(obj.get("phone"));
			v.add(obj.get("email"));
			vector.add(v);
		}
		
		return vector;
	}
	
	
	public void insert(DTO dto) {
		File file = new File(pathname);
		
		//1.파일이 없으면
		if(!file.exists()) {
			JSONObject newObj = new JSONObject();
			//담으려는 dto를 JSONObject화 함
			newObj.put("no",dto.getIdx());
			newObj.put("name",dto.getName());
			newObj.put("phone",dto.getPhone());
			newObj.put("email",dto.getEmail());
			
			JSONArray newArray = new JSONArray();
			newArray.put(newObj);
			
			//Array를 담는 제일큰 jsonObject
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("seq", 2);//seq:다음에 올값
			jsonObject.put("memberArr", newArray);
			
			
			//json파일에 저장함
			try {
				writer=new FileWriter(file);
				writer.write(jsonObject.toString(2));
				System.out.println("데이터저장성공!");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(reader!=null)reader.close();
					if(writer!=null)writer.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			return;
			
		}//1.파일이없으면 끝
		
		//2.파일이 있지만 담을 객체가 없다???
		JSONObject jsonObject = getJsonObject();
		if(jsonObject==null) {
			System.out.println("처리할 데이터가 없습니다!");
			return;
		}
		
		//3.자료가 이미 있을때 담자		
		JSONArray jsonArray= jsonObject.getJSONArray("memberArr");
		JSONObject obj = new JSONObject();
		int seq = jsonObject.getInt("seq");
		obj.put("no",seq++);
		obj.put("name",dto.getName());
		obj.put("no",dto.getPhone());
		obj.put("no",dto.getEmail());
		
		
	}
	
	public Vector<Vector> select(DTO dto){
		Vector<Vector> vector = new Vector<>();
		
		JSONObject rootObject = getJsonObject();
		
		
		
		
		
		
		return vector;
	}
	
	
	
}
