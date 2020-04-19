package miniProj_0417.admin.view;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

import miniProj_0417.admin.evt.ButtonEvt;

public class ButtonView extends View {
	JPanel buttonPane = new JPanel();
	public JButton memberlistBtn=new JButton("회원목록");
	public JButton servicelistBtn=new JButton("서비스내역");
	public JButton servicebackBtn=new JButton("서비스반환");//없던일로
	
	public JButton membersrchBtn = new JButton("회원검색");//회원의 서비스내역만 검색
	public JButton membermodiBtn= new JButton("회원수정");
	public JButton memberdelBtn = new JButton("회원삭제");
	
	
	
	public ButtonView() {
		display();
		evt();
	}
	
	@Override
	void display() {
		buttonPane.setLayout(new GridBagLayout());
		buttonPane.add(memberlistBtn);
		buttonPane.add(servicelistBtn);
		buttonPane.add(servicebackBtn);
		buttonPane.add(membersrchBtn);
		buttonPane.add(membermodiBtn);
		buttonPane.add(memberdelBtn);
		
		memberlistBtn.setBounds(100, 10, 80, 25);
		servicelistBtn.setBounds(90, 10, 80, 25);
		servicebackBtn.setBounds(170, 10, 80, 25);
		membersrchBtn.setBounds(250, 10, 80, 25);
		membermodiBtn.setBounds(330, 10, 80, 25);
		memberdelBtn.setBounds(410, 10, 80, 25);
		
		add(buttonPane);
		
	}

	@Override
	void evt() {
		ButtonEvt handler = new ButtonEvt(this);
		memberlistBtn.addActionListener(handler);
		servicelistBtn.addActionListener(handler);
		servicebackBtn.addActionListener(handler);
		
		membersrchBtn.addActionListener(handler);
		membermodiBtn.addActionListener(handler);
		memberdelBtn.addActionListener(handler);
		
	}

}
