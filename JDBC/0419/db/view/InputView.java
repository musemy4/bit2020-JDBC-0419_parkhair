package miniProj_0417.db.view;

import java.awt.*;
import javax.swing.*;

import miniProj_0417.db.evt.ButtonEvt;
import miniProj_0417.db.evt.PayEvt;
import miniProj_0417.db.resource.R;

public class InputView extends View implements R{
	//다 새로라고 생각해보자
	JPanel inputPane =new JPanel(new GridLayout(3,1));
	
	JPanel p2= new JPanel(new GridLayout(4,1));//담당디자이너, 시술명, 서비스, 상품
	JPanel p3= new JPanel(new GridLayout(4,2));//금액, 예정포인트, 포인트사용?
	JPanel p4= new JPanel();//오늘 날짜,버튼들
	
	public JButton pointBtn = new JButton("포인트적용");
	public JButton listBtn = new JButton("내역보기");
	public JButton payBtn = new JButton("결제하기");
	public JButton resetBtn = new JButton("입력취소");

	
	
	public InputView() {
		display();
		evt();
	}
	
	@Override
	void display() {
		p2.setBackground(new Color(255, 255, 255));
		p3.setBackground(new Color(255, 255, 255));
		p4.setBackground(new Color(255, 255, 255));
			
		
		// p2:담당디자이너 시술명 서비스
		JLabel lbldesigner = new JLabel("디자이너 :");
		lbldesigner.setFont(new Font("굴림",Font.PLAIN,12));
				
		JLabel lblmenu = new JLabel("메뉴 :");
		lblmenu.setFont(new Font("굴림",Font.PLAIN,12));
	
		JLabel lblservice = new JLabel("서비스 :");
		lblservice.setFont(new Font("굴림",Font.PLAIN,12));
		
		JLabel lblitem = new JLabel("상품 :");
		lblitem.setFont(new Font("굴림",Font.PLAIN,12));
		
		
		p2.add(lbldesigner);
		p2.add(designers);
		p2.add(lblmenu);
		p2.add(menus);
		p2.add(lblservice);
		p2.add(services);
		p2.add(lblitem);
		p2.add(items);
		
		
		// p3: 금액 포인트
			
		JLabel pay = new JLabel("총금액 :");
		pay.setFont(new Font("굴림",Font.PLAIN,12));
		
		JLabel point = new JLabel("예정 적립포인트 :");
		point.setFont(new Font("굴림",Font.PLAIN,12));
		
		JLabel usePoint = new JLabel("포인트 사용 :");
		usePoint.setFont(new Font("굴림",Font.PLAIN,12));
		
		JPanel blank = new JPanel();
		blank.setBackground(new Color(255, 255, 255));
		JPanel blank2 = new JPanel();
		blank2.setBackground(new Color(255, 255, 255));
		
		tf_pay.setText("0");
		tf_point.setText("0.0");
		tf_usepoint.setText("0.0");

		p3.add(blank);
		p3.add(blank2);
		p3.add(usePoint);
		p3.add(tf_usepoint);
		p3.add(pay);
		p3.add(tf_pay);
		p3.add(point);
		p3.add(tf_point);
		
		
		
		
		//p4.오늘날짜, 장부입력 입력취소 버튼(2개)
		p4.setLayout(null);
		JLabel when =new JLabel("방문일 : 2020-04-19");
		
		p4.add(when);
		
		p4.add(listBtn);
		p4.add(pointBtn);
		p4.add(payBtn);
		p4.add(resetBtn);

		
		listBtn.setFont(new Font("굴림",Font.PLAIN,10));
		pointBtn.setFont(new Font("굴림",Font.PLAIN,10));
		payBtn.setFont(new Font("굴림",Font.PLAIN,10));
		resetBtn.setFont(new Font("굴림",Font.PLAIN,10));
		
//		payspin.setHorizontalAlignment(JTextField.CENTER);/

		
		when.setBounds(120, 15, 200, 25);
		//payspin.setBounds(100, 5, 100, 25);
		
		listBtn.setBounds(5, 55, 80, 25);
		pointBtn.setBounds(85, 55, 90, 25);
		payBtn.setBounds(175, 55, 80, 25);
		resetBtn.setBounds(255, 55, 80, 25);
		
		
		
	
		inputPane.add(p2);
		inputPane.add(p3);
		inputPane.add(p4);
		
		add(inputPane);
		
	}

	@Override
	void evt() {
		ButtonEvt handler = new ButtonEvt(this);
		listBtn.addActionListener(handler);
		pointBtn.addActionListener(handler);
		payBtn.addActionListener(handler);
		resetBtn.addActionListener(handler);
		
		
		PayEvt payhandler = new PayEvt(this);
		designers.addActionListener(payhandler);
		menus.addActionListener(payhandler);
		services.addActionListener(payhandler);
		items.addActionListener(payhandler);
		
		
	}

}
