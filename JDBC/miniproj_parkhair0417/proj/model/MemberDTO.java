package proj.model;

import proj.resourse.R;

//ȸ������
public class MemberDTO implements R{
	
	private int no;//�̰� DB���� �ڵ����� ó��
	private String idx="JK10";//ȸ��������ȣ
	private String name;
	private String gender;
	private String phone;
	private String membership;
	private int visits;
	private int point;
	private int accumPoint;//�̰ɷ� ����� �Ű���
	
	//ȸ���� �����ɶ� 
	public MemberDTO(String name,String gender,String phone) {
		int todaynum=listController.getTodaysNum();
		this.idx=idx+todaynum;
		this.name=name;
		this.gender=gender;
		this.phone=phone;
		this.membership="Silver";
		this.visits=1;
		this.point=0;
		this.accumPoint=0;
		
	}

	//���ͼ���

	//����Ʈ�� �ؾ��ϳ�//
	
}
