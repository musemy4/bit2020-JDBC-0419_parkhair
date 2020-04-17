package proj.view;

import java.awt.*;
import javax.swing.*;

import proj.evt.*;
import proj.resourse.R;

public class InputView extends View implements R{
	//다 새로라고 생각해보자
	JPanel inputPane =new JPanel(new GridLayout(4,1));
	
	JPanel p1= new JPanel(new GridLayout(3,1));//성별 고객명 번호
	JPanel p2= new JPanel(new GridLayout(3,1));//담당디자이너 시술명 서비스
	JPanel p3= new JPanel(new GridLayout(3,1));//금액 서비스
	JPanel p4= new JPanel(new GridLayout(1,4));
	
	
	public JButton inputBtn = new JButton("장부입력");
	public JButton resetBtn = new JButton("입력취소");
	
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
			
		// p1:성별 고객명 번호
		ButtonGroup g = new ButtonGroup();
		rb_m.setFont(new Font("consolas",Font.PLAIN,10));
		rb_f.setFont(new Font("consolas",Font.PLAIN,10));
		rb_m.setSelected(true);
		g.add(rb_m);
		g.add(rb_f);
		
		rb_m.setBackground(new Color(255, 255, 255));
		rb_f.setBackground(new Color(255, 255, 255));
		
		JLabel name = new JLabel("이름 :");
		name.setFont(new Font("굴림",Font.PLAIN,12));
		
		JLabel phone = new JLabel("전화번호 :");
		phone.setFont(new Font("굴림",Font.PLAIN,12));
		
		
		p1.add(rb_m);
		p1.add(rb_f);
		p1.add(name);
		p1.add(tf_name);
		p1.add(phone);
		p1.add(tf_phone);
		
		
		// p2:담당디자이너 시술명 서비스
		JLabel lbldesigner = new JLabel("디자이너 :");
		lbldesigner.setFont(new Font("굴림",Font.PLAIN,12));
				
		JLabel lblmenu = new JLabel("메뉴 :");
		lblmenu.setFont(new Font("굴림",Font.PLAIN,12));
	
		JLabel lblservice = new JLabel("서비스 :");
		lblservice.setFont(new Font("굴림",Font.PLAIN,12));
		
		
		p2.add(lbldesigner);
		p2.add(designers);
		p2.add(lblmenu);
		p2.add(menus);
		p2.add(lblservice);
		p2.add(services);
		
		
		// p3: 금액 포인트
			
		JLabel pay = new JLabel("금액 :");
		pay.setFont(new Font("굴림",Font.PLAIN,12));
		
		JLabel point = new JLabel("적립포인트 :");
		point.setFont(new Font("굴림",Font.PLAIN,12));
		
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
		
		
		
		//p4.장부입력 입력취소 버튼
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
