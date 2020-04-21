package nam.test;

import java.util.Arrays;

public class MyVetorTest {

	public static void main(String[] args) {
		MyVector vec = new MyVector(7);//7짜리로 만듬
		
		System.out.println("몇개까지가능?"+vec.capacity());
		System.out.println("몇개들었냐:"+vec.size);
		System.out.println("현상태:"+Arrays.toString(vec.objArr));
		System.out.println("비었냐:"+vec.isEmpty());
		System.out.println();
		
		vec.add("십사");
		System.out.println("몇개들었냐:"+vec.size);
		System.out.println("현상태:"+Arrays.toString(vec.objArr));
		System.out.println("비었냐:"+vec.isEmpty());
		System.out.println();
		
		vec.add(2);
		vec.add("삼");
	
		System.out.println("인덱스3에 뭐가있냐 "+vec.get(3));
		
		vec.remove(4);
		System.out.println("===========================");
		
		System.out.println("현상태:"+Arrays.toString(vec.objArr));
		System.out.println("몇개들었냐:"+vec.size);
		System.out.println("몇개들었냐:"+vec.size());
		System.out.println("비었냐:"+vec.isEmpty());
		System.out.println();
		
		vec.add(13);
		System.out.println("현상태:"+Arrays.toString(vec.objArr));
		System.out.println("몇개들었냐:"+vec.size);
		System.out.println("비었냐:"+vec.isEmpty());
		System.out.println("다뽑아보자 :"+vec.toString());
		System.out.println();
		
		vec.add("오십");
		System.out.println("현상태:"+Arrays.toString(vec.objArr));
		System.out.println("몇개들었냐:"+vec.size);
		System.out.println("비었냐:"+vec.isEmpty());
		System.out.println("다뽑아보자 :"+vec.toString());
		System.out.println();
		
		vec.remove(2);
		vec.remove("삼");
		System.out.println("현상태:"+Arrays.toString(vec.objArr));
		System.out.println("몇개들었냐:"+vec.size);
		System.out.println("비었냐:"+vec.isEmpty());
		System.out.println("다뽑아보자 :"+vec.toString());
		System.out.println();
		
		vec.add("1");
		vec.add("qr");
		
		System.out.println("현상태:"+Arrays.toString(vec.objArr));
		System.out.println("몇개들었냐:"+vec.size);
		System.out.println("비었냐:"+vec.isEmpty());
		System.out.println("다뽑아보자 :"+vec.toString());
		System.out.println();
		
	}

}
