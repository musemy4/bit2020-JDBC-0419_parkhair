package proj.view;

import java.awt.*;
import javax.swing.*;

import proj.evt.*;
import proj.resourse.R;

public class InputView extends View implements R{
	//�� ���ζ�� �����غ���
	JPanel inputPane =new JPanel(new GridLayout(4,1));
	
	JPanel p1= new JPanel(new GridLayout(3,1));//���� ���� ��ȣ
	JPanel p2= new JPanel(new GridLayout(3,1));//�������̳� �ü��� ����
	JPanel p3= new JPanel(new GridLayout(3,1));//�ݾ� ����
	JPanel p4= new JPanel(new GridLayout(1,4));
	
	
	public JButton inputBtn = new JButton("����Է�");
	public JButton resetBtn = new JButton("�Է����");
	
	public JComboBox<String> designers = new JComboBox(designerstr);
	public JComboBox<String> menus = new JComboBox(menustr);
	public JComboBox<String> services = new JComboBox(servicestr);
	
	public InputView() {
		display();
		evt();
	}
	
	@Override
	void display() {
		p1.setBackground(new Color(255, 255, 255));
		p2.setBackground(new Color(255, 255, 255));
		p3.setBackground(new Color(255, 255, 255));
		p4.setBackground(new Color(255, 255, 255));
			
		// p1:���� ���� ��ȣ
		ButtonGroup g = new ButtonGroup();
		rb_m.setFont(new Font("consolas",Font.PLAIN,10));
		rb_f.setFont(new Font("consolas",Font.PLAIN,10));
		rb_m.setSelected(true);
		g.add(rb_m);
		g.add(rb_f);
		
		rb_m.setBackground(new Color(255, 255, 255));
		rb_f.setBackground(new Color(255, 255, 255));
		
		JLabel name = new JLabel("�̸� :");
		name.setFont(new Font("����",Font.PLAIN,12));
		
		JLabel phone = new JLabel("��ȭ��ȣ :");
		phone.setFont(new Font("����",Font.PLAIN,12));
		
		
		p1.add(rb_m);
		p1.add(rb_f);
		p1.add(name);
		p1.add(tf_name);
		p1.add(phone);
		p1.add(tf_phone);
		
		
		// p2:�������̳� �ü��� ����
		JLabel lbldesigner = new JLabel("�����̳� :");
		lbldesigner.setFont(new Font("����",Font.PLAIN,12));
				
		JLabel lblmenu = new JLabel("�޴� :");
		lblmenu.setFont(new Font("����",Font.PLAIN,12));
	
		JLabel lblservice = new JLabel("���� :");
		lblservice.setFont(new Font("����",Font.PLAIN,12));
		
		
		p2.add(lbldesigner);
		p2.add(designers);
		p2.add(lblmenu);
		p2.add(menus);
		p2.add(lblservice);
		p2.add(services);
		
		
		// p3: �ݾ� ����Ʈ
			
		JLabel pay = new JLabel("�ݾ� :");
		pay.setFont(new Font("����",Font.PLAIN,12));
		
		JLabel point = new JLabel("��������Ʈ :");
		point.setFont(new Font("����",Font.PLAIN,12));
		
		JPanel blank = new JPanel();
		blank.setBackground(new Color(255, 255, 255));
		JPanel blank2 = new JPanel();
		blank2.setBackground(new Color(255, 255, 255));
		
		tf_pay.setText("0");
		tf_point.setText("0.0");
		p3.add(blank);
		p3.add(blank2);
		p3.add(pay);
		p3.add(tf_pay);
		p3.add(point);
		p3.add(tf_point);
		
		
		
		//p4.����Է� �Է���� ��ư
		p4.setLayout(null);
		
		
		inputBtn.setBounds(130, 50, 100, 25);
		resetBtn.setBounds(235, 50, 100, 25);
		p4.add(inputBtn);
		p4.add(resetBtn);
		
		
		
		inputPane.add(p1);
		inputPane.add(p2);
		inputPane.add(p3);
		inputPane.add(p4);
		
		add(inputPane);
		
	}

	@Override
	void evt() {
		ButtonEvt handler = new ButtonEvt(this);
		inputBtn.addActionListener(handler);
		resetBtn.addActionListener(handler);
		
		ComboEvt combo_handler = new ComboEvt(this);
		designers.addActionListener(combo_handler);
		menus.addActionListener(combo_handler);
		services.addActionListener(combo_handler);
		
	}

}
