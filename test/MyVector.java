package nam.test;

public class MyVector {
	
	
	//Q2-1 인스턴스 변수 objArr을 갖는 클래스 선언
	Object[] objArr;
	//Q2-3 객체배열에 저장된 객체의 개수를 저장하기 위한 인스턴스 변수 size, 
	int size;
	
	//Q2-2:기본생성자 (capacity=16)와 생성자를 추가하시오
	public MyVector() {
		objArr=new Object[16];
	}
	
	public MyVector(int capacity) {
		objArr=new Object[capacity];
	}
	
	
	//Q2-3: 저장된 객체의 개수를 반환하는 메서드 size(), 배열objArr의 길이를 반환하는 capacity(), 객체배열이 비었는지 확인하는 isEmpty();
	public int size() {
		int size=0;
		for(int i=0;i<objArr.length;i++) {
			if(objArr[i]!=null) {
				//System.out.println(i+"안비었다!");
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
	
	
	//Q2-4 객체를 추가하는 메서드 void add(Object obj)
	public void add(Object obj) {
		if(size>=objArr.length) {
			System.out.println("더 넣을수 없습니다");
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
	
	//Q2-5 객체배열 objArr에 저장된 객체를 반환하는 Object get(index)
	public Object get(int index) {
		Object obj = new Object();
		if(objArr[index]==null)return null;
		
		obj=objArr[index];	
		
		return obj;
	}


	//Q2-6 객체배열objArr에 저장된 모든 객체를 문자열로 이어서 반환하는 toString()을 오버라이딩하시오
	@Override
	public String toString() {
		String allStr="";
		for(int i=0;i<objArr.length;i++) {
			if(objArr[i]==null)continue;
			allStr+=objArr[i];
		}
		
		return allStr;
	}
	
	//Q2-7 지정된 객체가 저장되어 있는 위치(index)를 반환하는 int indexOf(Object obj)
	public int indexOf(Object obj) {
		for(int idx=0;idx<objArr.length;idx++) {
			if(objArr[idx]==obj) {
				return idx;
			}
		}
		return -1;//없음을 표시
	}
	
	//Q2-8 objArr에서 지정된 객체를 삭제하는 boolean remove(Object obj)
	public boolean remove(Object obj) {
		int idx=indexOf(obj);
		if(idx==-1) {
			System.out.println("뺄게없음");
			return false;
		}
		
		objArr[idx]=null;
		
		size--;
		return true;
	}
	
	
}
