package java_suwop_d21.test.json;

import java.io.*;

import org.json.*;
//���� ����ϱ�
public class Ex01_1 {
	//JSON-in(org.json)
	//GSON-google
	//JSON ���� ���̺귯���� ����.
	
	public static void main(String[] args) throws IOException {
		  // JSONObject, JSONArray, JSONTokener ...
		  // {key:value, key:value ...}
		  // [{...}, {...} ...]
		JSONObject people = new JSONObject();
		people.put("name", "ȫ�浿");
		people.put("email", "hong@naver.com");
		people.put("phone", "010-3333-3333");
		
		JSONArray peopleArr = new JSONArray();
		peopleArr.put(people);//�ϳ��ְ�
		
		System.out.println(peopleArr.toString(2));
		System.out.println("---------------------");
		
		people = new JSONObject();
		people.put("name", "����");
		people.put("email", "kong@naver.com");
		people.put("phone", "010-2222-2222");
		people.put("gender", "male");
		peopleArr.put(people);//��°�ְ�
		
		System.out.println(peopleArr.toString(2));
		System.out.println("---------------------");
		
		people = new JSONObject();
		people.put("name", "����");
		people.put("email", "pot@naver.com");
		people.put("phone", "010-3333-3333");
		peopleArr.put(people);//��°�ְ�
		
		System.out.println(peopleArr.toString(2));
		System.out.println("---------------------");
		
		
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("peopleArr",peopleArr);
		
		jsonObj.put("cnt",2);
		System.out.println(jsonObj.toString(2));
		
		
		//���������
		File file = new File("E:/peoples.json");
		
		if(!file.exists()) {
			if(file.createNewFile()) {
				System.out.println("�� ������ ���� �Ǿ����ϴ�!");
			}
		}
		
		FileWriter fw = new FileWriter(file);
		fw.write(jsonObj.toString(2));
		System.out.println("���� ���� �Ϸ�!");
		if(fw!=null) {
			fw.close();
		}
		
		
	}
	
}
