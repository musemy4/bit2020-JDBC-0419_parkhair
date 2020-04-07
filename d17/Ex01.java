package suwop.w4.d17;

import java.util.*;

public class Ex01 {
	private StringBuffer buffer;
	
	Scanner sc=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	private String word;
	private StringTokenizer token;//��������
	private String key, value;
	
	public Ex01() {
		play();	
	}
	
	public void play() {
		System.out.print(">> ");
		String str=sc.nextLine();//������ ����ְ�
		
		//��Ʈ������: ����� ���ڿ��� ������ �����ϴ�. ���ڿ��� ũ�Ⱑ �þ�� ���� ���� ũ�⸦ �ڵ� ����
		
		
		buffer = new StringBuffer(str);//��Ʈ�� ���۸� �����ϰ�
		System.out.println(buffer);
		
		while(true) {
			System.out.println("���:");
			word=sc2.next();
			
			if(word.equals("�׸�")) {
				System.out.println("�����մϴ�");
				System.exit(0);
			}
			token = new StringTokenizer(word,"!");//���� ����� !�� ¥��
			if(token.countTokens()!=2) {//��ū�� ���� ���⵵�� ��~
				System.out.println("�߸��� ����Դϴ�");
			} else {
				key=token.nextToken();//!�� �߽������ϳ��� Ű��
				value=token.nextToken();//value������ ���
				
				int start=buffer.indexOf(key);
				if(start ==-1) {
					System.out.println("ã�� �� �����ϴ�");
				} else {
					StringTokenizer st = new StringTokenizer(new String(buffer)," ");
					boolean flag = false;
					while(st.hasMoreTokens()) {
						if(key.equals(st.nextToken())){
							flag=true;
							break;
						}
					}
					if(flag) {
						int end=start+key.length();
						buffer.replace(start, end, value);
						System.out.println(buffer);
					} else {
						System.out.println("ã�� �� �����ϴ�!");
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
	
	
}
