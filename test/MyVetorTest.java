package nam.test;

import java.util.Arrays;

public class MyVetorTest {

	public static void main(String[] args) {
		MyVector vec = new MyVector(7);//7¥���� ����
		
		System.out.println("���������?"+vec.capacity());
		System.out.println("������:"+vec.size);
		System.out.println("������:"+Arrays.toString(vec.objArr));
		System.out.println("�����:"+vec.isEmpty());
		System.out.println();
		
		vec.add("�ʻ�");
		System.out.println("������:"+vec.size);
		System.out.println("������:"+Arrays.toString(vec.objArr));
		System.out.println("�����:"+vec.isEmpty());
		System.out.println();
		
		vec.add(2);
		vec.add("��");
	
		System.out.println("�ε���3�� �����ֳ� "+vec.get(3));
		
		vec.remove(4);
		System.out.println("===========================");
		
		System.out.println("������:"+Arrays.toString(vec.objArr));
		System.out.println("������:"+vec.size);
		System.out.println("������:"+vec.size());
		System.out.println("�����:"+vec.isEmpty());
		System.out.println();
		
		vec.add(13);
		System.out.println("������:"+Arrays.toString(vec.objArr));
		System.out.println("������:"+vec.size);
		System.out.println("�����:"+vec.isEmpty());
		System.out.println("�ٻ̾ƺ��� :"+vec.toString());
		System.out.println();
		
		vec.add("����");
		System.out.println("������:"+Arrays.toString(vec.objArr));
		System.out.println("������:"+vec.size);
		System.out.println("�����:"+vec.isEmpty());
		System.out.println("�ٻ̾ƺ��� :"+vec.toString());
		System.out.println();
		
		vec.remove(2);
		vec.remove("��");
		System.out.println("������:"+Arrays.toString(vec.objArr));
		System.out.println("������:"+vec.size);
		System.out.println("�����:"+vec.isEmpty());
		System.out.println("�ٻ̾ƺ��� :"+vec.toString());
		System.out.println();
		
		vec.add("1");
		vec.add("qr");
		
		System.out.println("������:"+Arrays.toString(vec.objArr));
		System.out.println("������:"+vec.size);
		System.out.println("�����:"+vec.isEmpty());
		System.out.println("�ٻ̾ƺ��� :"+vec.toString());
		System.out.println();
		
	}

}
