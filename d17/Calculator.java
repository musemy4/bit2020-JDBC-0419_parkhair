package suwop.w4.d18.swing$;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {

	private TextField input;//�۾����°�
	private Button bt;
	private boolean state=true;//���ڸ� �������� ���������� ����.
	private int op;//�����ȣ
	private double buffer;//���� �����
	private boolean opstate=true;//�����ڸ� �������� ���������� ����. �������� ������ true
	
	//������
	public Calculator() {
		super("AWT����");
	
		//�г��� �ΰ��Դϴٿ�
		Panel main = new Panel();//��ü�Ƕ���
		main.setLayout(new BorderLayout());//�������� ���̾ƿ�
		input=new TextField();
		main.add("North",input);//����⿡ �۾����°� �����
		
		Panel p = new Panel();//��ư�޸��Ƕ���
		p.setLayout(new GridLayout(4,4));//�׸��� �����ִ� ���̾ƿ�
		
		//��ư �����ϰ� �̺�Ʈ ������ �����ϱ�
		String s="789+456-123*0C=/"; //4*4�κ�
		for(int i=0;i<s.length();i++) {
			bt=new Button(s.substring(i,i+1));//��ư�۾� �Է��� ������
			p.add(bt);
			bt.addActionListener(this);
		}
		
		main.add("Center",p);//��ü�Ƕ��⿡ �ް�
		add(main);//��ü�Ƕ��⵵ ����
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(250,180);
		setVisible(true);
	
	}//�����ڳ�
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String val=e.getActionCommand();//�̺�Ʈ�� �߻��� ��ư�� ���ڿ��� ����
		if(val.equals("C")) {
			input.setText("0");//�������� ���� 0���� �ʱ�ȭ�ϰ�
			buffer=0;//��������ҵ� 0���� �ʱ�ȭ����
		} else if('0'<=val.charAt(0)&&val.charAt(0)<='9') {//**���ڰ� ������
			if(state)input.setText(val); //���ڰ� �������� ��������
			else input.setText(input.getText()+val);//���� ���ڰ� �������� �ڿ� ���δ�. 
			state=false;//���ڰ� �������� ���� ���ڴ� ���Է��Ѵ�~ 
		} else operator(val);//**�����ڰ� ������ 
		
	}//actionperformed end
	
	
	public void operator(String val) {
		if(val.equals("+")) {
			op=1;//���ϱ�� 1)
			opstate=true;//�ѳ����� �����
		} else if(val.equals("-")) {
			op=2;//-�� 2)
			opstate=true;
		} else if(val.equals("*")) {
			op=3;//*�� 3)
			opstate=true;
		} else if(val.equals("/")) {
			op=4;// /�� 4)
			opstate=true;
		} else {
			result();
		}
		
		//���� ����ҿ� �ִ��͵� �Ǽ�ȭ�Ѵ�
		buffer=(new Double(input.getText())).doubleValue();
		state=true;//���� ���� ���ü�����~
	}
	
	//=�� ������ ����Ǵ� �޼���
	public void result() {
		double result=0;
		//�Ǽ������� ��ڽ��Ѵ�
		double in=(new Double(input.getText())).doubleValue();
		switch(op) {
		case 1: result=buffer+in;break;
		case 2: result=buffer-in;break;
		case 3: result=buffer*in;break;
		case 4: result=buffer/in;break;
		}
		//�ٽ� ����ȭ
		input.setText(result+"");
		opstate=false;
	}
		
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
	}

}
