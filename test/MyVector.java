package nam.test;

public class MyVector {
	
	
	//Q2-1 �ν��Ͻ� ���� objArr�� ���� Ŭ���� ����
	Object[] objArr;
	//Q2-3 ��ü�迭�� ����� ��ü�� ������ �����ϱ� ���� �ν��Ͻ� ���� size, 
	int size;
	
	//Q2-2:�⺻������ (capacity=16)�� �����ڸ� �߰��Ͻÿ�
	public MyVector() {
		objArr=new Object[16];
	}
	
	public MyVector(int capacity) {
		objArr=new Object[capacity];
	}
	
	
	//Q2-3: ����� ��ü�� ������ ��ȯ�ϴ� �޼��� size(), �迭objArr�� ���̸� ��ȯ�ϴ� capacity(), ��ü�迭�� ������� Ȯ���ϴ� isEmpty();
	public int size() {
		int size=0;
		for(int i=0;i<objArr.length;i++) {
			if(objArr[i]!=null) {
				//System.out.println(i+"�Ⱥ����!");
				size++;
			}
		}
		
		return size;
	}
	
	
	public int capacity() {
		int capacity=objArr.length;
		return capacity;
	}
	
	
	public boolean isEmpty() {
		for(int i=0;i<objArr.length;i++) {
			if(objArr[i]!=null)return false;
		}
			
		return true;
	}
	
	
	//Q2-4 ��ü�� �߰��ϴ� �޼��� void add(Object obj)
	public void add(Object obj) {
		if(size>=objArr.length) {
			System.out.println("�� ������ �����ϴ�");
			return;
		}
		
		for(int i=0;i<objArr.length;i++) {
			if(objArr[i]==null) {
				objArr[i]=obj;
				break;
			}
		}
			size++;
	}
	
	//Q2-5 ��ü�迭 objArr�� ����� ��ü�� ��ȯ�ϴ� Object get(index)
	public Object get(int index) {
		Object obj = new Object();
		if(objArr[index]==null)return null;
		
		obj=objArr[index];	
		
		return obj;
	}


	//Q2-6 ��ü�迭objArr�� ����� ��� ��ü�� ���ڿ��� �̾ ��ȯ�ϴ� toString()�� �������̵��Ͻÿ�
	@Override
	public String toString() {
		String allStr="";
		for(int i=0;i<objArr.length;i++) {
			if(objArr[i]==null)continue;
			allStr+=objArr[i];
		}
		
		return allStr;
	}
	
	//Q2-7 ������ ��ü�� ����Ǿ� �ִ� ��ġ(index)�� ��ȯ�ϴ� int indexOf(Object obj)
	public int indexOf(Object obj) {
		for(int idx=0;idx<objArr.length;idx++) {
			if(objArr[idx]==obj) {
				return idx;
			}
		}
		return -1;//������ ǥ��
	}
	
	//Q2-8 objArr���� ������ ��ü�� �����ϴ� boolean remove(Object obj)
	public boolean remove(Object obj) {
		int idx=indexOf(obj);
		if(idx==-1) {
			System.out.println("���Ծ���");
			return false;
		}
		
		objArr[idx]=null;
		
		size--;
		return true;
	}
	
	
}
