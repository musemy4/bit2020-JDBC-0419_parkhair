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
	
	
	//�츮�� DAO�� JSON�� �̿��ؼ� ������ �����ҰŴ�
	private JSONObject getJsonObject() {//��ü�� �����´�?
		File dataFile = new File(pathname);
		
		try {
			reader = new FileReader(dataFile);
			JSONTokener token = new JSONTokener(reader);//��ŭ�� �ڸ���
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
			System.out.println("ó���� �����Ͱ� �����ϴ�");
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
		
		//1.������ ������
		if(!file.exists()) {
			JSONObject newObj = new JSONObject();
			//�������� dto�� JSONObjectȭ ��
			newObj.put("no",dto.getIdx());
			newObj.put("name",dto.getName());
			newObj.put("phone",dto.getPhone());
			newObj.put("email",dto.getEmail());
			
			JSONArray newArray = new JSONArray();
			newArray.put(newObj);
			
			//Array�� ��� ����ū jsonObject
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("seq", 2);//seq:������ �ð�
			jsonObject.put("memberArr", newArray);
			
			
			//json���Ͽ� ������
			try {
				writer=new FileWriter(file);
				writer.write(jsonObject.toString(2));
				System.out.println("���������强��!");
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
			
		}//1.�����̾����� ��
		
		//2.������ ������ ���� ��ü�� ����???
		JSONObject jsonObject = getJsonObject();
		if(jsonObject==null) {
			System.out.println("ó���� �����Ͱ� �����ϴ�!");
			return;
		}
		
		//3.�ڷᰡ �̹� ������ ����		
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
