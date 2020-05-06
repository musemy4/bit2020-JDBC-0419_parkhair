package io2.awt;

import java.awt.*;
import java.awt.event.*;

public class Birds extends Frame implements ActionListener{
	Button[] btns = new Button[25];
	String[] birds= {"����","�η��","Ȳ��","��ѱ�","�����","����",
			"Ÿ��","�ξ���","�û���","���","��","��","������","�ײ�",
			"��","����","������","�ܵ�","��Ȳ","����","��ġ","���","�޹���"
			,"�Ҳ���","���"};
	
	
	public Birds() {
		super("������Ӱ���.. ������");
		
		Panel pane = new Panel();
		add(pane);//�����ӿ� �޾�
		pane.setLayout(new GridLayout(5,5));//5*5��
		
		//��ư
		for(int i=0;i<btns.length;i++) {
			Button btn = new Button(birds[i]);//1.��ư�� �̸�����
			
			btn.setBackground(new Color(247,247,223));
			pane.add(btn);//2.��ư�� ����
			btn.addActionListener(this);//3.��ư�� ������ �̺�Ʈ�� �Ͼ�� ����
		}
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//â�� ũ��
		setSize(300,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x=screen.width/2+this.getWidth()/2;
		int y=screen.height/4;
		
		setLocation(x,y);
		setResizable(false);
		
		
	}//������ end
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn=(Button)e.getSource();
		btn.setBackground(new Color(217,217,196));
		//System.out.println("�ٳ���"+btn.getName());
		String birdName = e.getActionCommand();
		System.out.println(birdName);
		
	}
	
	public static void main(String[] args) {
		new Birds().setVisible(true);
	}


}
