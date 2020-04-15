package model;

import java.io.*;
import java.util.Vector;

import javax.swing.JOptionPane;

import org.json.*;

//실제 자료집의 역할을 하는 json과의 연결 담당
public class DAO {
	
	//싱글톤
	private DAO() {};
	
	private static DAO instance;
	
	public static DAO getInstance() {
		if(instance==null) 
			instance=new DAO();
		
		return instance;
	}
	
	//json에서 가져올준비
	private String pathname="src/member.json";
	private FileReader reader;
	private FileWriter writer;
	
	//제이슨파일에서 기존 멤버들을 끌어올 메서드
	private JSONObject getJsonObject() {
		//설정한 패쓰에서 가져와서 파일생성
		File jsonFile = new File(pathname);
		
		try {
			reader = new FileReader(jsonFile);
			JSONTokener token = new JSONTokener(reader);
			return new JSONObject(token);//어레이를 여기서 뽑아쓸것임
			
		} catch (Exception e) {
			System.out.println("파일이 없습니다!");
		}
		return null;
	}
	
	//제이슨에서 받아서 벡터로 처리해서 컨트롤러에 보낸다
	public Vector<Vector> selectAll(){
		JSONObject jsonObject = getJsonObject();
		if(jsonObject==null) {
			System.out.println("처리할 데이터가 없습니다");
			return null;
		}
		
		JSONArray jsonArray = jsonObject.getJSONArray("memberArr");
		Vector<Vector> members = new Vector<>();
		for(int i=0;i<jsonArray.length();i++) {
			JSONObject obj = jsonArray.getJSONObject(i);
			Vector v = new Vector<>();
			v.add(obj.get("no"));
			v.add(obj.get("name"));
			v.add(obj.get("phone"));
			v.add(obj.get("email"));
			members.add(v);
		}
			
		return members;
	}
	
	
	public void insert(DTO dto) {
		File file = new File(pathname);
		JSONObject wangjsonObj;
		//파일에 데이터가 하나도 없으면
		if(!file.exists()) {
			JSONObject newObj =new JSONObject();
			newObj.put("no", 1);
			newObj.put("name", dto.getName());
			newObj.put("phone", dto.getPhone());
			newObj.put("email", dto.getEmail());
			
			JSONArray newArray = new JSONArray();
			newArray.put(newObj);
			
			wangjsonObj = new JSONObject();
			wangjsonObj.put("seq", 2);
			wangjsonObj.put("memberArr", newArray);
		} else {
			//기존파일에 있는것을 끌어옴
			wangjsonObj =getJsonObject();
			
			JSONArray newmemberArr = wangjsonObj.getJSONArray("memberArr");
			//새 멤버를 넣을 오브젝트생성
			JSONObject obj = new JSONObject();
			int seq = wangjsonObj.getInt("seq");
			obj.put("no", seq++);
			obj.put("name", dto.getName());
			obj.put("phone", dto.getPhone());
			obj.put("email", dto.getEmail());
			//어레이에 넣고
			newmemberArr.put(obj);
			
			wangjsonObj = new JSONObject();
			wangjsonObj.put("memberArr",newmemberArr);
			wangjsonObj.put("seq", seq);
		}
				
		try {
			writer = new FileWriter(file);
			writer.write(wangjsonObj.toString(2));
			System.out.println("저장성공!");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(reader!=null)reader.close();
				if(writer!=null)writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return;
	
		
	}//insert end
	
	public Vector<Vector> select(DTO dto){
		Vector<Vector> selects = new Vector<>();
		
		JSONObject wangObj = getJsonObject();
		JSONArray memberArr = wangObj.getJSONArray("memberArr");
		for(int i=0;i<memberArr.length();i++) {
			JSONObject obj = memberArr.getJSONObject(i);
			//입력된 이름이 있고
			if((dto.getName().length()!=0//정보의 이름중에서 있을때
					&&obj.get("name").toString().indexOf(dto.getName())!=-1)) {
				Vector v = new Vector<>();
				v.add(obj.get("no"));
				v.add(obj.get("name"));
				v.add(obj.get("phone"));
				v.add(obj.get("email"));
				selects.add(v);
			}
		}
		
		return selects;
	}
	
	public void delete(DTO dto) {
		
		JSONObject wangObj = getJsonObject();
		JSONArray memberArr = wangObj.getJSONArray("memberArr");
		int seq= wangObj.getInt("seq");
		for(int i=0;i<memberArr.length();i++) {
			JSONObject target = memberArr.getJSONObject(i);
			if(dto.getNo()==target.getInt("no")){
				memberArr.remove(i);
			}
		}
		
		
		//그리고 새로 업데이트해야함
		
		try {
			File file=new File(pathname);
			writer=new FileWriter(file);
			writer.write(wangObj.toString(2));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				if(writer!=null)writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}//delete end
	
	public void modify(DTO dto) {
		
		JSONObject wangObj = getJsonObject();
		JSONArray array = wangObj.getJSONArray("memberArr");
		int no = dto.getNo();
		int sel =0;
		for(int i=0;i<array.length();i++) {
			JSONObject obj = array.getJSONObject(i);
			if(no==obj.getInt("no")) {
				
			}
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
